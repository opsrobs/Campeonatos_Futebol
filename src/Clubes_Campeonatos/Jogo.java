package Clubes_Campeonatos;

import java.util.Date;

public class Jogo {
    private int codigo;
    private int codCampeonato;
    private Date dataJogo;
    private Date horaJogo;
    private int clubeCasa;
    private int golCasa;
    private int clubefora;
    private int golVisitante;
    private String localJogo;

    public Jogo(int codigo, int codCampeonato, Date dataJogo, Date horaJogo, int clubeCasa, int golCasa, int clubefora, int golVisitante, String localJogo) {
        this.codigo = codigo;
        this.codCampeonato = codCampeonato;
        this.dataJogo = dataJogo;
        this.horaJogo = horaJogo;
        this.clubeCasa = clubeCasa;
        this.golCasa = golCasa;
        this.clubefora = clubefora;
        this.golVisitante = golVisitante;
        this.localJogo = localJogo;
    }

    

    public Jogo(int codCampeonato, Date dataJogo, Date horaJogo, int clubeCasa, int clubefora, int golVisitante, String localJogo) {
        this.codCampeonato = codCampeonato;
        this.dataJogo = dataJogo;
        this.horaJogo = horaJogo;
        this.clubeCasa = clubeCasa;
        this.clubefora = clubefora;
        this.golVisitante = golVisitante;
        this.localJogo = localJogo;
    }

    public Jogo() {
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }
    
    

    public int getCodCampeonato() {
        return codCampeonato;
    }

    public void setCodCampeonato(int codCampeonato) {
        this.codCampeonato = codCampeonato;
    }

    public Date getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(Date dataJogo) {
        this.dataJogo = dataJogo;
    }

    public Date getHoraJogo() {
        return horaJogo;
    }

    public void setHoraJogo(Date horaJogo) {
        this.horaJogo = horaJogo;
    }

    public int getClubeCasa() {
        return clubeCasa;
    }

    public void setClubeCasa(int clubeCasa) {
        this.clubeCasa = clubeCasa;
    }

    public int getClubefora() {
        return clubefora;
    }

    public void setClubefora(int clubefora) {
        this.clubefora = clubefora;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    public String getLocalJogo() {
        return localJogo;
    }

    public void setLocalJogo(String localJogo) {
        this.localJogo = localJogo;
    }
    
    
}
