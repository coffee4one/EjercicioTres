/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsaldoinicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsaldofinal = new javax.swing.JTextField();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel1.setText("Calcular el saldo final con interes del 1.5%");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel2.setText("Saldo inicial:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtsaldoinicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsaldoinicialKeyTyped(evt);
            }
        });
        jPanel1.add(txtsaldoinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, -1));

        jLabel3.setText("Saldo final:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        txtsaldofinal.setEditable(false);
        jPanel1.add(txtsaldofinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 120, -1));

        cmdcalcular.setText("calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        cmdborrar.setText("borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
            String sinicial, sfinal;
            double saldoi, saldof,interes;
            
            if (txtsaldoinicial.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite el saldo inicial", "Error", JOptionPane.ERROR_MESSAGE);
                txtsaldoinicial.requestFocusInWindow();
            }else{
                
                saldoi=Double.parseDouble(txtsaldoinicial.getText());
                interes=(saldoi*1.5)/100;
                saldof=saldoi+interes;
                
                sfinal= String.valueOf(saldof);
                
                txtsaldofinal.setText(sfinal);
            }
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
            txtsaldoinicial.setText("");
            txtsaldofinal.setText("");
            
            txtsaldoinicial.requestFocusInWindow();
    }//GEN-LAST:event_cmdborrarActionPerformed

    private void txtsaldoinicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsaldoinicialKeyTyped
             char c=evt.getKeyChar();
            
            if (!Character.isDigit(c) && c != '.') {
                getToolkit().beep();
                evt.consume();
        }
    }//GEN-LAST:event_txtsaldoinicialKeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtsaldofinal;
    private javax.swing.JTextField txtsaldoinicial;
    // End of variables declaration//GEN-END:variables
}
