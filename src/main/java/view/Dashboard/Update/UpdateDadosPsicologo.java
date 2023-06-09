package view.Dashboard.Update;

import model.dao.PsicologoDAO;
import javax.swing.*;
import model.bean.Psicologo;
import view.Dashboard.DashboardMeuPerfil;
import view.SelectedCadastroPsicologo.InsertEnderecoPsicologo;
import view.ViewLogin;

public class UpdateDadosPsicologo extends javax.swing.JFrame {

    public UpdateDadosPsicologo() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
        // Define a imagem de fundo SVG
        Background.setSvgImage("images/Dashboard/Update/updateProfissional.svg", 1000, 640);
        // Imagem botão de retorno
        btnReturn.setSvgImage("images/returnIcon.svg", 44, 35);
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
        btnReturn = new images.SVGImage();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCrm = new javax.swing.JTextField();
        txtProfissionalizacao = new javax.swing.JTextField();
        txtTipoAtendimento = new javax.swing.JTextField();
        senhaPasswordField1 = new javax.swing.JPasswordField();
        senhaPasswordField2 = new javax.swing.JPasswordField();
        btnAtualizarDados = new javax.swing.JButton();
        Background = new images.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados Pessoais | Psicologo");
        setName("InsertPersonalDataFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 44, 35));

        txtNome.setBackground(new java.awt.Color(247, 247, 247));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setBorder(null);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 149, 230, 30));

        txtEmail.setBackground(new java.awt.Color(247, 247, 247));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 194, 230, 30));

        txtCrm.setEditable(false);
        txtCrm.setBackground(new java.awt.Color(247, 247, 247));
        txtCrm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCrm.setBorder(null);
        txtCrm.setEnabled(false);
        jPanel1.add(txtCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 239, 230, 30));

        txtProfissionalizacao.setBackground(new java.awt.Color(247, 247, 247));
        txtProfissionalizacao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtProfissionalizacao.setBorder(null);
        jPanel1.add(txtProfissionalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 284, 230, 30));

        txtTipoAtendimento.setBackground(new java.awt.Color(247, 247, 247));
        txtTipoAtendimento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTipoAtendimento.setBorder(null);
        jPanel1.add(txtTipoAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 329, 230, 30));

        senhaPasswordField1.setBackground(new java.awt.Color(247, 247, 247));
        senhaPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        senhaPasswordField1.setBorder(null);
        senhaPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaPasswordField1FocusGained(evt);
            }
        });
        jPanel1.add(senhaPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 374, 230, 30));

        senhaPasswordField2.setBackground(new java.awt.Color(247, 247, 247));
        senhaPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        senhaPasswordField2.setBorder(null);
        jPanel1.add(senhaPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 419, 230, 30));

        btnAtualizarDados.setBackground(new java.awt.Color(227, 1, 64));
        btnAtualizarDados.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAtualizarDados.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarDados.setText("Atualizar");
        btnAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 459, 245, 38));
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        InsertEnderecoPsicologo returnToAddress = new InsertEnderecoPsicologo();
        returnToAddress.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDadosActionPerformed
        String email = ViewLogin.emailLogin;
        String nome = txtNome.getText();
        String profissionalizacao = txtProfissionalizacao.getText();
        String tipo = txtTipoAtendimento.getText();
        String senha1 = new String(senhaPasswordField1.getPassword());
        String senha2 = new String(senhaPasswordField2.getPassword());
        //Verifica se as senehas são iguais
        if (senha1.equals(senha2)) {
            try {
                // Criando um objeto Psicologo com os dados inseridos
                Psicologo psicologo = new Psicologo(0, nome, profissionalizacao, tipo, email, senha1);
                PsicologoDAO psicologodao = new PsicologoDAO();
                // Inserindo o psicologo no banco de dados
                psicologodao.updatePsicologo(psicologo);
                System.out.println("Psicologo atualizado com sucesso");
                DashboardMeuPerfil returnToMeuPerfil = new DashboardMeuPerfil();
                returnToMeuPerfil.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                System.out.println("Não foi possível atualizar psicologo " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Suas senhas não coincidem. Tente novamente.");
        }

    }//GEN-LAST:event_btnAtualizarDadosActionPerformed

    private void senhaPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaPasswordField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordField1FocusGained

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
            java.util.logging.Logger.getLogger(UpdateDadosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDadosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDadosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDadosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDadosPsicologo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.SVGImage Background;
    private javax.swing.JButton btnAtualizarDados;
    private images.SVGImage btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField senhaPasswordField1;
    private javax.swing.JPasswordField senhaPasswordField2;
    private javax.swing.JTextField txtCrm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProfissionalizacao;
    private javax.swing.JTextField txtTipoAtendimento;
    // End of variables declaration//GEN-END:variables
}
