package view.SelectedCadastroPsicologo;

import javax.swing.*;
import model.bean.Telefone;
import model.dao.PsicologoDAO;
import view.ViewSelectTypeCadastro;

public class InsertTelefonePsicologo extends javax.swing.JFrame {

    public InsertTelefonePsicologo() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
        // Define a imagem de fundo SVG
        Background.setSvgImage("images/InsertTelefoneProfissionalBackgroung.svg", 1000, 640);
        // Imagem botão de retorno
        btnReturn.setSvgImage("images/returnIcon.svg", 44, 35);
        //FocusGained Placeholder
        txtCelular.setFocusable(true);
        txtCelular1.setFocusable(true);
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
        btnInserirTelefone = new javax.swing.JButton();
        Background = new images.SVGImage();
        jLabel1 = new javax.swing.JLabel();

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
        txtCelular.setText("Número Comercial");
        txtCelular.setBorder(null);
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 261, 230, 30));

        txtCelular1.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular1.setText("Número Comercial");
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

        btnInserirTelefone.setBackground(new java.awt.Color(227, 1, 64));
        btnInserirTelefone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInserirTelefone.setForeground(new java.awt.Color(255, 255, 255));
        btnInserirTelefone.setText("Próximo");
        btnInserirTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnInserirTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 345, 245, 38));

        Background.setText("sVGImage1");
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Insira seu telefone comercial");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 227, -1, -1));

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

    private void btnInserirTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirTelefoneActionPerformed
        String celular = txtCelular.getText();
        String celular1 = txtCelular.getText();
        // Verifica se o número de celular da primera label é igual o da segunda
        if (celular.equals(celular1)) {
            try {
                // Criando um objeto Telefone com os dados inseridos
                Telefone telefone = new Telefone(0, celular);
                PsicologoDAO psicologodao = new PsicologoDAO();
                // Inserindo o telefone no banco de dados
                psicologodao.createTelefonePsicologo(telefone);
                System.out.println("Telefone inserido com sucesso.");
                InsertEnderecoPsicologo clickNextPage = new InsertEnderecoPsicologo();
                clickNextPage.setVisible(true);
                this.dispose();

            } catch (Exception e) {
                System.out.println("Não foi possivel inserir" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Números não coincidem. Tente novamente.");
        }

    }//GEN-LAST:event_btnInserirTelefoneActionPerformed
    //FocusGained (Funciona para limpar o campo quando é selecionado)
    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        if (txtCelular.getText().equals("Número Comercial")) {
            txtCelular.setText("");
        }
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtCelular1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelular1FocusGained
        if (txtCelular1.getText().equals("Número Comercial")) {
            txtCelular1.setText("");
        }
    }//GEN-LAST:event_txtCelular1FocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularFocusLost

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
            java.util.logging.Logger.getLogger(InsertTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertTelefonePsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InsertTelefonePsicologo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.SVGImage Background;
    private javax.swing.JButton btnInserirTelefone;
    private images.SVGImage btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelular1;
    // End of variables declaration//GEN-END:variables
}
