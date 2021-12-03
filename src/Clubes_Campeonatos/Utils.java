/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clubes_Campeonatos;

import Controller.ServicoBancoClube;
import Controller.ServicoBancoCategoria;
import Controller.ServicoBancoCampeonato;
import Controller.ServicoBancoClubeCampeonato;
import Controller.ServicoBancoJogador;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PremierSoft
 */
public class Utils {

    private final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private final SimpleDateFormat dh = new SimpleDateFormat("hh:mm:ss");
    private ServicoBancoClubeCampeonato sbcc = new ServicoBancoClubeCampeonato();
    
    
            
    public Date strToDate(String data) throws ParseException {
        return df.parse(data);
    }

    public Date strToTime(String hora) throws ParseException {
        return dh.parse(hora);
    }

    public String getDataFormatada(Date d) {
        return df.format(d);
    }

    public String getHorFormatada(Date h) {
        return dh.format(h);
    }

    public void clearSc(JTextField d, JTextField h, JTextField desc, JTextField st, JButton c) {
        d.setText("");
        h.setText("");
        desc.setText("");
        st.setText("");
        d.requestFocus();
        c.setEnabled(false);

    }

    public void clearSc(JTextField d, JTextField h, JTextField desc, JTextField st, JButton c, JComboBox jc) {
        if (jc.isDisplayable()) {
            jc.setSelectedIndex(-1);
        }
        d.setText("");
        h.setText("");
        desc.setText("");
        st.setText("");
        d.requestFocus();
        c.setEnabled(false);
        if (jc.getSelectedIndex() != 0) {
            c.setEnabled(true);
        }

    }
    
    public void setGols(JTextField a,JTextField b,JTextField c,JTextField d,JTextField e,JTextField f,JTextField g,JTextField h,JTextField i,JTextField j){
        a.setText("0");
        b.setText("0");
        c.setText("0");
        d.setText("0");
        e.setText("0");
        f.setText("0");
        g.setText("0");
        h.setText("0");
        i.setText("0");
        j.setText("0");   
    }
    public void setCartoes(JTextField a,JTextField b,JTextField c,JTextField d,JTextField e,JTextField f,JTextField g,JTextField h,JTextField i,JTextField j){
        a.setText("0");
        b.setText("0");
        c.setText("0");
        d.setText("0");
        e.setText("0");
        f.setText("0");
        g.setText("0");
        h.setText("0");
        i.setText("0");
        j.setText("0");   
    }
    
    public int vitoriasMandante(JTextField mandante, JTextField visitante){
        int vitoria=0;
        if (Integer.parseInt(mandante.getText()) >Integer.parseInt(visitante.getText())) {
            vitoria=1;
        }
        return vitoria;
    }
    public int derrota(int vitoria,JTextField mandante, JTextField visitante ){
        int der = 0;
        if (vitoria == 0 && empate(mandante, visitante) == 0) {
            der=1;
        }
        return der;
    }
    public int empate(JTextField mandante, JTextField visitante){
        int emp = 0;
        if (Integer.parseInt(mandante.getText())==Integer.parseInt(visitante.getText())) {
            emp=1;
        }
        return emp;        
    }
    public int vitoriasVisitante(JTextField mandante, JTextField visitante){
        int vitoria=0;
        if (Integer.parseInt(mandante.getText()) >Integer.parseInt(visitante.getText())) {
            vitoria=1;
        }
        return vitoria;
    }
    
    public int amarelos(JTextField a,JTextField b,JTextField c,JTextField d,JTextField e){
        int cart=0;
        if (!a.getText().isBlank()&&Integer.parseInt(a.getText())>0) {
            cart+= Integer.parseInt(a.getText());
        }
        if(!b.getText().isBlank() &&Integer.parseInt(b.getText())>0 ){
            cart+= Integer.parseInt(b.getText());
        }
        if(!c.getText().isBlank() && Integer.parseInt(c.getText())>0){
            cart+= Integer.parseInt(c.getText());
        }
        if(!d.getText().isBlank() &&Integer.parseInt(d.getText())>0 ){
            cart+= Integer.parseInt(d.getText());
        }
        if(!e.getText().isBlank() && Integer.parseInt(e.getText())>0){
            cart+= Integer.parseInt(e.getText());
        }
        return cart;
    }
    
    public int vermelhos(JCheckBox a,JCheckBox b,JCheckBox c,JCheckBox d,JCheckBox e){
        int ver =0;
        if (a.isSelected()) {
            ver +=1;
        }if (b.isSelected()) {
            ver +=1;
        }if (c.isSelected()) {
            ver +=1;
        }if (d.isSelected()) {
            ver +=1;
        }if (e.isSelected()) {
            ver +=1;
        }
        return ver;
    }

    public void atualizarCategoria(JComboBox j, ServicoBancoCategoria sb) throws SQLException {
        if (j.getItemCount() > 0) {
            j.removeAllItems();
        }

        ArrayList<Categoria> lista = sb.getCompromissoByLista();

        for (Categoria c : lista) {
            j.addItem(c);
        }
        j.setSelectedIndex(-1);
    }

    public void atualizarClube(JComboBox j, ServicoBancoClube sb) throws SQLException {
        if (j.getItemCount() > 0) {
            j.removeAllItems();
        }

        ArrayList<Clube> lista = sb.getCompromissoByLista();

        for (Clube c : lista) {
            j.addItem(c);
        }
        j.setSelectedIndex(-1);
    }

    public void atualizarCampeonato(JComboBox j, ServicoBancoCampeonato sbcam) throws SQLException {
        if (j.getItemCount() > 0) {
            j.removeAllItems();
        }

        ArrayList<Campeonato> lista = sbcam.getCompromissoByLista();

        for (Campeonato c : lista) {
            j.addItem(c);
        }
        j.setSelectedIndex(-1);
    }

    public void atualizarJogadoor(JComboBox j, ServicoBancoJogador sb, int cod) throws SQLException {
        if (j.getItemCount() > 0) {
            j.removeAllItems();
        }

        ArrayList<Jogador> lista = sb.getJogadorByCodigo(cod);

        for (Jogador jogador : lista) {
            j.addItem(jogador);
        }
        j.setSelectedIndex(-1);
    }

    public void atualizarJogador(JComboBox j, ServicoBancoJogador sb) throws SQLException {
        if (j.getItemCount() > 0) {
            j.removeAllItems();
        }

        ArrayList<Jogador> lista = sb.getCompromissoByLista();

        for (Jogador jogador : lista) {
            j.addItem(jogador);
        }
        j.setSelectedIndex(-1);
    }

    public void getCodigoClube(JComboBox j, ServicoBancoClube sbc, String nome) {
        if (j.getItemCount() > 0) {
            j.removeAllItems();
        }
        try {
            sbc.getClubeByNome(nome);
        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String converterHora() {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("hh:mm:ss");
        String hora = "";
        boolean dataValida;
        do {
            try {
                hora = dataFormatada.format(LocalDateTime.now());
                dataValida = true;
            } catch (Exception e) {
                dataValida = false;
            }
        } while (!dataValida);
        return hora;
    }

    public String converterData() {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String data = "";
        boolean dataValida;
        do {
            try {
                data = dataFormatada.format(LocalDateTime.now());
                dataValida = true;
            } catch (Exception e) {
                dataValida = false;
            }
        } while (!dataValida);
        return data;
    }

}
