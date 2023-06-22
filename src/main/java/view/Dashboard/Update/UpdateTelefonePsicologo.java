package view.Dashboard.Update;

import view.SelectedCadastroPsicologo.*;
import javax.swing.*;
import model.bean.Telefone;
import model.dao.PsicologoDAO;
import view.Dashboard.DashboardMeuPerfil;
import view.ViewLogin;
import view.ViewSelectTypeCadastro;

public class UpdateTelefonePsicologo extends javax.swing.JFrame {

    public UpdateTelefonePsicologo() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
        // Define a imagem de fundo SVG
        Background.setSvgImage("images/Dashboard/Update/updateTelefone.svg", 1000, 640);
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
        txtCelular = new javax.swing.JTextField();
        txtCelular1 = new javax.swing.JTextField();
        btnAtualizarTelefone = new javax.swing.JButton();
        Background = new images.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contato | Psicologo");
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

        txtCelular.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular.setBorder(null);
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 261, 230, 30));

        txtCelular1.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular1.setBorder(null);
        txtCelular1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelular1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelular1FocusLost(evt);
            }
        });
        jPanel1.add(txtCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 306, 230, 30));

        btnAtualizarTelefone.setBackground(new java.awt.Color(227, 1, 64));
        btnAtualizarTelefone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAtualizarTelefone.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarTelefone.setText("Atualizar");
        btnAtualizarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizarTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 345, 245, 38));

        Background.setText("sVGImage1");
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
    /*Ação do botão voltar*/
    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        ViewSelectTypeCadastro returnToTypeCadastro = new ViewSelectTypeCadastro();
        returnToTypeCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnAtualizarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTelefoneActionPerformed
        String celular = txtCelular.getText();
        String celular1 = txtCelular1.getText();
        // Verifica se os número são iguais
        if (celular.equals(celular1)) {
            try {
                // Criando um objeto Telefone com os dados inseridos
                Telefone telefone = new Telefone(0, celular);
                PsicologoDAO psicologodao = new PsicologoDAO();
                String email = ViewLogin.emailLogin;
                // Inserindo o telefone no banco de dados
                psicologodao.updateTelefonePsicologo(email,telefone);
                System.out.println("Telefone inserido com sucesso.");
                DashboardMeuPerfil returnToMeuPerfil = new DashboardMeuPerfil();
                returnToMeuPerfil.setVisible(true);
                this.dispose();

            } catch (Exception e) {
                System.out.println("Não foi possivel inserir" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Números não coincidem. Tente novamente.");
        }
    }//GEN-LAST:event_btnAtualizarTelefoneActionPerformed

    private void txtCelular1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelular1FocusGained
        if (txtCelular1.getText().equals("Número Comercial")) {
            txtCelular1.setText("");
        }
    }//GEN-LAST:event_txtCelular1FocusGained

    private void txtCelular1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelular1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelular1FocusLost

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
            java.util.logging.Logger.getLogger(UpdateTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UpdateTelefonePsicologo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.SVGImage Background;
    private javax.swing.JButton btnAtualizarTelefone;
    private images.SVGImage btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelular1;
    // End of variables declaration//GEN-END:variables
}
