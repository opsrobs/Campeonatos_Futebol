package Clubes_Campeonatos;

import java.util.Date;

public class Campeonato {
    private int codigo;
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private int catCod;

    public Campeonato(int codigo, String nome, Date dataInicio, Date dataFim,  int catCod) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.catCod = catCod;
    }

    public Campeonato(String nome, Date dataInicio, Date dataFim, int catCod) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.catCod = catCod;
    }

    public int getCatCod() {
        return catCod;
    }

    public void setCatCod(int catCod) {
        this.catCod = catCod;
    }

    

    public Campeonato() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    } 

    @Override
    public String toString() {
        return nome;
    }
    
    
    
    
    
    
}
