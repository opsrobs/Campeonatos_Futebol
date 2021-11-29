package Controller;
import Clubes_Campeonatos.Clubes_Campeonatos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoClubeCampeonato {
    
private final Conexao conexao = new Conexao();
 
 public void insert(Clubes_Campeonatos clubes_Campeonatos) throws SQLException{
     Connection con = conexao.getConexao();
    //inserir o nome (o indice começa no 1)
    try (PreparedStatement pst = con.prepareStatement
                ("insert into Clubes_Campeonato (codigo, Clube_Codigo, Campeonato_Codigo, Vitorias, Derrotas, Emaptes,Gols_Pro,"
                        + " Gols_Contra, Cartoes_Amarelo,Cartoes_Vermelho) " +
                 "values (0,?,?,?,?,?,?,?,?,?) ")) {
        pst.setInt(1, clubes_Campeonatos.getCodClube());
        pst.setInt(2, clubes_Campeonatos.getCodCampeonato());
        pst.setInt(3, clubes_Campeonatos.getVitorias());
        pst.setInt(4, clubes_Campeonatos.getDerrotas());
        pst.setInt(5, clubes_Campeonatos.getEmpates());
        pst.setInt(6, clubes_Campeonatos.getGolsPro());
        pst.setInt(7, clubes_Campeonatos.getGolsContra());
        pst.setInt(8, clubes_Campeonatos.getCartoesAmarelo());
        pst.setInt(9, clubes_Campeonatos.getCartoesVermelho());
        //
        
        //usar sempre pra inserir ou modificar dado na tabela
        pst.executeUpdate();
        
        Statement st = con.createStatement(); 
     
//        ResultSet rs = st.executeQuery("select last_insert_id()") ;
//            
//        if (rs.next()){
//            clubes_Campeonatos.setCodigo(rs.getInt(1));
//         }        
    }
     conexao.close();
 }

public void update(Clubes_Campeonatos clubes_Campeonatos)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement
                ("update Clubes_Campeonato set Clubes_Codigo = ?,Campeonatos_codigo = ?, Vitorias = ?, Derrotas = ?, Emaptes =?, Gols_Pro, Gols_Contra = ?, Cartoes_Amarelo =?, Cartoes_Vermelho = ?  where (codigo = ?)")) {
        pst.setInt(1, clubes_Campeonatos.getCodClube());
        pst.setInt(2, clubes_Campeonatos.getCodCampeonato());
        pst.setInt(3, clubes_Campeonatos.getVitorias());
        pst.setInt(4, clubes_Campeonatos.getDerrotas());
        pst.setInt(5, clubes_Campeonatos.getEmpates());
        pst.setInt(6, clubes_Campeonatos.getGolsPro());
        pst.setInt(7, clubes_Campeonatos.getGolsContra());
        pst.setInt(8, clubes_Campeonatos.getCartoesAmarelo());
        pst.setInt(9, clubes_Campeonatos.getCartoesVermelho());
        pst.setInt(10, clubes_Campeonatos.getCartoesVermelho());
        pst.executeUpdate();
    }
     conexao.close();
 }

 public void delete(Clubes_Campeonatos clubes_Campeonatos)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from Clubes_Campeonato where (Clubes_Codigo = ?,Campeonatos_codigo = ?)")) {
        pst.setInt(1, clubes_Campeonatos.getCodClube());
        pst.setInt(2, clubes_Campeonatos.getCodCampeonato());
        pst.executeUpdate();
    }
     conexao.close();  
 }

 public Clubes_Campeonatos getClubeCampeonato(int codigo, int codCamp)throws SQLException{
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from Clubes_Campeonato where (Clubes_Codigo = " + codigo + ",Campeonatos_codigo"+ codCamp +"")) {
         
        rs.first();
        return new Clubes_Campeonatos(rs.getInt("Clubes_Codigo"),
                            rs.getInt("Campeonatos_codigo"),
                            rs.getInt("Vitorias"),
                            rs.getInt("Derrotas"),
                            rs.getInt("Emaptes"),
                            rs.getInt("Gols_Pro"),
                            rs.getInt("Gols_Contra"),
                            rs.getInt("Cartoes_Amarelo"),
                            rs.getInt("Cartoes_Vermelho"));
    }
 }

  public ArrayList<Clubes_Campeonatos> getCompromissoByLista()throws SQLException{
      ArrayList<Clubes_Campeonatos> lista = new ArrayList<>();
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from Clubes_Campeonato order by data")) {
         
        while (rs.next()){
          lista.add(new Clubes_Campeonatos(rs.getInt("Clubes_Codigo"),
                            rs.getInt("Campeonatos_codigo"),
                            rs.getInt("Vitorias"),
                            rs.getInt("Derrotas"),
                            rs.getInt("Emaptes"),
                            rs.getInt("Gols_Pro"),
                            rs.getInt("Gols_Contra"),
                            rs.getInt("Cartoes_Amarelo"),
                            rs.getInt("Cartoes_Vermelho")));
        }
    }
    
     return lista;
 }
 
}
