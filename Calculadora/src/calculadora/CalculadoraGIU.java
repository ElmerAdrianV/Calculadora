/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author elmer
 */
public class CalculadoraGIU extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraGIU
     */
    public CalculadoraGIU() {
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
        btUno = new javax.swing.JButton();
        btDos = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btCuatro = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btSiete = new javax.swing.JButton();
        btOcho = new javax.swing.JButton();
        btNueve = new javax.swing.JButton();
        btCero = new javax.swing.JButton();
        btParenIzq = new javax.swing.JButton();
        btParenDer = new javax.swing.JButton();
        btSuma = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        btMulti = new javax.swing.JButton();
        btEntre = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btPunto = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        btBORRAR = new javax.swing.JButton();
        btC = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        btAns = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btUno.setText("1");
        btUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUnoActionPerformed(evt);
            }
        });

        btDos.setText("2");
        btDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDosActionPerformed(evt);
            }
        });

        btTres.setText("3");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });

        btCuatro.setText("4");
        btCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuatroActionPerformed(evt);
            }
        });

        btCinco.setText("5");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });

        btSeis.setText("6");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });

        btSiete.setText("7");
        btSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSieteActionPerformed(evt);
            }
        });

        btOcho.setText("8");
        btOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOchoActionPerformed(evt);
            }
        });

        btNueve.setText("9");
        btNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNueveActionPerformed(evt);
            }
        });

        btCero.setText("0");
        btCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCeroActionPerformed(evt);
            }
        });

        btParenIzq.setText("(");
        btParenIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParenIzqActionPerformed(evt);
            }
        });

        btParenDer.setText(")");
        btParenDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParenDerActionPerformed(evt);
            }
        });

        btSuma.setText("+");
        btSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumaActionPerformed(evt);
            }
        });

        btMenos.setText("-");
        btMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosActionPerformed(evt);
            }
        });

        btMulti.setText("*");
        btMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiActionPerformed(evt);
            }
        });

        btEntre.setText("/");
        btEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntreActionPerformed(evt);
            }
        });

        jButton1.setText("^");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btPunto.setText(".");
        btPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPuntoActionPerformed(evt);
            }
        });

        btIgual.setText("=");

        btBORRAR.setText("Borrar");
        btBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBORRARActionPerformed(evt);
            }
        });

        btC.setText("C");

        btAns.setText("Ans");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btCero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btParenIzq)
                        .addGap(18, 18, 18)
                        .addComponent(btParenDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAns))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btCuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCinco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSeis)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btUno)
                                        .addGap(13, 13, 13)
                                        .addComponent(btDos)
                                        .addGap(5, 5, 5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btSiete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btOcho)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btNueve))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(btTres)))
                                .addGap(115, 115, 115))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btBORRAR)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btMulti, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                            .addComponent(btSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                            .addComponent(btC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btIgual)
                            .addComponent(btBORRAR)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btDos)
                        .addComponent(btTres)
                        .addComponent(btMenos)
                        .addComponent(btUno))
                    .addComponent(btSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCuatro)
                        .addComponent(btCinco)
                        .addComponent(btSeis)
                        .addComponent(btEntre))
                    .addComponent(btMulti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSiete)
                    .addComponent(btOcho)
                    .addComponent(btNueve)
                    .addComponent(jButton1)
                    .addComponent(btPunto))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCero)
                    .addComponent(btParenIzq)
                    .addComponent(btParenDer)
                    .addComponent(btC)
                    .addComponent(btAns))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUnoActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"1");
    }//GEN-LAST:event_btUnoActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCincoActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"5");
    }//GEN-LAST:event_btCincoActionPerformed

    private void btOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOchoActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"8");
    }//GEN-LAST:event_btOchoActionPerformed

    private void btPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPuntoActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+".");
    }//GEN-LAST:event_btPuntoActionPerformed

    private void btDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDosActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"2");
    }//GEN-LAST:event_btDosActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"3");
    }//GEN-LAST:event_btTresActionPerformed

    private void btCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuatroActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"4");
        
    }//GEN-LAST:event_btCuatroActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeisActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"6");
    }//GEN-LAST:event_btSeisActionPerformed

    private void btSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSieteActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"7");
    }//GEN-LAST:event_btSieteActionPerformed

    private void btNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNueveActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"9");
    }//GEN-LAST:event_btNueveActionPerformed

    private void btCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCeroActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"0");
    }//GEN-LAST:event_btCeroActionPerformed

    private void btParenIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParenIzqActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"(");
    }//GEN-LAST:event_btParenIzqActionPerformed

    private void btParenDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParenDerActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+")");
        
    }//GEN-LAST:event_btParenDerActionPerformed

    private void btSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumaActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"+");
        
    }//GEN-LAST:event_btSumaActionPerformed

    private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"-");
    }//GEN-LAST:event_btMenosActionPerformed

    private void btMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"*");
    }//GEN-LAST:event_btMultiActionPerformed

    private void btEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntreActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"/");
    }//GEN-LAST:event_btEntreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        info.setText(info.getText()+"^");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBORRARActionPerformed
        // TODO add your handling code here:
        info.setText(" ");
    }//GEN-LAST:event_btBORRARActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGIU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAns;
    private javax.swing.JButton btBORRAR;
    private javax.swing.JButton btC;
    private javax.swing.JButton btCero;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btCuatro;
    private javax.swing.JButton btDos;
    private javax.swing.JButton btEntre;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btMulti;
    private javax.swing.JButton btNueve;
    private javax.swing.JButton btOcho;
    private javax.swing.JButton btParenDer;
    private javax.swing.JButton btParenIzq;
    private javax.swing.JButton btPunto;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSiete;
    private javax.swing.JButton btSuma;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUno;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
