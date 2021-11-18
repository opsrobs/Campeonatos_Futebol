package Controller;
import Clubes_Campeonatos.Campeonato;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoCampeonato {
    
private final Conexao conexao = new Conexao();
 
 public void insert(Campeonato campeonato) throws SQLException{
     Connection con = conexao.getConexao();
    //inserir o nome (o indice começa no 1)
    try (PreparedStatement pst = con.prepareStatement
                ("insert into campeonato (Codigo, Nome, Data_Inicio, Data_Fim, Categoria_Codigo) " +
                 "values (0,?,?,?,?) ")) {
        pst.setString(1, campeonato.getNome());
        pst.setDate(2, new java.sql.Date(campeonato.getDataInicio().getTime()));
        pst.setDate(3, new java.sql.Date(campeonato.getDataFim().getTime()));
        pst.setInt(4, campeonato.getCatCod());
        //
        
        //usar sempre pra inserir ou modificar dado na tabela
        pst.executeUpdate();
        
        Statement st = con.createStatement(); 
     
        ResultSet rs = st.executeQuery("select last_insert_id()") ;
            
        if (rs.next()){
            campeonato.setCodigo(rs.getInt(1));
         }        
    }
     conexao.close();
 }

public void update(Campeonato campeonato)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement
                ("update campeonato set Nome = ?, Data_Inicio = ?, Data_Fim =?,  Categoria_Codigo = ? where (codigo = ?)")) {
        pst.setString(1, campeonato.getNome());
        pst.setDate(2, new java.sql.Date(campeonato.getDataInicio().getTime()));
        pst.setDate(3, new java.sql.Date(campeonato.getDataFim().getTime()));
        pst.setInt(4, campeonato.getCatCod());
        pst.setInt(5, campeonato.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();
 }

 public void delete(Campeonato campeonato)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from campeonato where (codigo = ?)")) {
        pst.setInt(1, campeonato.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();  
 }

 public Campeonato getUsuarioByCodigo(int codigo)throws SQLException{
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from campeonato where (codigo = " + codigo + ")")) {
         
        rs.first();
        return new Campeonato(rs.getInt("codigo"),
                            rs.getString("Nome"),
                            rs.getDate("Data_Inicio"),
                            rs.getDate("Data_Fim"),
                            rs.getInt("Categoria_Codigo"));
    }
 }

  public ArrayList<Campeonato> getCompromissoByLista()throws SQLException{
      ArrayList<Campeonato> lista = new ArrayList<>();
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from campeonato order by Nome")) {
         
        while (rs.next()){
          lista.add(new Campeonato(rs.getInt("codigo"),
                rs.getString("Nome"),
                rs.getDate("Data_Inicio"),
                rs.getDate("Data_Fim"),
                rs.getInt("Categoria_Codigo")));
        }
    }
    
     return lista;
 }
 
}
