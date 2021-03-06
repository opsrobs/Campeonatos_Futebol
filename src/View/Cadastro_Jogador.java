/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Clubes_Campeonatos.Clube;
import Clubes_Campeonatos.Jogador;
import Clubes_Campeonatos.Utils;
import Controller.ServicoBancoClube;
import Controller.ServicoBancoJogador;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author PremierSoft
 */
public class Cadastro_Jogador extends javax.swing.JFrame {
    Jogador jogador = new Jogador();
    Clube clube = new Clube();
    Utils utils = new Utils();
    
    ServicoBancoClube sbclub = new ServicoBancoClube();
    ServicoBancoJogador sbj = new ServicoBancoJogador();

    public Cadastro_Jogador() {
        initComponents();
    }
    
    private void clearSc() {
        if (ComboClube.isDisplayable()) {
            ComboClube.setSelectedIndex(-1);
        }
        TxtNome.setText("");
        TxtData.setText("");
        TxtPosicao.setText("");
        TxtPais.setText("");
        ComboClube.requestFocus();
        JBtnLimpar.setEnabled(false);

//        JBtnLimpar.setEnabled(false);
//        if (ComboClube.getSelectedIndex() != 0) {
//            JBtnLimpar.setEnabled(true);
//        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LbClube = new javax.swing.JLabel();
        ComboClube = new javax.swing.JComboBox<>();
        LbNome = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        LbData = new javax.swing.JLabel();
        LbPosicao = new javax.swing.JLabel();
        TxtPosicao = new javax.swing.JTextField();
        LbPais = new javax.swing.JLabel();
        TxtPais = new javax.swing.JTextField();
        JbtnSalvar = new javax.swing.JButton();
        JBtnLimpar = new javax.swing.JButton();
        TxtData = new javax.swing.JFormattedTextField();
        JBtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MingLiU-ExtB", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRAR JOGADORES...");

        LbClube.setText("CLUBE");

        ComboClube.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboClubeItemStateChanged(evt);
            }
        });

        LbNome.setText("NOME");

        TxtNome.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtNome.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        LbData.setText("DATA NASCIMENTO");

        LbPosicao.setText("POSI????O");

        TxtPosicao.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtPosicao.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPosicaoActionPerformed(evt);
            }
        });

        LbPais.setText("PA??S");

        TxtPais.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtPais.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPaisActionPerformed(evt);
            }
        });

        JbtnSalvar.setText("SALVAR");
        JbtnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbtnSalvarMouseClicked(evt);
            }
        });
        JbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSalvarActionPerformed(evt);
            }
        });

        JBtnLimpar.setText("LIMPAR");
        JBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnLimparActionPerformed(evt);
            }
        });

        try {
            TxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JBtnSair.setText("SAIR");
        JBtnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JbtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbClube, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboClube, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbData, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbClube, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboClube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            utils.atualizarClube(ComboClube, sbclub);
            clearSc();

        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Campeonato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void TxtPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPosicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPosicaoActionPerformed

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void JBtnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnSairMouseClicked
        dispose();
    }//GEN-LAST:event_JBtnSairMouseClicked

    private void ComboClubeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboClubeItemStateChanged

        if (ComboClube.getItemCount()<=0) {
            return;
        }
        if (ComboClube.getSelectedIndex()<0) {
            return;
        }
        Clube clube = (Clube) ComboClube.getSelectedItem();
        JBtnLimpar.setEnabled(true);

    }//GEN-LAST:event_ComboClubeItemStateChanged

    private void JBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnLimparActionPerformed
        this.clearSc();
    }//GEN-LAST:event_JBtnLimparActionPerformed

    private void JbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalvarActionPerformed

    }//GEN-LAST:event_JbtnSalvarActionPerformed

    private void JbtnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbtnSalvarMouseClicked
        if (Consulta_Jogador.validarInput(TxtNome, TxtPosicao, TxtPais)) return;

        try {

            if (ComboClube.getSelectedIndex() >= 0) {

                clube = (Clube) ComboClube.getSelectedItem();
                //                categoria.setNome(TxtCategoria.getText());
                assert clube != null;
                sbclub.update(clube);
            }else
            JOptionPane.showMessageDialog(null,"Selecione um clube");

            jogador = new Jogador(clube.getCodigo(),TxtNome.getText(),utils.strToDate(TxtData.getText()),TxtPosicao.getText(),TxtPais.getText());
            sbj.insert(jogador);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Cadastro_Jogador.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.clearSc();
        JOptionPane.showMessageDialog(
                        null,"Cadastrado com sucesso",
                        "Cadastro!!!", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon("C:\\Users\\PremierSoft\\IdeaProjects\\Campeonatos_Futebol\\src\\View\\Cadastro.gif"));
    }//GEN-LAST:event_JbtnSalvarMouseClicked

    private void TxtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPaisActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Jogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Clube> ComboClube;
    private javax.swing.JButton JBtnLimpar;
    private javax.swing.JButton JBtnSair;
    private javax.swing.JButton JbtnSalvar;
    private javax.swing.JLabel LbClube;
    private javax.swing.JLabel LbData;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbPais;
    private javax.swing.JLabel LbPosicao;
    private javax.swing.JFormattedTextField TxtData;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtPais;
    private javax.swing.JTextField TxtPosicao;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
