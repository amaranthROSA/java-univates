/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.QuartoDAO;
import java.util.List;
import model.Quarto;
import types.SituacaoQuartoType;

/**
 *
 * @author amaranth.rosa
 */
public class ConsultaQuarto extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaQuarto
     */
    public ConsultaQuarto() {
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

        fieldNumero = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quartoResult = new javax.swing.JTextArea();
        labelQuarto = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelNumero.setText("Número:");

        quartoResult.setEditable(false);
        quartoResult.setColumns(20);
        quartoResult.setRows(5);
        jScrollPane1.setViewportView(quartoResult);

        labelQuarto.setText("Quarto:");

        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Livre", "Ocupado", "Aguardando limpeza", "Desativado" }));

        jLabel1.setText("Situação:");

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Consulta de Quartos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(comboSituacao, 0, 1, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelQuarto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonBuscar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(labelQuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(buttonBuscar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
//        QuartoDAO dao = QuartoDAO.getInstance();
//
//        if (this.fieldNumero != null) {
//            List<Quarto> quartosFound = dao.findQuartoByNumero(this.fieldNumero.getText());
//
//            if (quartosFound != null) {
//                StringBuilder stb = new StringBuilder();
//                quartosFound.forEach(quarto -> {
//                    stb.append(quarto.getDescription());
//                });
//
//                quartoResult.setText(stb.toString());
//            }
//
//        } else if (!this.comboSituacao.equals(" ")) {
//            String description = (String.valueOf(this.comboSituacao.getSelectedItem()));
//            SituacaoQuartoType situacao = null;
//
//            if (description.equals(SituacaoQuartoType.LIVRE.getDescription())) {
//                situacao = SituacaoQuartoType.LIVRE;
//            } else if (description.equals(SituacaoQuartoType.OCUPADO.getDescription())) {
//                situacao = SituacaoQuartoType.OCUPADO;
//            } else if (description.equals(SituacaoQuartoType.AGUARDANDO_LIMPEZA.getDescription())) {
//                situacao = SituacaoQuartoType.AGUARDANDO_LIMPEZA;
//            } else if (description.equals(SituacaoQuartoType.DESATIVADO.getDescription())) {
//                situacao = SituacaoQuartoType.DESATIVADO;
//            }
//
//            List<Quarto> quartosFound = null;
//            if (situacao != null) {
//                quartosFound = dao.findQuartoBySituacao(situacao);
//            }
//
//            if (quartosFound != null) {
//                StringBuilder stb = new StringBuilder();
//                quartosFound.forEach(quarto -> {
//                    stb.append(quarto.getDescription());
//                });
//
//                quartoResult.setText(stb.toString());
//            }
//        } else {
//
//            List<Quarto> quartosFound = dao.listQuartos();
//            if (quartosFound != null) {
//                StringBuilder stb = new StringBuilder();
//                quartosFound.forEach(quarto -> {
//                    stb.append(quarto.getDescription());
//                });
//
//                quartoResult.setText(stb.toString());
//            }
//
//        }

    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(ConsultaQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaQuarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JComboBox<String> comboSituacao;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelQuarto;
    private javax.swing.JTextArea quartoResult;
    // End of variables declaration//GEN-END:variables
}
