/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.SelectedCadastroPaciente;

/**
 *
 * @author couto
 */
public class InsertPersonalData extends javax.swing.JFrame {

    /**
     * Creates new form InsertPersonalData
     */
    public InsertPersonalData() {
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
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btnProximaTela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Paciente");
        setMaximumSize(new java.awt.Dimension(1000, 640));
        setName("InsertPersonalDataFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setBackground(new java.awt.Color(247, 247, 247));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setText("Nome");
        txtNome.setBorder(null);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 216, 230, 30));

        txtEmail.setBackground(new java.awt.Color(247, 247, 247));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.setText("E-mail");
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 261, 230, 30));

        txtCelular.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular.setText("Celular");
        txtCelular.setBorder(null);
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 306, 230, 30));

        txtCpf.setBackground(new java.awt.Color(247, 247, 247));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpf.setText("CPF");
        txtCpf.setBorder(null);
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 351, 230, 30));

        btnProximaTela.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProximaTela.setText("Próximo");
        jPanel1.add(btnProximaTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 390, 245, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CadastroPaciente1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

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
            java.util.logging.Logger.getLogger(InsertPersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertPersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertPersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertPersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertPersonalData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProximaTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
