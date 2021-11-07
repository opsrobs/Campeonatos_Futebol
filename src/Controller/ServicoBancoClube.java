package Controller;
import Clubes_Campeonatos.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoClube {
    
private final Conexao conexao = new Conexao();
 
 public void insert(Clube clube) throws SQLException{
     Connection con = conexao.getConexao();
    //inserir o nome (o indice começa no 1)
    try (PreparedStatement pst = con.prepareStatement
                ("insert into clube (Codigo, Nome, Mascote, Categoria_Codigo) " +
                 "values (0,?,?,?) ")) {
        pst.setString(1,clube.getNome());
        pst.setString(2,clube.getMascote());
        pst.setInt(3,clube.getCodCategoria());
        
        //usar sempre pra inserir ou modificar dado na tabela
        pst.executeUpdate();
        
        Statement st = con.createStatement(); 
     
        ResultSet rs = st.executeQuery("select last_insert_id()") ;
            
        if (rs.next()){
            clube.setCodigo(rs.getInt(1));
         }        
    }
     conexao.close();
 }

public void update(Clube clube)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement
                ("update clube set Nome = ?, Mascote = ?, Categoria_Codigo =? where (codigo = ?)")) {
        pst.setString(1,clube.getNome());
        pst.setString(2,clube.getMascote());
        pst.setInt(3, clube.getCodCategoria());
        pst.setInt(4, clube.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();
 }

 public void delete(Clube clube)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from campeonatos where (codigo = ?)")) {
        pst.setInt(1, clube.getCodigo());
        pst.executeUpdate();
    }
     conexao.close();  
 }

 public Clube getUsuarioByCodigo(int codigo)throws SQLException{
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from clube where (codigo = " + codigo + ")")) {
         
        rs.first();
        return new Clube(rs.getInt("codigo"),
                            rs.getString("Nome"),
                            rs.getString("Mascote"),
                            rs.getInt("Categoria_Codigo"));
    }
 }

  public ArrayList<Clube> getCompromissoByLista()throws SQLException{
      ArrayList<Clube> lista = new ArrayList<>();
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from clube order by codigo")) {
         
        while (rs.next()){
          lista.add(new Clube(rs.getInt("codigo"),
                  rs.getString("Nome"),
                rs.getString("Mascote"),
                rs.getInt("Categoria_Codigo")));
        }
    }
    
     return lista;
 }
 
}
