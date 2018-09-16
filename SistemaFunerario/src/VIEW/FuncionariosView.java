package VIEW;

import CONTROLLER.FuncionarioController;
import CONTROLLER.NumericoController;
import DAO.FuncionarioDAO;
import MODEL.FuncionarioModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eu
 */
public class FuncionariosView extends javax.swing.JFrame {

    /**
     * Creates new form EmpresaView
     */
    public FuncionariosView() {
        initComponents();
        FuncionarioModel funcM = new FuncionarioModel();
        FuncionarioDAO funcD = new FuncionarioDAO();
        FuncionarioController funcC = new FuncionarioController(this, funcM, funcD);
        funcC.iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblIRG = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        cmbCivil = new javax.swing.JComboBox<>();
        lblCargo = new javax.swing.JLabel();
        lblCivil = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lblSexo = new javax.swing.JLabel();
        btnPesqFunc = new javax.swing.JButton();
        lblNome1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        txtNascimento = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblNome.setText("Nome da Funcionário:");

        lblCPF.setText("CPF:");

        lblIRG.setText("RG:");

        lblEndereco.setText("Endereço:");

        lblBairro.setText("Bairro:");

        lblCidade.setText("Cidade:");

        btnVoltar.setText("Voltar");
        btnVoltar.setPreferredSize(new java.awt.Dimension(60, 30));

        btnAlterar.setText("Alterar");
        btnAlterar.setPreferredSize(new java.awt.Dimension(60, 30));

        btnIncluir.setText("Incluir");
        btnIncluir.setPreferredSize(new java.awt.Dimension(60, 30));

        lblTelefone.setText("Telefone");

        lblNascimento.setText("Data de Nascimento:");

        lblCEP.setText("CEP:");

        lblEstado.setText("Estado:");

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador(a)", "Gerente", "Agente Funebre", "Auxiliar de Escritório", "Cobrador(a)" }));

        cmbCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Casado(a)", "Divorciado(a)", "Solteiro(a)", "Viúvo(a)" }));

        lblCargo.setText("Cargo:");

        lblCivil.setText("Estado Civil:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));

        lblSexo.setText("Sexo:");

        btnPesqFunc.setText("...");

        lblNome1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblNome1.setText("Cadastro de Funcionários");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IBAGENS/logo.png"))); // NOI18N

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PE", "PI", "PR", "RR", "RO", "RJ", "RN", "RS", "SC", "SP", "SE", "TO" }));

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setInheritsPopupMenu(true);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addGap(172, 172, 172)
                                .addComponent(lblNascimento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCargo)
                                .addGap(129, 129, 129)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCivil)
                            .addComponent(cmbCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstado)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCEP)
                            .addComponent(txtCEP)))
                    .addComponent(lblNome)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesqFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIRG)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblEndereco))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addGap(182, 182, 182)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblNome1)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIRG)
                        .addComponent(lblCPF)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqFunc)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblBairro)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstado)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSexo)
                                        .addComponent(lblCivil)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefone)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNascimento)
                                        .addComponent(lblCargo)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionariosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAlterar;
    public javax.swing.JButton btnIncluir;
    public javax.swing.JButton btnPesqFunc;
    public javax.swing.JButton btnVoltar;
    public javax.swing.JComboBox<String> cmbCargo;
    public javax.swing.JComboBox<String> cmbCivil;
    public javax.swing.JComboBox<String> cmbEstado;
    public javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCivil;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIRG;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    public javax.swing.JTextField txtBairro;
    public javax.swing.JFormattedTextField txtCEP;
    public javax.swing.JFormattedTextField txtCPF;
    public javax.swing.JTextField txtCidade;
    public javax.swing.JTextField txtEndereco;
    public javax.swing.JFormattedTextField txtNascimento;
    public javax.swing.JTextField txtNome;
    public javax.swing.JTextField txtRG;
    public javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
