package Clubes_Campeonatos;
public class Clubes_Campeonatos {
    private int codigo;
    private int codClube;
    private int codCampeonato;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsPro;
    private int golsContra;
    private int cartoesAmarelo;
    private int cartoesVermelho;

    public Clubes_Campeonatos(int codigo, int codClube, int codCampeonato, int vitorias, int derrotas, int empates, int golsPro, int golsContra, int cartoesAmarelo, int cartoesVermelho) {
        this.codigo = codigo;
        this.codClube = codClube;
        this.codCampeonato = codCampeonato;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.cartoesAmarelo = cartoesAmarelo;
        this.cartoesVermelho = cartoesVermelho;
    }

    public Clubes_Campeonatos(int codClube,int codCampeonato, int vitorias, int derrotas, int empates, int golsPro, int golsContra, int cartoesAmarelo, int cartoesVermelho) {
        this.codClube = codClube;
        this.codCampeonato = codCampeonato;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.cartoesAmarelo = cartoesAmarelo;
        this.cartoesVermelho = cartoesVermelho;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Clubes_Campeonatos() {
    }
    

    public int getCodClube() {
        return codClube;
    }

    public void setCodClube(int codClube) {
        this.codClube = codClube;
    }

    public int getCodCampeonato() {
        return codCampeonato;
    }

    public void setCodCampeonato(int codCampeonato) {
        this.codCampeonato = codCampeonato;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public int getCartoesAmarelo() {
        return cartoesAmarelo;
    }

    public void setCartoesAmarelo(int cartoesAmarelo) {
        this.cartoesAmarelo = cartoesAmarelo;
    }

    public int getCartoesVermelho() {
        return cartoesVermelho;
    }

    public void setCartoesVermelho(int cartoesVermelho) {
        this.cartoesVermelho = cartoesVermelho;
    }
    
    
    
}
