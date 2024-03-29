/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_a3;

/**
 *
 * @author netoe
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicial
     */
    public MenuInicial() {
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

        ImagemTopo = new javax.swing.JLabel();
        BotaoVehicles = new javax.swing.JButton();
        BotaoClient = new javax.swing.JButton();
        BotaoSales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(0, 0, 153));
        setLocation(new java.awt.Point(560, 100));
        setMinimumSize(new java.awt.Dimension(793, 174));
        setResizable(false);
        setSize(new java.awt.Dimension(793, 174));

        ImagemTopo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_a3/imagens/Inicial.png"))); // NOI18N

        BotaoVehicles.setText("Vehicles");
        BotaoVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoVehiclesMouseClicked(evt);
            }
        });

        BotaoClient.setText(" Client");
        BotaoClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoClientMouseClicked(evt);
            }
        });

        BotaoSales.setText("Sales");
        BotaoSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSalesMouseClicked(evt);
            }
        });
        BotaoSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagemTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(BotaoVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(BotaoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoSales, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ImagemTopo)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoVehicles)
                    .addComponent(BotaoClient)
                    .addComponent(BotaoSales))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalesActionPerformed

    private void BotaoClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoClientMouseClicked
        TelaCadastroCliente NovaTela = new TelaCadastroCliente();
        NovaTela.setVisible(true);
        
    }//GEN-LAST:event_BotaoClientMouseClicked

    private void BotaoVehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVehiclesMouseClicked
        TelaCadastroVeiculos NovaTela = new TelaCadastroVeiculos();
        NovaTela.setVisible(true);
    }//GEN-LAST:event_BotaoVehiclesMouseClicked

    private void BotaoSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalesMouseClicked
        TelaVenda NovaTela = new TelaVenda();
        NovaTela.setVisible(true);
    }//GEN-LAST:event_BotaoSalesMouseClicked

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoClient;
    private javax.swing.JButton BotaoSales;
    private javax.swing.JButton BotaoVehicles;
    private javax.swing.JLabel ImagemTopo;
    // End of variables declaration//GEN-END:variables
}
