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
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author PremierSoft
 */
public class Consulta_Jogador extends javax.swing.JFrame {
    Jogador jogador = new Jogador();
    Clube clube = new Clube();
    Utils utils = new Utils();
    
    ServicoBancoClube sbclub = new ServicoBancoClube();
    ServicoBancoJogador sbj = new ServicoBancoJogador();

    public Consulta_Jogador() {
        initComponents();
    }
    
    private void clearSc() {
        if (JComboJogadorCasa.isDisplayable()) {
            JComboJogadorCasa.setSelectedIndex(-1);
        }
        TxtNome.setText("");
        TxtData.setText("");
        TxtPosicao.setText("");
        TxtPais.setText("");
        JComboJogadorCasa.requestFocus();
        JBtnLimpar.setEnabled(false);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        dateComponentFormatter1 = new org.jdatepicker.impl.DateComponentFormatter();
        jLabel1 = new javax.swing.JLabel();
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
        JComboJogadorCasa = new javax.swing.JComboBox<>();
        JbExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MingLiU-ExtB", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRAR JOGADORES...");

        LbNome.setText("NOME");

        TxtNome.setEditable(false);
        TxtNome.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtNome.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        LbData.setText("DATA NASCIMENTO");

        LbPosicao.setText("POSIÇÃO");

        TxtPosicao.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtPosicao.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPosicaoActionPerformed(evt);
            }
        });

        LbPais.setText("PAÍS");

        TxtPais.setEditable(false);
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

        TxtData.setEditable(false);
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

        JComboJogadorCasa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboJogadorCasaItemStateChanged(evt);
            }
        });
        JComboJogadorCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JComboJogadorCasaKeyPressed(evt);
            }
        });

        JbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/lixo.png"))); // NOI18N
        JbExcluir.setBorder(null);
        JbExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbExcluirMouseClicked(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LbData, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtData))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LbPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JComboJogadorCasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JComboJogadorCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            utils.atualizarJogador(JComboJogadorCasa, sbj);
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

    private void JBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnLimparActionPerformed
        this.clearSc();
    }//GEN-LAST:event_JBtnLimparActionPerformed

    private void JbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalvarActionPerformed

    }//GEN-LAST:event_JbtnSalvarActionPerformed

    private void JbtnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbtnSalvarMouseClicked
        if (validarInput(TxtNome, TxtPosicao, TxtPais)) return;

        try {

            if (JComboJogadorCasa.getSelectedIndex() >= 0) {

                jogador = (Jogador) JComboJogadorCasa.getSelectedItem();
                assert jogador != null;
                jogador.setNome(TxtNome.getText());
                jogador.setPosicao(TxtPosicao.getText().toUpperCase());
                sbj.update(jogador);
            }else
            JOptionPane.showMessageDialog(null,"Selecione um clube");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.clearSc();
    }//GEN-LAST:event_JbtnSalvarMouseClicked

    static boolean validarInput(JTextField txtNome, JTextField txtPosicao, JTextField txtPais) {
        if (txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Informe um nome!");
            txtNome.requestFocus();
            return true;
        }
        if (txtPosicao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Informe um nome de mascote!");
            txtPosicao.requestFocus();
            return true;

        }
        if (txtPais.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Informe uma categoria!");
            txtPais.requestFocus();
            return true;
        }
        return false;
    }

    private void TxtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPaisActionPerformed

    private void JComboJogadorCasaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboJogadorCasaItemStateChanged

        if (JComboJogadorCasa.getItemCount() <= 0) {
            return;
        }
        if (JComboJogadorCasa.getSelectedIndex() < 0) {
            return;
        }
        Jogador jogador = (Jogador) JComboJogadorCasa.getSelectedItem();
        TxtNome.setEnabled(true);
        TxtNome.setEditable(true);
        assert jogador != null;
        TxtNome.setText(jogador.getNome());
        TxtData.setText(utils.getDataFormatada(jogador.getDataNasc()));
        TxtPosicao.setText(jogador.getPosicao());
        TxtPais.setText(jogador.getPais());

        //        JComboJogadorCasa.setSelectedIndex(-1);
    }//GEN-LAST:event_JComboJogadorCasaItemStateChanged

    private void JComboJogadorCasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboJogadorCasaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboJogadorCasaKeyPressed

    private void JbExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbExcluirMouseClicked
        if (JComboJogadorCasa.getItemCount() <= 0) {
            return;
        }
        if (JComboJogadorCasa.getSelectedIndex() < 0) {
            return;
        }
        jogador = (Jogador) JComboJogadorCasa.getSelectedItem();
        assert jogador != null;
        JBtnLimpar.setEnabled(true);
        int del = JOptionPane.showConfirmDialog(null, "Você deseja realmente excluir o registro " + jogador,"Excluir...",
            JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,
            new ImageIcon("C:\\Users\\PremierSoft\\IdeaProjects\\Campeonatos_Futebol\\src\\View\\delete.gif"));
        if (del == JOptionPane.YES_OPTION) {
            try {
                sbj.delete(jogador);
                utils.atualizarJogador(JComboJogadorCasa, sbj);
                clearSc();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta_Clube.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (del == JOptionPane.NO_OPTION) {
            clearSc();
        }

    }//GEN-LAST:event_JbExcluirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Jogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnLimpar;
    private javax.swing.JButton JBtnSair;
    private javax.swing.JComboBox<Jogador> JComboJogadorCasa;
    private javax.swing.JButton JbExcluir;
    private javax.swing.JButton JbtnSalvar;
    private javax.swing.JLabel LbData;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbPais;
    private javax.swing.JLabel LbPosicao;
    private javax.swing.JFormattedTextField TxtData;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtPais;
    private javax.swing.JTextField TxtPosicao;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
