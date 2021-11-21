package Controller;
import Clubes_Campeonatos.Jogadores_Jogo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoJogadoresJogo {
    
private final Conexao conexao = new Conexao();
 
 public void insert(Jogadores_Jogo jogadores) throws SQLException{
     Connection con = conexao.getConexao();
    //inserir o nome (o indice começa no 1)
    try (PreparedStatement pst = con.prepareStatement
                ("insert into jogadores_jogo (Gol, Cartao_Amarelo, Cartao_Vermelho, Jogadores_Codigo, Jogos_Codigo) " +
                 "values (?,?,?,?) ")) {
        pst.setInt(1, jogadores.getGol());
        pst.setInt(2,jogadores.getCartaoAmarelo());
        pst.setInt(3,jogadores.getCartaoVermelho());
        pst.setInt(4, jogadores.getCodJogador());
        pst.setInt(5, jogadores.getCodJogo());
        //
        
        //usar sempre pra inserir ou modificar dado na tabela
        pst.executeUpdate();
        
//        Statement st = con.createStatement(); 
//     
//        ResultSet rs = st.executeQuery("select last_insert_id()") ;
//            
//        if (rs.next()){
//            jogadores.setCodigo(rs.getInt(1));
//         }        
    }
     conexao.close();
 }

public void update(Jogadores_Jogo jogadores)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement
                ("update jogadores_jogo set Gol = ?, Cartao_Amarelo = ?, Cartao_Vermelho =? where (Jogadores_Codigo = ?,Jogos_Codigo =?)")) {
        pst.setInt(1, jogadores.getGol());
        pst.setInt(2,jogadores.getCartaoAmarelo());
        pst.setInt(3,jogadores.getCartaoVermelho());
        pst.setInt(4, jogadores.getCodJogador());
        pst.setInt(5, jogadores.getCodJogo());
        pst.executeUpdate();
    }
     conexao.close();
 }

 public void delete(Jogadores_Jogo jogadores)throws SQLException{
    try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from jogadores_jogo where (Jogadores_Codigo = ?,Jogos_Codigo =?)")) {
        pst.setInt(1, jogadores.getCodJogador());
        pst.setInt(2, jogadores.getCodJogo());
        pst.executeUpdate();
    }
     conexao.close();  
 }

 public Jogadores_Jogo getUsuarioByCodigo(int codigo, int codigoJogo)throws SQLException{
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from jogadores_jogo where (Jogadores_Codigo = " + codigo + "),Jogos_Codigo=" + codigoJogo + ")")) {
         
        rs.first();
        return new Jogadores_Jogo(rs.getInt("Gol"),
                            rs.getInt("Cartao_Amarelo"),
                            rs.getInt("Cartao_Vermelho"),
                            rs.getInt("Jogadores_Codigo"),
                            rs.getInt("Jogos_Codigo"));
    }
 }

  public ArrayList<Jogadores_Jogo> getCompromissoByLista()throws SQLException{
      ArrayList<Jogadores_Jogo> lista = new ArrayList<>();
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from jogadores_jogo order by data")) {
         
        while (rs.next()){
          lista.add(new Jogadores_Jogo(rs.getInt("Gol"),
                            rs.getInt("Cartao_Amarelo"),
                            rs.getInt("Cartao_Vermelho"),
                            rs.getInt("Jogadores_Codigo"),
                            rs.getInt("Jogos_Codigo")));
        }
    }
    
     return lista;
 }
 
}
