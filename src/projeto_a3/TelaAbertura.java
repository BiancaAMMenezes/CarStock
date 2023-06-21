/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_a3;

import Models.Employee;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class TelaAbertura extends javax.swing.JFrame {

    public TelaAbertura() {
        initComponents();
       
    }
    private String email;
    private String password;
    private JTextField tf = new JTextField(40);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImagemAbertura = new javax.swing.JLabel();
        TextoLoginAbertura = new javax.swing.JLabel();
        CaixadeEmail = new javax.swing.JTextField();
        CaixaSenha = new javax.swing.JTextField();
        CheckLembrarSenha = new javax.swing.JCheckBox();
        BotaoSignIn = new javax.swing.JButton();
        TextoNovo = new javax.swing.JLabel();
        TextoCreateAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setLocation(new java.awt.Point(560, 280));
        setMaximumSize(new java.awt.Dimension(799, 514));
        setMinimumSize(new java.awt.Dimension(799, 514));
        setPreferredSize(new java.awt.Dimension(799, 514));
        setResizable(false);
        setSize(new java.awt.Dimension(799, 514));

        ImagemAbertura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_a3/imagens/sTOCK.png"))); // NOI18N
        ImagemAbertura.setText("jLabel1");
        ImagemAbertura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextoLoginAbertura.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        TextoLoginAbertura.setForeground(new java.awt.Color(0, 0, 0));
        TextoLoginAbertura.setText("Sign In");

        CaixadeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixadeEmailActionPerformed(evt);
            }
        });

        CaixaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaSenhaActionPerformed(evt);
            }
        });

        CheckLembrarSenha.setText("Remember-me");

        BotaoSignIn.setText("Sign In");
        BotaoSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSignInMouseClicked(evt);
            }
        });

        TextoNovo.setText("New here?");

        TextoCreateAccount.setForeground(new java.awt.Color(51, 51, 255));
        TextoCreateAccount.setText("Create an Account");
        TextoCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoCreateAccountMouseClicked(evt);
            }
        });

        jLabel1.setText("Email");

        jLabel2.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ImagemAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CheckLembrarSenha)
                                        .addComponent(CaixadeEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CaixaSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BotaoSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoLoginAbertura)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(TextoNovo)
                        .addGap(51, 51, 51)
                        .addComponent(TextoCreateAccount)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(TextoLoginAbertura)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixadeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(CheckLembrarSenha)
                .addGap(30, 30, 30)
                .addComponent(BotaoSignIn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCreateAccount)
                    .addComponent(TextoNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ImagemAbertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ImagemAbertura.getAccessibleContext().setAccessibleName("Sign In");
        ImagemAbertura.getAccessibleContext().setAccessibleDescription("Sign In");

        getAccessibleContext().setAccessibleDescription("Sign In");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CaixadeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixadeEmailActionPerformed
        email = tf.getText();
    }//GEN-LAST:event_CaixadeEmailActionPerformed

    private void TextoCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoCreateAccountMouseClicked
        TelaCadastro NovaTela = new TelaCadastro();
        NovaTela.setVisible(true);
        
        TelaCadastro FecharTela = new TelaCadastro(); 
        FecharTela.setVisible(false); dispose();
    }//GEN-LAST:event_TextoCreateAccountMouseClicked

    private void BotaoSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSignInMouseClicked
        Employee employee = new Employee();       
        try {
            if(employee.VerifyRegistration( CaixadeEmail.getText() , CaixaSenha.getText())){
                MenuInicial NovaTela = new MenuInicial();
                NovaTela.setVisible(true);
                
                MenuInicial FecharTela = new MenuInicial();
                FecharTela.setVisible(false); dispose();
            }
            else{
                DadosInvalidos NovaTela = new DadosInvalidos();
                NovaTela.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaAbertura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BotaoSignInMouseClicked

    private void CaixaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaSenhaActionPerformed
        password = tf.getText();
    }//GEN-LAST:event_CaixaSenhaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAbertura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSignIn;
    private javax.swing.JTextField CaixaSenha;
    private javax.swing.JTextField CaixadeEmail;
    private javax.swing.JCheckBox CheckLembrarSenha;
    private javax.swing.JLabel ImagemAbertura;
    private javax.swing.JLabel TextoCreateAccount;
    private javax.swing.JLabel TextoLoginAbertura;
    private javax.swing.JLabel TextoNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
