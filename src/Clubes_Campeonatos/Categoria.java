package Clubes_Campeonatos;

public class Categoria {
    private int codigo;
    private String nome;
    

    public Categoria(String nome) {
        this.nome = nome;
        
    }

    public Categoria(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        
    }
    

    public Categoria() {
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

    @Override
    public String toString() {
        return nome;
    }
    
    
    
    
    
}
