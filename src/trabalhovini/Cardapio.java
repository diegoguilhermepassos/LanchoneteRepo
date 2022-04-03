
package trabalhovini;

import javax.swing.JOptionPane;



public class Cardapio extends javax.swing.JFrame {

    
    
   
    
    public Cardapio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TFcoca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BTparaNotaFiscal = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFpipoca = new javax.swing.JTextField();
        TFcoxinha = new javax.swing.JTextField();
        TFagua = new javax.swing.JTextField();
        TFpastel = new javax.swing.JTextField();
        TFburge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFbolo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFtorta = new javax.swing.JTextField();
        TFsuco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TFcoca.setBackground(new java.awt.Color(255, 255, 0));
        TFcoca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFcoca.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/caixa-de-pipoca.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/pastel.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/coxinha.png"))); // NOI18N
        jLabel5.setText("pipoca");

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/sanduiche.png"))); // NOI18N

        BTparaNotaFiscal.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        BTparaNotaFiscal.setText("Continuar");
        BTparaNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTparaNotaFiscalActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/coke (1).png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(204, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/bottle.png"))); // NOI18N

        TFpipoca.setBackground(new java.awt.Color(255, 255, 0));
        TFpipoca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFpipoca.setForeground(new java.awt.Color(0, 0, 0));

        TFcoxinha.setBackground(new java.awt.Color(255, 255, 0));
        TFcoxinha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFcoxinha.setForeground(new java.awt.Color(0, 0, 0));

        TFagua.setBackground(new java.awt.Color(255, 255, 0));
        TFagua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFagua.setForeground(new java.awt.Color(0, 0, 0));

        TFpastel.setBackground(new java.awt.Color(255, 255, 0));
        TFpastel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFpastel.setForeground(new java.awt.Color(0, 0, 0));

        TFburge.setBackground(new java.awt.Color(255, 255, 0));
        TFburge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFburge.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("Cardápio");

        jLabel10.setBackground(new java.awt.Color(204, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/bolo.png"))); // NOI18N

        TFbolo.setBackground(new java.awt.Color(255, 255, 0));
        TFbolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFbolo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(204, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/suco-de-laranja.png"))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(204, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhovini/torta.png"))); // NOI18N

        TFtorta.setBackground(new java.awt.Color(255, 255, 0));
        TFtorta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFtorta.setForeground(new java.awt.Color(0, 0, 0));

        TFsuco.setBackground(new java.awt.Color(255, 255, 0));
        TFsuco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFsuco.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(TFcoca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(TFpipoca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(TFcoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TFbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(TFtorta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(TFsuco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TFpastel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(TFagua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(TFburge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(BTparaNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFcoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFagua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFpipoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFcoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(TFtorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFsuco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFpastel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFburge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BTparaNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTparaNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTparaNotaFiscalActionPerformed
       
    int number = Integer.parseInt(TFcoca.getText());
    
    int quantCoca = number * 5;
    
    int agua = Integer.parseInt(TFcoca.getText());
    
    int quantAgua = agua * 2;
    
    int pipoca = Integer.parseInt(TFcoca.getText());
    
    int quantPipoca = pipoca * 6;
    
    int bolo = Integer.parseInt(TFcoca.getText());
    
    int quantBolo = bolo * 4;
    
    int coxinha = Integer.parseInt(TFcoca.getText());
    
    int quantCoxinha = coxinha * 3;
    
    int pastel = Integer.parseInt(TFcoca.getText());
    
    int quantPastel = pastel * 7;
    
    int burge = Integer.parseInt(TFcoca.getText());
    
    int quantBurge = burge * 10;
    
    int torta = Integer.parseInt(TFcoca.getText());
    
    int quantTorta = torta * 7;
    
    int suco = Integer.parseInt(TFcoca.getText());
    
    int quantSuco = suco * 7;
    
    int total = quantCoca + quantAgua + quantPipoca + quantBolo + quantCoxinha + quantPastel + quantBurge + quantTorta + quantSuco;
    
        
        
       JOptionPane.showMessageDialog(null,"NotaFiscal:\n"
               + TFcoca.getText() + " - Coca-cola, Valor: $" + quantCoca +"\n"
               + TFagua.getText() + " - Água, Valor: $" + quantAgua +"\n"
               + TFpipoca.getText() + " - Pipoca, Valor: $" + quantPipoca +" \n"
               + TFbolo.getText() + " - Bolo, Valor: $" + quantBolo +" \n"
               + TFcoxinha.getText() + " - Coxinha, Valor: $" + quantCoxinha +" \n"
               + TFpastel.getText() + " - Pastel, Valor: $" + quantPastel +" \n"
               + TFburge.getText() + " - Lanches, Valor: $" + quantBurge +" \n"
               + TFtorta.getText() + " - Torta, Valor: $" + quantTorta +" \n"
               + TFsuco.getText() + " - Suco, Valor:$ " + quantSuco +" \n"
               + "Total:$"  + total);
       
    }//GEN-LAST:event_BTparaNotaFiscalActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cardapio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BTparaNotaFiscal;
    private javax.swing.JTextField TFagua;
    private javax.swing.JTextField TFbolo;
    private javax.swing.JTextField TFburge;
    private javax.swing.JTextField TFcoca;
    private javax.swing.JTextField TFcoxinha;
    private javax.swing.JTextField TFpastel;
    private javax.swing.JTextField TFpipoca;
    private javax.swing.JTextField TFsuco;
    private javax.swing.JTextField TFtorta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
