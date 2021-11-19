package Controller;
import Clubes_Campeonatos.Jogo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoJogo {
    
private final Conexao conexao = new Conexao();
 
 public void insert(Jogo jogo) throws SQLException{
     Connection con = conexao.getConexao();
    //inserir o nome (o indice começa no 1)
    try (PreparedStatement pst = con.prepareStatement
                ("insert into jogo (codigo, Campeonatos_codigo, Data_Jogo, Hora_Jogo, Clube_Casa,Gol_Casa, Clube_Visitante, Gol_Visitante, Local_Jogo) " +
                 "values (0,?,?,?,?,?,?,?,?) ")) {
        pst.setInt(1, jogo.getCodCampeonato());
        pst.setDate(2, new java.sql.Date(jogo.getDataJogo().getTime()));
        pst.setTime(3, new java.sql.Time(jogo.getHoraJogo().getTime()));
        pst.setInt(4, jogo.getClubeCasa());
        pst.setInt(5, jogo.getGolCasa());
        pst.setInt(6, jogo.getClubefora());
        pst.setInt(7, jogo.getGolVisitante());
        pst.setString(8, jogo.getLocalJogo());
        //
        
        //usar sempre pra inserir ou modificar dado na tabela
        pst.executeUpdate();
        
        Statement st = con.createStatement(); 
     
        ResultSet rs = st.executeQuery("select last_insert_id()") ;
            
        if (rs.next()){
            jogo.setCodigo(rs.getInt(1));
         }        
    }
     conexao.close();
 }

public void update(Jogo jogo)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement
                ("update jogo set data = ?, hora = ?, descricao =?, situacao = ? where (codigo = ?)")) {
        pst.setInt(1, jogo.getCodCampeonato());
        pst.setDate(2, new java.sql.Date(jogo.getDataJogo().getTime()));
        pst.setTime(3, new java.sql.Time(jogo.getHoraJogo().getTime()));
        pst.setInt(4, jogo.getClubeCasa());
        pst.setInt(5, jogo.getGolCasa());
        pst.setInt(6, jogo.getClubefora());
        pst.setInt(7, jogo.getGolVisitante());
        pst.setString(8, jogo.getLocalJogo());
        pst.setInt(9, jogo.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();
 }

 public void delete(Jogo jogo)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from jogo where (codigo = ?)")) {
        pst.setInt(1, jogo.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();  
 }

 public Jogo getUsuarioByCodigo(int codigo)throws SQLException{
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from jogo where (codigo = " + codigo + ")")) {
         
        rs.first();
        return new Jogo(rs.getInt("codigo"),
                            rs.getInt("Campeonatos_codigo"),
                            rs.getDate("Data_Jogo"),
                            rs.getTime("Hora_Jogo"),
                            rs.getInt("Clube_Casa"),
                            rs.getInt("Gol_Casa"),
                            rs.getInt("Clube_Visitante"),
                            rs.getInt("Gol_Visitante"),
                            rs.getString("Local_Jogo"));
    }
 }

  public ArrayList<Jogo> getCompromissoByLista()throws SQLException{
      ArrayList<Jogo> lista = new ArrayList<>();
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from jogo order by Hora_Jogo")) {
         
        while (rs.next()){
          lista.add(new Jogo(rs.getInt("codigo"),
                  rs.getInt("Campeonatos_codigo"),
                            rs.getDate("Data_Jogo"),
                            rs.getTime("Hora_Jogo"),
                            rs.getInt("Clube_Casa"),
                            rs.getInt("Gol_Casa"),
                            rs.getInt("Clube_Visitante"),
                            rs.getInt("Gol_Visitante"),
                            rs.getString("Local_Jogo")));
        }
    }
    
     return lista;
 }
 
}
