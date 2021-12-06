package Controller;

import Clubes_Campeonatos.Categoria;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoCategoria {

    private final Conexao conexao = new Conexao();

    public void insert(Categoria categoria) throws SQLException {
        Connection con = conexao.getConexao();
        //inserir o nome (o indice começa no 1)
        try (PreparedStatement pst = con.prepareStatement("insert into categoria (Codigo, Nome) "
                + "values (0,?) ")) {
            pst.setString(1, categoria.getNome());

            //
            //usar sempre pra inserir ou modificar dado na tabela
            pst.executeUpdate();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select last_insert_id()");

            if (rs.next()) {
                categoria.setCodigo(rs.getInt(1));
            }
        }
        conexao.close();
    }

    public void update(Categoria categoria) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("update categoria set Nome = ? where (codigo = ?)")) {
            pst.setString(1, categoria.getNome());
            pst.setInt(2, categoria.getCodigo());
            pst.executeUpdate();
        }
        conexao.close();
    }

    public void delete(Categoria categoria) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from categoria where (codigo = ?)")) {
            pst.setInt(1, categoria.getCodigo());
            pst.executeUpdate();
        }
        conexao.close();
    }

    public Categoria getCategoriaByCodigo(int codigo) throws SQLException {
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("select * from categoria where (codigo = " + codigo + ")")) {

            rs.next();
            return new Categoria(rs.getInt("codigo"),
                    rs.getString("Nome"));
        }
    }

    public ArrayList<Categoria> getNomeCategoriaByCodigo(int codigo) throws SQLException {
        ArrayList<Categoria> lista = new ArrayList<>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("SELECT distinct categoria.nome, campeonato.* FROM categoria, campeonatos_2.campeonato where (categoria_Codigo = " + codigo + ")")) {

            while (rs.next()) {
                lista.add(new Categoria(rs.getInt("codigo"),
                        rs.getString("Nome")));
            }
        }
        return lista;
    }

    public ArrayList<Categoria> getCompromissoByLista() throws SQLException {
        ArrayList<Categoria> lista = new ArrayList<>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("select * from categoria order by nome")) {

            while (rs.next()) {
                lista.add(new Categoria(rs.getInt("codigo"),
                        rs.getString("Nome")));
            }
        }

        return lista;
    }

}
