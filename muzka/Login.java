/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usjt.muzka;


import com.usjt.muzkaBD.UsuarioDAO;
import com.usjt.muzkaCod.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author steph
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        super("Faça seu login  no MuZKa!");
        initComponents();
        setLocationRelativeTo(null);
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
        btnOkLogin = new javax.swing.JButton();
        passwordSenhaLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtNomeLogin = new javax.swing.JTextField();
        btnCadastrese = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnOkLogin.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnOkLogin.setText("Entrar");
        btnOkLogin.setPreferredSize(new java.awt.Dimension(208, 46));
        btnOkLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkLoginActionPerformed(evt);
            }
        });

        passwordSenhaLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 12))); // NOI18N
        passwordSenhaLogin.setPreferredSize(new java.awt.Dimension(208, 46));
        passwordSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordSenhaLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("MuZKa");

        txtNomeLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome de usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 12))); // NOI18N
        txtNomeLogin.setName("txtLogin"); // NOI18N
        txtNomeLogin.setPreferredSize(new java.awt.Dimension(208, 46));
        txtNomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeLoginActionPerformed(evt);
            }
        });

        btnCadastrese.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnCadastrese.setText("Não tem cadastro? Cadastre-se aqui!");
        btnCadastrese.setPreferredSize(new java.awt.Dimension(208, 46));
        btnCadastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordSenhaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(txtNomeLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOkLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOkLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrese, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreseActionPerformed
        // TODO add your handling code here:
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastreseActionPerformed

    private void passwordSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordSenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordSenhaLoginActionPerformed

    private void btnOkLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkLoginActionPerformed
        // TODO add your handling code here:
        logar();
    }//GEN-LAST:event_btnOkLoginActionPerformed

    public void logar(){
        String login = txtNomeLogin.getText();
        String senha = new String(passwordSenhaLogin.getPassword());

        try {
            //verifica se o usuário é válido
            Usuario usuario = new Usuario(login, senha);
            UsuarioDAO usuarioDao = new UsuarioDAO();
            if (usuarioDao.existe(usuario)) {
                JOptionPane.showMessageDialog(null, "Bem vindo, " + usuario.getNome() + "!");
                int id = usuarioDao.consultaId(usuario);
                //JOptionPane.showMessageDialog(null, "ID: " + id); teste se o consultaId funcionou
                usuario.setId(id);//coloca ID na variavel id do objeto usuário
                
                if (usuario.getId() == 1){//verifica se é o usuário admin
                    DashboardAdmin dashA = new DashboardAdmin();
                    dashA.setVisible(true);
                    this.dispose();
                }else{
                    Dashboard dt = new Dashboard(usuario);
                    dt.setVisible(true);
                    this.dispose(); 
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário inválido");
                txtNomeLogin.setText("");
                passwordSenhaLogin.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar banco de dados");
            e.printStackTrace();
        }
    }
    
    private void txtNomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrese;
    private javax.swing.JButton btnOkLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordSenhaLogin;
    private javax.swing.JTextField txtNomeLogin;
    // End of variables declaration//GEN-END:variables
}
