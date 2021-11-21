package Clubes_Campeonatos;
public class Jogadores_Jogo {
    private int gol;
    private int cartaoAmarelo;
    private int cartaoVermelho;
    private int codJogador;
    private int codJogo;

    public Jogadores_Jogo() {
    }

    public Jogadores_Jogo(int gol, int cartaoAmarelo, int cartaoVermelho, int codJogador, int codJogo) {
        this.gol = gol;
        this.cartaoAmarelo = cartaoAmarelo;
        this.cartaoVermelho = cartaoVermelho;
        this.codJogador = codJogador;
        this.codJogo = codJogo;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getCartaoAmarelo() {
        return cartaoAmarelo;
    }

    public void setCartaoAmarelo(int cartaoAmarelo) {
        this.cartaoAmarelo = cartaoAmarelo;
    }

    public int getCartaoVermelho() {
        return cartaoVermelho;
    }

    public void setCartaoVermelho(int cartaoVermelho) {
        this.cartaoVermelho = cartaoVermelho;
    }

    public int getCodJogador() {
        return codJogador;
    }

    public void setCodJogador(int codJogador) {
        this.codJogador = codJogador;
    }

    public int getCodJogo() {
        return codJogo;
    }

    public void setCodJogo(int codJogo) {
        this.codJogo = codJogo;
    }
    
    
    
    
}
