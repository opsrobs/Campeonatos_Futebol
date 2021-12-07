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
public class Cadastro_Clube extends javax.swing.JFrame {

    Clube clube = new Clube();
    Cadastro_Jogador cadastro_Jogador;
    Cadastro_Campeonato cadastro_Campeonato;
    Cadastro_Jogo cadastro_Jogo;
    Tabela_Campeonatos tabela_Campeonatos;
    private Consulta_Clube consulta_Clube;
    Categoria categoria = new Categoria();
    Utils utils = new Utils();
    ServicoBancoClube sb = new ServicoBancoClube();
    ServicoBancoCategoria sbcat = new ServicoBancoCategoria();

    public Cadastro_Clube() {
        initComponents();
    }

    private void clearSc() {
        if (ComboCategoria.isDisplayable()) {
            ComboCategoria.setSelectedIndex(-1);
        }
        TxtNome.setText("");
        TxtCategoria.setText("");
        TxtMAscote.setText("");
        TxtNome.requestFocus();

        JBtnLimpar.setEnabled(false);

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
        ComboCategoria = new javax.swing.JComboBox<>();
        JBtnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        MenuConsultas = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MingLiU-ExtB", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRAR CLUBES...");

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

        TxtMAscote.setMaximumSize(new java.awt.Dimension(35, 16));
        TxtMAscote.setMinimumSize(new java.awt.Dimension(35, 16));
        TxtMAscote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMAscoteActionPerformed(evt);
            }
        });

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

        ComboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboCategoriaItemStateChanged(evt);
            }
        });

        JBtnSair.setText("SAIR");
        JBtnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnSairMouseClicked(evt);
            }
        });

        MenuCadastros.setText("Cadastros");

        jMenu1.setText("Cadastrar Jogador");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        MenuCadastros.add(jMenu1);

        jMenu2.setText("Cadastrar Campeonatos");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        MenuCadastros.add(jMenu2);

        jMenu3.setText("Cadastrar Jogos");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        MenuCadastros.add(jMenu3);

        jMenuBar1.add(MenuCadastros);

        MenuConsultas.setText("Consultas");

        jMenu4.setText("Tabela do campeonato");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        MenuConsultas.add(jMenu4);

        jMenu5.setText("Editar Clubes");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        MenuConsultas.add(jMenu5);

        jMenu6.setText("Editar Campeonatos");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        MenuConsultas.add(jMenu6);

        jMenuBar1.add(MenuConsultas);

        MenuSair.setText("Sair");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JbtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(LbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
        dispose();
    }//GEN-LAST:event_MenuSairMouseClicked

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

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
        if (TxtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe um nome!");
            TxtNome.requestFocus();
            return;
        }
        if (TxtMAscote.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe um nome de mascote!");
            TxtCategoria.requestFocus();
            return;

        }
        if (TxtCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe uma categoria!");
            TxtNome.requestFocus();
            return;
        }

        try {
            if (ComboCategoria.getSelectedIndex() >= 0) {

                Categoria categoria = (Categoria) ComboCategoria.getSelectedItem();
                assert categoria != null;
                categoria.setNome(TxtCategoria.getText());
                sbcat.update(categoria);

                clube = new Clube(TxtNome.getText(), TxtMAscote.getText(), categoria.getCodigo());
                sb.insert(clube);
            } else {
                categoria = new Categoria(TxtCategoria.getText());
                sbcat.insert(categoria);
                clube = new Clube(TxtNome.getText(), TxtMAscote.getText(), categoria.getCodigo());
                sb.insert(clube);
            }
            utils.atualizarCategoria(ComboCategoria, sbcat);
            clearSc();
            JOptionPane.showMessageDialog(
                        null,"Cadastrado com sucesso",
                        "Cadastro!!!", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon("C:\\Users\\PremierSoft\\IdeaProjects\\Campeonatos_Futebol\\src\\View\\Cadastro.gif"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_JbtnSalvarMouseClicked

    private void ComboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboCategoriaItemStateChanged

        if (ComboCategoria.getItemCount() <= 0) {
            return;
        }
        if (ComboCategoria.getSelectedIndex() < 0) {
            return;
        }
        Categoria categoria = (Categoria) ComboCategoria.getSelectedItem();
        assert categoria != null;
        TxtCategoria.setText(categoria.getNome());
        JBtnLimpar.setEnabled(true);
    }//GEN-LAST:event_ComboCategoriaItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            utils.atualizarCategoria(ComboCategoria, sbcat);
            clearSc();

        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Campeonato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        if (cadastro_Jogador == null) {
            cadastro_Jogador = new Cadastro_Jogador();
        }
        cadastro_Jogador.setVisible(true);

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        if (cadastro_Campeonato == null) {
            cadastro_Campeonato = new Cadastro_Campeonato();
        }
        cadastro_Campeonato.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if (cadastro_Jogo == null) {
            cadastro_Jogo = new Cadastro_Jogo();
        }
        cadastro_Jogo.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        if (tabela_Campeonatos == null) {
            tabela_Campeonatos = new Tabela_Campeonatos();
        }
        tabela_Campeonatos.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        if (consulta_Clube == null) {
            consulta_Clube = new Consulta_Clube();
        }
        consulta_Clube.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void JBtnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnSairMouseClicked
        dispose();
    }//GEN-LAST:event_JBtnSairMouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        if (cadastro_Campeonato == null) {
            cadastro_Campeonato = new Cadastro_Campeonato();
        }
        cadastro_Campeonato.setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

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
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Clube.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Cadastro_Clube().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> ComboCategoria;
    private javax.swing.JButton JBtnLimpar;
    private javax.swing.JButton JBtnSair;
    private javax.swing.JButton JbtnSalvar;
    private javax.swing.JLabel LbCat;
    private javax.swing.JLabel LbMascote;
    private javax.swing.JLabel LbNome;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JTextField TxtCategoria;
    private javax.swing.JTextField TxtMAscote;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
