/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Clubes_Campeonatos.Categoria;
import Clubes_Campeonatos.Clube;
import Clubes_Campeonatos.Utils;
import Controller.ServicoBancoCategoria;
import Controller.ServicoBancoClube;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author PremierSoft
 */
public class Consulta_Clube extends javax.swing.JFrame {

    Clube clube = new Clube();
    Cadastro_Jogador cadastro_Jogador;
    Cadastro_Campeonato cadastro_Campeonato;
    Cadastro_Jogo cadastro_Jogo;
    Tabela_Campeonatos tabela_Campeonatos;
    Categoria categoria = new Categoria();
    Utils utils = new Utils();
    ServicoBancoClube sb = new ServicoBancoClube();
    ServicoBancoCategoria sbcat = new ServicoBancoCategoria();

    public Consulta_Clube() {
        initComponents();
    }

    private void clearSc() {
        if (ComboClube.isDisplayable()) {
            ComboClube.setSelectedIndex(-1);
        }
        TxtNome.setText("");
        TxtCategoria.setText("");
        TxtMAscote.setText("");
        TxtNome.requestFocus();

        JBtnLimpar.setEnabled(false);
        JbExcluir.setEnabled(false);
        JbExcluir.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LbNome = new javax.swing.JLabel();
        LbMascote = new javax.swing.JLabel();
        LbCat = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtMAscote = new javax.swing.JTextField();
        TxtCategoria = new javax.swing.JTextField();
        JBtnLimpar = new javax.swing.JButton();
        JbtnSalvar = new javax.swing.JButton();
        ComboClube = new javax.swing.JComboBox<>();
        JbExcluir = new javax.swing.JButton();
        JBtnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MingLiU-ExtB", 0, 18)); // NOI18N
        jLabel1.setText("CONSULTAR CLUBES...");

        LbNome.setText("NOME");

        LbMascote.setText("MASCOTE");

        LbCat.setText("CATEGORIA");

        TxtNome.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtNome.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        TxtMAscote.setEditable(false);
        TxtMAscote.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtMAscote.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtMAscote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMAscoteActionPerformed(evt);
            }
        });

        TxtCategoria.setEditable(false);
        TxtCategoria.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtCategoria.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtCategoria.setName(""); // NOI18N
        TxtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCategoriaActionPerformed(evt);
            }
        });

        JBtnLimpar.setText("LIMPAR");
        JBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnLimparActionPerformed(evt);
            }
        });

        JbtnSalvar.setText("SALVAR");
        JbtnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbtnSalvarMouseClicked(evt);
            }
        });

        ComboClube.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboClubeItemStateChanged(evt);
            }
        });

        JbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/lixo.png"))); // NOI18N
        JbExcluir.setBorder(null);
        JbExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbExcluirMouseClicked(evt);
            }
        });

        JBtnSair.setText("SAIR");
        JBtnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnSairMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/cONSULTAS.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JbtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LbMascote, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMAscote, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboClube, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbMascote, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMAscote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboClube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtMAscoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMAscoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMAscoteActionPerformed

    private void TxtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCategoriaActionPerformed

    private void JBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnLimparActionPerformed
        this.clearSc();
    }//GEN-LAST:event_JBtnLimparActionPerformed

    private void JbtnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbtnSalvarMouseClicked

        try {
            if (ComboClube.getSelectedIndex() >= 0) {

                Clube clube = (Clube) ComboClube.getSelectedItem();
                assert clube != null;

                clube.setNome(TxtNome.getText());
                sb.update(clube);
                JOptionPane.showMessageDialog(
                        null, "Alterado com sucesso",
                        "Cadastro!!!", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon("C:\\Users\\PremierSoft\\IdeaProjects\\Campeonatos_Futebol\\src\\View\\Cadastro.gif"));

            }

//            utils.atualizarCategoria(ComboClube, sbcat);
            clearSc();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_JbtnSalvarMouseClicked

    private void ComboClubeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboClubeItemStateChanged

        if (ComboClube.getItemCount() <= 0) {
            return;
        }
        if (ComboClube.getSelectedIndex() < 0) {
            return;
        }

        try {
            Clube clube = (Clube) ComboClube.getSelectedItem();
            assert clube != null;
            TxtNome.setText(clube.getNome());
            TxtMAscote.setText(clube.getMascote());
            TxtCategoria.setText(sbcat.getCategoriaByCodigo(clube.getCodCategoria()).getNome());
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Clube.class.getName()).log(Level.SEVERE, null, ex);
        }
//        TxtCategoria.setText(clube.);
        JBtnLimpar.setEnabled(true);
        JbExcluir.setEnabled(true);
        JbExcluir.setVisible(true);
    }//GEN-LAST:event_ComboClubeItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            utils.atualizarClube(ComboClube, sb);
            clearSc();

        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Campeonato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void JbExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbExcluirMouseClicked
        if (ComboClube.getItemCount() <= 0) {
            return;
        }
        if (ComboClube.getSelectedIndex() < 0) {
            return;
        }
        Clube clube = (Clube) ComboClube.getSelectedItem();
        assert clube != null;
        TxtCategoria.setText(categoria.getNome());
        JBtnLimpar.setEnabled(true);
        int del = JOptionPane.showConfirmDialog(null, "Você deseja realmente excluir o registro " + clube, "Excluir...",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\PremierSoft\\IdeaProjects\\Campeonatos_Futebol\\src\\View\\delete.gif"));
        if (del == JOptionPane.YES_OPTION) {
            try {
                sb.delete(clube);
                utils.atualizarClube(ComboClube, sb);
                clearSc();
                JOptionPane.showMessageDialog(
                        null, "Excluido com sucesso",
                        "Cadastro!!!", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon("C:\\Users\\PremierSoft\\IdeaProjects\\Campeonatos_Futebol\\src\\View\\deleted.gif"));
            } catch (SQLException ex) {
                Logger.getLogger(Consulta_Clube.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (del == JOptionPane.NO_OPTION) {
            clearSc();
        }

    }//GEN-LAST:event_JbExcluirMouseClicked

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void JBtnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnSairMouseClicked
        dispose();
    }//GEN-LAST:event_JBtnSairMouseClicked

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
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Clube.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Clube().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> ComboClube;
    private javax.swing.JButton JBtnLimpar;
    private javax.swing.JButton JBtnSair;
    private javax.swing.JButton JbExcluir;
    private javax.swing.JButton JbtnSalvar;
    private javax.swing.JLabel LbCat;
    private javax.swing.JLabel LbMascote;
    private javax.swing.JLabel LbNome;
    private javax.swing.JTextField TxtCategoria;
    private javax.swing.JTextField TxtMAscote;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
