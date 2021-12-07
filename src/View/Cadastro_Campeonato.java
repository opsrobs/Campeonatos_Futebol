/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Clubes_Campeonatos.Campeonato;
import Clubes_Campeonatos.Categoria;
import java.sql.SQLException;
import Clubes_Campeonatos.Utils;
import Controller.ServicoBancoCampeonato;
import Controller.ServicoBancoCategoria;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author PremierSoft
 */
public class Cadastro_Campeonato extends javax.swing.JFrame {

    Campeonato campeonato = new Campeonato();
    private Categoria categoria = new Categoria();
    Utils utils = new Utils();
    ServicoBancoCampeonato sb = new ServicoBancoCampeonato();
    ServicoBancoCategoria sbcat = new ServicoBancoCategoria();

    public Cadastro_Campeonato() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LbNome = new javax.swing.JLabel();
        LbDataInicio = new javax.swing.JLabel();
        LbDataFim = new javax.swing.JLabel();
        LbCategoria = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtCategoria = new javax.swing.JTextField();
        JBtnLimpar = new javax.swing.JButton();
        JBtnSair = new javax.swing.JButton();
        JBtnSalvar = new javax.swing.JButton();
        ComboCategoria = new javax.swing.JComboBox<>();
        TxtDataInicio = new javax.swing.JFormattedTextField();
        TxtDataFim = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        MenuConsultas = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(-1);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MingLiU-ExtB", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRAR CAMPEONATOS...");

        LbNome.setText("NOME");

        LbDataInicio.setText("INICIO DO CAMPEONATO");

        LbDataFim.setText("FIM DO CAMPEONATO");

        LbCategoria.setText("CATEGORIA");

        JBtnLimpar.setText("LIMPAR");
        JBtnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnLimparMouseClicked(evt);
            }
        });
        JBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnLimparActionPerformed(evt);
            }
        });

        JBtnSair.setText("SAIR");
        JBtnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnSairMouseClicked(evt);
            }
        });

        JBtnSalvar.setText("SALVAR");
        JBtnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnSalvarMouseClicked(evt);
            }
        });

        ComboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboCategoriaItemStateChanged(evt);
            }
        });

        try {
            TxtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDataInicioActionPerformed(evt);
            }
        });

        try {
            TxtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        MenuCadastros.setText("Cadastros");
        jMenuBar1.add(MenuCadastros);

        MenuConsultas.setText("Consultas");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDataInicio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDataFim))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JBtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboCategoria, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtCategoria))))))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnLimparActionPerformed
        this.clearSc();
    }//GEN-LAST:event_JBtnLimparActionPerformed
    public void clearSc() {
        if (ComboCategoria.isDisplayable()) {
            ComboCategoria.setSelectedIndex(-1);
        }
        TxtNome.setText("");
        TxtDataInicio.setText("");
        TxtDataFim.setText("");
        TxtCategoria.setText("");
        TxtNome.requestFocus();
        JBtnLimpar.setEnabled(false);

    }

    private void cadastrarCategoria() throws ParseException {
        try {
            if (ComboCategoria.getSelectedIndex() >= 0) {

                Categoria categoria = (Categoria) ComboCategoria.getSelectedItem();
                assert categoria != null;
                categoria.setNome(TxtCategoria.getText());
                sbcat.update(categoria);
                this.cadastrarCampeonato(categoria.getCodigo());

            } else {
                Categoria categoria = new Categoria(TxtCategoria.getText());
                sbcat.insert(categoria);
            }
            clearSc();
            JOptionPane.showMessageDialog(
                    null, "Cadastrado com sucesso",
                    "Cadastro!!!", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon("C:\\Users\\PremierSoft\\IdeaProjects\\Campeonatos_Futebol\\src\\View\\Cadastro.gif"));
            utils.atualizarCategoria(ComboCategoria, sbcat);

        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Campeonato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cadastrarCampeonato(int codCategoria) throws ParseException {
        campeonato = new Campeonato(TxtNome.getText(), utils.strToDate(TxtDataInicio.getText()), utils.strToDate(TxtDataFim.getText()), codCategoria);
        try {
            sb.insert(campeonato);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Campeonato.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void JBtnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnSalvarMouseClicked
        if (TxtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe um nome!");
            TxtNome.requestFocus();
            return;
        }
        if (TxtDataInicio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a data de inicio do campeonato!");
            TxtCategoria.requestFocus();
            return;

        }
        if (TxtDataInicio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a data final do campeonato!");
            TxtCategoria.requestFocus();
            return;

        }
        if (TxtCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe uma categoria!");
            TxtNome.requestFocus();
            return;
        }

        try {

            this.cadastrarCategoria();

        } catch (ParseException ex) {
            Logger.getLogger(Cadastro_Campeonato.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.clearSc();

    }//GEN-LAST:event_JBtnSalvarMouseClicked

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
        dispose();
    }//GEN-LAST:event_MenuSairMouseClicked

    private void JBtnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnSairMouseClicked
        dispose();
    }//GEN-LAST:event_JBtnSairMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            utils.atualizarCategoria(ComboCategoria, sbcat);
            clearSc();

        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Campeonato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

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

    private void JBtnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnLimparMouseClicked
        clearSc();
    }//GEN-LAST:event_JBtnLimparMouseClicked

    private void TxtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDataInicioActionPerformed

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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Campeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Campeonato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> ComboCategoria;
    private javax.swing.JButton JBtnLimpar;
    private javax.swing.JButton JBtnSair;
    private javax.swing.JButton JBtnSalvar;
    private javax.swing.JLabel LbCategoria;
    private javax.swing.JLabel LbDataFim;
    private javax.swing.JLabel LbDataInicio;
    private javax.swing.JLabel LbNome;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JTextField TxtCategoria;
    private javax.swing.JFormattedTextField TxtDataFim;
    private javax.swing.JFormattedTextField TxtDataInicio;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
