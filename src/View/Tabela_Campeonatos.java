/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Clubes_Campeonatos.Campeonato;
import Clubes_Campeonatos.Utils;
import Controller.ServicoBancoCampeonato;
import Controller.ServicoBancoClubeCampeonato;
import Controller.SimpleTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Tabela_Campeonatos extends javax.swing.JFrame {

    private Utils utils = new Utils();
    Campeonato categoria;
    ServicoBancoClubeCampeonato bancoCampeonato = new ServicoBancoClubeCampeonato();
    ServicoBancoCampeonato sbCam = new ServicoBancoCampeonato();

    public Tabela_Campeonatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtTabelaCampeonato = new javax.swing.JTable();
        ComboCampeonato = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        JbFechar.setText("FECHAR");
        JbFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JtTabelaCampeonato.setAutoCreateRowSorter(true);
        JtTabelaCampeonato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JtTabelaCampeonato.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        JtTabelaCampeonato.setShowGrid(true);
        jScrollPane1.setViewportView(JtTabelaCampeonato);

        ComboCampeonato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboCampeonatoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JbFechar)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ComboCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(327, 327, 327))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbFechar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void carregarTabela() {
        try {
            ArrayList dados = bancoCampeonato.getTabelaByQuery();
            String[] colunas = new String[]{
                "nome",
                "Vit??ria",
                "Derrota",
                "Empate",
                "Gols Pr??",
                "Gols Contra",
                "Cart??es Amarelo",
                "Cart??es Vermelho"

            };
            SimpleTableModel tabela = new SimpleTableModel(dados, colunas);
            JtTabelaCampeonato.setModel(tabela);
        } catch (SQLException ex) {
            Logger.getLogger(Tabela_Campeonatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void carregarTabelaCampeonatos(int codCamp) {
        try {
            ArrayList dados = bancoCampeonato.getTabelaByQueryByCampeonato(codCamp);
            String[] colunas = new String[]{
                "nome",
                "Vit??ria",
                "Derrota",
                "Empate",
                "Gols Pr??",
                "Gols Contra",
                "Cart??es Amarelo",
                "Cart??es Vermelho"

            };
            SimpleTableModel tabela = new SimpleTableModel(dados, colunas);
            JtTabelaCampeonato.setModel(tabela);
        } catch (SQLException ex) {
            Logger.getLogger(Tabela_Campeonatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void JbFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbFecharMouseClicked
        dispose();
    }//GEN-LAST:event_JbFecharMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        this.carregarTabela();
        try {
            utils.atualizarCampeonato(ComboCampeonato, sbCam);
        } catch (SQLException ex) {
            Logger.getLogger(Tabela_Campeonatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void qtdJogos(int qtd) throws SQLException {

//        TxtQtdJogos.setText(String.valueOf(bancoCampeonato.getQtdByQueryByCampeonato(qtd)));

    }
    private void ComboCampeonatoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboCampeonatoItemStateChanged
        if (ComboCampeonato.getItemCount() <= 0) {
            return;
        }
        if (ComboCampeonato.getSelectedIndex() < 0) {
            return;
        }

        Campeonato campeonato = (Campeonato) ComboCampeonato.getSelectedItem();
//        JOptionPane.showMessageDialog(null,campeonato.getCodigo());
        assert campeonato != null;
        carregarTabelaCampeonatos(campeonato.getCodigo());
        try {
            this.qtdJogos(campeonato.getCodigo());

        } catch (SQLException ex) {
            Logger.getLogger(Tabela_Campeonatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        assert categoria != null;
//        JBtnLimpar.setEnabled(true);
    }//GEN-LAST:event_ComboCampeonatoItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela_Campeonatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela_Campeonatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Campeonato> ComboCampeonato;
    private javax.swing.JButton JbFechar;
    private javax.swing.JTable JtTabelaCampeonato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
