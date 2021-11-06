package Controller;
import Clubes_Campeonatos.Jogador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoJogador {
    
private final Conexao conexao = new Conexao();
 
 public void insert(Jogador jogador) throws SQLException{
     Connection con = conexao.getConexao();
    //inserir o nome (o indice começa no 1)
    try (PreparedStatement pst = con.prepareStatement
                ("insert into jogadore (codigo, Clubes_Codigo, Nome, Data_Nasc, Posicao, Pais) " +
                 "values (0,?,?,?,?,?) ")) {
        pst.setInt(1, jogador.getCodClube());
        pst.setString(2, jogador.getNome());
        pst.setDate(3, new java.sql.Date(jogador.getDataNasc().getTime()));
        pst.setString(4, jogador.getPosicao());
        pst.setString(5, jogador.getPais());
        //
        
        //usar sempre pra inserir ou modificar dado na tabela
        pst.executeUpdate();
        
        Statement st = con.createStatement(); 
     
        ResultSet rs = st.executeQuery("select last_insert_id()") ;
            
        if (rs.next()){
            jogador.setCodigo(rs.getInt(1));
         }        
    }
     conexao.close();
 }

public void update(Jogador jogador)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement
                ("update jogadore set Clubes_Codigo = ?, Nome = ?, Data_Nasc =?, Posicao, Pais = ? where (Codigo = ?)")) {
        pst.setInt(1, jogador.getCodClube());
        pst.setString(2, jogador.getNome());
        pst.setDate(3, new java.sql.Date(jogador.getDataNasc().getTime()));
        pst.setString(4, jogador.getPosicao());
        pst.setString(5, jogador.getPais());
        pst.setInt(6, jogador.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();
 }

 public void delete(Jogador jogador)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from jogadore where (Codigo = ?)")) {
        pst.setInt(1, jogador.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();  
 }

 public Jogador getUsuarioByCodigo(int codigo)throws SQLException{
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from jogadore where (Codigo = " + codigo + ")")) {
         
        rs.first();
        return new Jogador(rs.getInt("Codigo"),
                            rs.getInt("Clubes_Codigo"),
                            rs.getString("Nome"),
                            rs.getDate("Data_Nasc"),
                            rs.getString("Posicao"),
                            rs.getString("Pais"));
    }
 }

  public ArrayList<Jogador> getCompromissoByLista()throws SQLException{
      ArrayList<Jogador> lista = new ArrayList<>();
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from jogadore order by Nome")) {
         
        while (rs.next()){
          lista.add(new Jogador(rs.getInt("codigo"),
                rs.getInt("Clubes_Codigo"),
                rs.getString("Nome"),
                rs.getDate("Data_Nasc"),
                rs.getString("Posicao"),
                rs.getString("Pais")));
        }
    }
    
     return lista;
 }
 
}
