/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.QuartoDAO;
import javax.swing.JOptionPane;
import messages.MessagesQuarto;
import model.Quarto;
import model.QuartoSimples;
import types.SimNaoType;
import types.SituacaoQuartoType;
import types.TipoQuartoType;

/**
 *
 * @author amaranth.rosa
 */
public class CadastraQuarto extends javax.swing.JFrame {

    /**
     * Creates new form CadastraQuarto
     */
    public CadastraQuarto() {
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

        labelNumero = new javax.swing.JLabel();
        fieldNumero = new javax.swing.JTextField();
        labelSituacao = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox<>();
        buttonCadastrar = new javax.swing.JButton();
        comboFumante = new javax.swing.JComboBox<>();
        labelFumante = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        labelTipo = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelNumero.setText("Número:");

        labelSituacao.setText("Situação:");

        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Livre", "Ocupado", "Aguardando limpeza", "Desativado" }));

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        comboFumante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sim", "Não" }));

        labelFumante.setText("Fumante:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cadastro de Quartos");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Simples", "Triplo", "Familia" }));

        labelTipo.setText("Tipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCadastrar)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelNumero)
                        .addGap(21, 21, 21)
                        .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSituacao)
                                    .addComponent(labelFumante)
                                    .addComponent(labelTipo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboFumante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSituacao))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFumante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFumante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCadastrar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        QuartoDAO dao = QuartoDAO.getInstance();

        if (fieldNumero != null && !comboFumante.equals(" ") && !comboTipo.equals(" ") && !comboSituacao.equals(" ")) {
            Quarto quarto = null;

            //------------------
            if (String.valueOf(comboTipo.getSelectedItem()).equals(TipoQuartoType.SIMPLES.getDescription())) {
                quarto = new QuartoSimples(this.fieldNumero.getText(), TipoQuartoType.SIMPLES);
            } else if (String.valueOf(comboTipo.getSelectedItem()).equals(TipoQuartoType.TRIPLO.getDescription())) {
                quarto = new QuartoSimples(this.fieldNumero.getText(), TipoQuartoType.TRIPLO);
            } else if (String.valueOf(comboTipo.getSelectedItem()).equals(TipoQuartoType.FAMILIA.getDescription())) {
                quarto = new QuartoSimples(this.fieldNumero.getText(), TipoQuartoType.FAMILIA);
            }
            //------------------
            if (String.valueOf(comboFumante.getSelectedItem()).equals(SimNaoType.SIM.getDescription())) {
                quarto.setFumante(true);
            } else {
                quarto.setFumante(false);
            }
            //------------------
            if (String.valueOf(comboSituacao.getSelectedItem()).equals(SituacaoQuartoType.LIVRE.getDescription())) {
                quarto.setSituacaoQuarto(SituacaoQuartoType.LIVRE);
            } else if (String.valueOf(comboSituacao.getSelectedItem()).equals(SituacaoQuartoType.OCUPADO.getDescription())) {
                quarto.setSituacaoQuarto(SituacaoQuartoType.OCUPADO);
            } else if (String.valueOf(comboSituacao.getSelectedItem()).equals(SituacaoQuartoType.AGUARDANDO_LIMPEZA.getDescription())) {
                quarto.setSituacaoQuarto(SituacaoQuartoType.AGUARDANDO_LIMPEZA);
            } else if (String.valueOf(comboSituacao.getSelectedItem()).equals(SituacaoQuartoType.DESATIVADO.getDescription())) {
                quarto.setSituacaoQuarto(SituacaoQuartoType.DESATIVADO);
            }

            if (quarto != null) {
                dao.addQuarto(quarto);

                JOptionPane.showMessageDialog(null, MessagesQuarto.SUCESSO_CADASTRO.getMessage());

            } else {
                JOptionPane.showMessageDialog(null, MessagesQuarto.ERRO_COMPLETAR_CADASTRO.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, MessagesQuarto.ERRO_CAMPOS_VAZIOS.getMessage());
        }

    }//GEN-LAST:event_buttonCadastrarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastraQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraQuarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JComboBox<String> comboFumante;
    private javax.swing.JComboBox<String> comboSituacao;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelFumante;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelTipo;
    // End of variables declaration//GEN-END:variables
}
