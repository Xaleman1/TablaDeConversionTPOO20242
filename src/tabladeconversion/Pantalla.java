/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tabladeconversion;

/**
 *
 * @author ALEJANDRO
 */
public class Pantalla extends javax.swing.JFrame {
 
    public Pantalla() {
        initComponents();
    }
    
  String Memoria;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKgLb = new javax.swing.JButton();
        btnSolDol = new javax.swing.JButton();
        btnCF = new javax.swing.JButton();
        btnFeetMt = new javax.swing.JButton();
        txtDato = new javax.swing.JTextField();
        CInversa = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKgLb.setText("de Kg a Lb");
        btnKgLb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKgLbActionPerformed(evt);
            }
        });

        btnSolDol.setText("de Sol a Dolar");
        btnSolDol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolDolActionPerformed(evt);
            }
        });

        btnCF.setText("de C a F");
        btnCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCFActionPerformed(evt);
            }
        });

        btnFeetMt.setText("de Feet a Mt");
        btnFeetMt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeetMtActionPerformed(evt);
            }
        });

        CInversa.setText("     Inversa");
        CInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CInversaActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado");

        jLabel2.setText("Valor");

        jblResultado.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CInversa)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDato)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblResultado)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKgLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSolDol)))
                    .addComponent(btnFeetMt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKgLb)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolDol)
                    .addComponent(jLabel1)
                    .addComponent(jblResultado))
                .addGap(18, 18, 18)
                .addComponent(btnCF)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFeetMt)
                    .addComponent(CInversa))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolDolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolDolActionPerformed

Memoria = txtDato.getText();
txtDato.setText("");
double valor = Double.parseDouble(Memoria);
double resultado;

    resultado = valor / 3.77;
    jblResultado.setText(resultado + "");
    
    
    if(btnSolDol.isSelected()){
        resultado = valor * 3.77;
        jblResultado.setText(resultado +"");
        

}

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolDolActionPerformed

    private void btnKgLbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKgLbActionPerformed

Memoria = txtDato.getText();
txtDato.setText("");
double valor = Double.parseDouble(Memoria);
double resultado;

    resultado = valor * 2.2046 ;
    jblResultado.setText(resultado + "");
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKgLbActionPerformed

    private void btnCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCFActionPerformed
    
    Memoria = txtDato.getText();
    txtDato.setText("");
    double valor = Double.parseDouble(Memoria);
    double resultado;

    resultado = (valor * 9/5 ) + 32  ;
    jblResultado.setText(resultado + "");
    
    
    
    }//GEN-LAST:event_btnCFActionPerformed

    private void btnFeetMtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeetMtActionPerformed

    Memoria = txtDato.getText();
    txtDato.setText("");
    double valor = Double.parseDouble(Memoria);
    double resultado;

    resultado = valor / 3.281   ;
    jblResultado.setText(resultado + "");
    
    
    }//GEN-LAST:event_btnFeetMtActionPerformed

    private void CInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CInversaActionPerformed

    
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_CInversaActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CInversa;
    private javax.swing.JButton btnCF;
    private javax.swing.JButton btnFeetMt;
    private javax.swing.JButton btnKgLb;
    private javax.swing.JButton btnSolDol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jblResultado;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
