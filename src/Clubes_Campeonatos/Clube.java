/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clubes_Campeonatos;

/**
 *
 * @author PremierSoft
 */
public class Clube {

    private int codigo;
    private String nome;
    private String mascote;
    private int codCategoria;

    public Clube(int codigo, String nome, String mascote, int codCategoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.mascote = mascote;
        this.codCategoria = codCategoria;
    }

    public Clube(String nome, String mascote, int codCategoria) {
        this.nome = nome;
        this.mascote = mascote;
        this.codCategoria = codCategoria;
    }
    public Clube(String nome) {
        this.nome = nome;
    }

    public Clube() {
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

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    

    @Override
    public String toString() {
        return  nome;
    }
    
    
    
    
}
