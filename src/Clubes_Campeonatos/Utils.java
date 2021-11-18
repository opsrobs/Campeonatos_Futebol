/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clubes_Campeonatos;

import Controller.ServicoBancoClube;
import Controller.ServicoBancoCategoria;
import Controller.ServicoBancoCampeonato;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author PremierSoft
 */
public class Utils {
    private final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private final SimpleDateFormat dh = new SimpleDateFormat("hh:mm:ss");

    public Date strToDate(String data) throws ParseException{
        return df.parse(data);
    }

    public Date strToTime(String hora) throws ParseException {
        return dh.parse(hora);
    }

    public String getDataFormatada(Date d){
        return df.format(d);
    }

    public String getHorFormatada(Date h){
        return dh.format(h);
    }

    public void clearSc(JTextField d, JTextField h, JTextField desc, JTextField st, JButton c){
        d.setText("");
        h.setText("");
        desc.setText("");
        st.setText("");
        d.requestFocus();
        c.setEnabled(false);


    }
    public void clearSc(JTextField d, JTextField h, JTextField desc, JTextField st, JButton c, JComboBox jc){
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
    
    public void atualizarCategoria(JComboBox j, ServicoBancoCategoria sb) throws SQLException{
        if (j.getItemCount() >0) {
            j.removeAllItems();
        }
        
        ArrayList<Categoria> lista = sb.getCompromissoByLista();
        
        for(Categoria c: lista){
            j.addItem(c);
        }
        j.setSelectedIndex(-1);
    }
    
    public void atualizarClube(JComboBox j, ServicoBancoClube sb) throws SQLException{
        if (j.getItemCount() >0) {
            j.removeAllItems();
        }
        
        ArrayList<Clube> lista = sb.getCompromissoByLista();
        
        for(Clube c: lista){
            j.addItem(c);
        }
        j.setSelectedIndex(-1);
    }
    
    public void atualizarCampeonato(JComboBox j, ServicoBancoCampeonato sbcam) throws SQLException{
        if (j.getItemCount() >0) {
            j.removeAllItems();
        }
        
        ArrayList<Campeonato> lista = sbcam.getCompromissoByLista();
        
        for(Campeonato c: lista){
            j.addItem(c);
        }
        j.setSelectedIndex(-1);
    }

    
}

