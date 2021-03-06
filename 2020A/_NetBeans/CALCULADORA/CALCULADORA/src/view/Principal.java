/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author amaranth.rosa
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        labelValor1 = new javax.swing.JLabel();
        labelValor2 = new javax.swing.JLabel();
        fieldValor1 = new javax.swing.JTextField();
        fieldValor2 = new javax.swing.JTextField();
        buttonSum = new javax.swing.JButton();
        buttonSub = new javax.swing.JButton();
        buttonMultp = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();
        labelResult = new javax.swing.JLabel();
        fieldResult = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelValor1.setText("Valor 1");

        labelValor2.setText("Valor 2");

        buttonSum.setText("+");
        buttonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumActionPerformed(evt);
            }
        });

        buttonSub.setText("-");
        buttonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubActionPerformed(evt);
            }
        });

        buttonMultp.setText("x");
        buttonMultp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultpActionPerformed(evt);
            }
        });

        buttonDivide.setText("÷");
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });

        labelResult.setText("Resultado");

        labelTitle.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(buttonSum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonMultp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDivide))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelValor1)
                                    .addGap(18, 18, 18)
                                    .addComponent(fieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelValor2)
                                    .addGap(18, 18, 18)
                                    .addComponent(fieldValor2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelResult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(labelTitle)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValor1)
                    .addComponent(fieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValor2)
                    .addComponent(fieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSum)
                    .addComponent(buttonSub)
                    .addComponent(buttonMultp)
                    .addComponent(buttonDivide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResult)
                    .addComponent(fieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumActionPerformed
      String value1 = fieldValor1.getText();
      String value2 = fieldValor2.getText();
      
      double result = 0;
      if(!value1.equals("") && !value2.equals("")) {
        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);
        result = v1+v2;
      }
          
       fieldResult.setText(String.valueOf(result));
      
    }//GEN-LAST:event_buttonSumActionPerformed

    private void buttonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubActionPerformed
             String value1 = fieldValor1.getText();
      String value2 = fieldValor2.getText();
      
      double result = 0;
      if(!value1.equals("") && !value2.equals("")) {
        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);
        result = v1-v2;
      }
          
       fieldResult.setText(String.valueOf(result));
    }//GEN-LAST:event_buttonSubActionPerformed

    private void buttonMultpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultpActionPerformed
      String value1 = fieldValor1.getText();
      String value2 = fieldValor2.getText();
      
      double result = 0;
      if(!value1.equals("") && !value2.equals("")) {
        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);
        result = v1*v2;
      }
          
       fieldResult.setText(String.valueOf(result));
    }//GEN-LAST:event_buttonMultpActionPerformed

    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivideActionPerformed
      String value1 = fieldValor1.getText();
      String value2 = fieldValor2.getText();
      
      double result = 0;
      if(!value1.equals("") && !value2.equals("")) {
        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);
        result = v1/v2;
      }
          
       fieldResult.setText(String.valueOf(result));
    }//GEN-LAST:event_buttonDivideActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonMultp;
    private javax.swing.JButton buttonSub;
    private javax.swing.JButton buttonSum;
    private javax.swing.JTextField fieldResult;
    private javax.swing.JTextField fieldValor1;
    private javax.swing.JTextField fieldValor2;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelValor1;
    private javax.swing.JLabel labelValor2;
    // End of variables declaration//GEN-END:variables
}
