package Clubes_Campeonatos;

import java.util.Date;

public class Jogador {
private int codigo;    
private int codClube;
private String nome;
private Date dataNasc;
private String posicao;
private String pais;

    public Jogador(int codigo, int codClube, String nome, Date dataNasc, String posicao, String pais) {
        this.codigo = codigo;
        this.codClube = codClube;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.posicao = posicao;
        this.pais = pais;
    }

    public Jogador(int codClube, String nome, Date dataNasc, String posicao, String pais) {
        this.codClube = codClube;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.posicao = posicao;
        this.pais = pais;
    }

    public Jogador() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodClube() {
        return codClube;
    }

    public void setCodClube(int codClube) {
        this.codClube = codClube;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void getNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
