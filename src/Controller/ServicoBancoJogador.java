package Controller;

import Clubes_Campeonatos.Jogador;
import Clubes_Campeonatos.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoBancoJogador {

    private final Conexao conexao = new Conexao();

    public void insert(Jogador jogador) throws SQLException {
        Connection con = conexao.getConexao();
        //inserir o nome (o indice começa no 1)
        try (PreparedStatement pst = con.prepareStatement("insert into jogadore (codigo, Clubes_Codigo, Nome, Data_Nasc, Posicao, Pais) "
                + "values (0,?,?,?,?,?) ")) {
            pst.setInt(1, jogador.getCodClube());
            pst.setString(2, jogador.getNome());
            pst.setDate(3, new java.sql.Date(jogador.getDataNasc().getTime()));
            pst.setString(4, jogador.getPosicao());
            pst.setString(5, jogador.getPais());
            //

            //usar sempre pra inserir ou modificar dado na tabela
            pst.executeUpdate();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select last_insert_id()");

            if (rs.next()) {
                jogador.setCodigo(rs.getInt(1));
            }
        }
        conexao.close();
    }

    public void update(Jogador jogador) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("update jogadore set Clubes_Codigo = ?, Nome = ?, Data_Nasc =?, Posicao=?, Pais = ? where (Codigo = ?)")) {
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

    public void delete(Jogador jogador) throws SQLException {
        try (PreparedStatement pst = conexao.getConexao().prepareStatement("delete from jogadore where (Codigo = ?)")) {
            pst.setInt(1, jogador.getCodigo());
            pst.executeUpdate();
        }
        conexao.close();
    }

    public ArrayList<Jogador> getJogadorByCodigo(int codigo) throws SQLException {
        ArrayList<Jogador> lista = new ArrayList<>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("select * from campeonatos_2.jogadore where (Clubes_Codigo = " + codigo + ")")) {
            {

                while (rs.next()) {
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

    public ArrayList<String[]> getTabelaByQuery() throws SQLException {
        ArrayList<String[]> dados = new ArrayList<>();
        Utils utils = new Utils();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("Select distinct clube.nome, count(jogadore.Clubes_Codigo)"
                        + "from clube, jogadore where (clube.codigo = jogadore.clubes_codigo)"
                        + "group by jogadore.Clubes_codigo")) {

            while (rs.next()) {
                dados.add(new String[]{rs.getString(1),
                    rs.getString(2)});
            }
        }

        return dados;
    }

    public ArrayList<Jogador> getCompromissoByLista() throws SQLException {
        ArrayList<Jogador> lista = new ArrayList<>();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("select * from jogadore order by Nome")) {

            while (rs.next()) {
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

    public ArrayList getTabelaByQueryOrderByGoals(String order) throws SQLException {
        ArrayList dados = new ArrayList();
        Utils utils = new Utils();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("SELECT distinct clube.nome as 'nome clube', jogadore.nome as  'nome jogador',"
                        + " jogadore.Posicao as 'Posicao', sum(gol) as 'Total de Gols ' FROM clube, campeonatos_2.jogadores_jogo,"
                        + " jogadore where jogadore.Codigo = Jogadores_Codigo and clube.codigo = jogadore.Clubes_Codigo"
                        + " group by Jogadores_Codigo order by sum(gol) " + order + ", clube.nome asc, jogadore.nome asc, jogadore.Posicao asc;")) {

            while (rs.next()) {
                dados.add(new String[]{rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)});
            }
        }

        return dados;
    }

    public ArrayList getTabelaByQueryOrderByPlayerCard(String order) throws SQLException {
        ArrayList dados = new ArrayList();
        Utils utils = new Utils();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("SELECT distinct clube.nome as 'nome clube', jogadore.nome as  'nome jogador',"
                        + " jogadore.Posicao as 'Posicao', sum(Cartao_Amarelo) as 'Total de Gols ' FROM clube, campeonatos_2.jogadores_jogo,"
                        + " jogadore where jogadore.Codigo = Jogadores_Codigo and clube.codigo = jogadore.Clubes_Codigo"
                        + " group by Jogadores_Codigo order by sum(Cartao_Amarelo) " + order + " clube.nome desc, jogadore.nome desc, jogadore.Posicao desc;")) {

            while (rs.next()) {
                dados.add(new String[]{rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)});
            }
        }

        return dados;
    }

    public ArrayList getTabelaByQueryOrderByQtdJogos(String order) throws SQLException {
        ArrayList dados = new ArrayList();
        Utils utils = new Utils();
        try (Statement st = conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery("SELECT distinct clube.nome as 'nome clube', jogadore.nome as  'nome jogador', jogadore.Posicao as 'Posicao', count(Jogadores_Codigo) as 'Total de Gols '"
                        + " FROM clube, campeonatos_2.jogadores_jogo, jogadore "
                        + " where jogadore.Codigo = Jogadores_Codigo and clube.codigo = jogadore.Clubes_Codigo "
                        + " group by Jogadores_Codigo order by count(Jogadores_Codigo) asc, clube.nome desc, jogadore.nome desc, jogadore.Posicao desc;")) {

            while (rs.next()) {
                dados.add(new String[]{rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)});
            }
        }

        return dados;
    }

}
