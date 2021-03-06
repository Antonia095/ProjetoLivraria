package br.com.livraria.visao;

import br.com.livraria.controle.FornecedorDaoArquivo;
import br.com.livraria.modelo.Fornecedor;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class CadastroFornecedor extends javax.swing.JFrame {

    private FornecedorDaoArquivo dao;
    
    public CadastroFornecedor() {
         try{
            dao = new FornecedorDaoArquivo();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Arquivo não encontrado",
                    "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem1 = new componentes.UJPanelImagem();
        jLabel1 = new javax.swing.JLabel();
        LabelCNPJ = new javax.swing.JLabel();
        TextFieldCNPJ = new javax.swing.JTextField();
        LabelNome = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JTextField();
        ButtonPesquisar = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        LabelCidade = new javax.swing.JLabel();
        TextFieldCidade = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        LabelTelefone = new javax.swing.JLabel();
        Telefone = new javax.swing.JFormattedTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonAtualizar = new javax.swing.JButton();
        ButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\JOCERLANIA\\Documents\\Projetos\\Livraria\\src\\br\\com\\livraria\\imagens\\tela2.png"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedor");

        LabelCNPJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCNPJ.setText("CNPJ");

        TextFieldCNPJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome.setText("Nome");

        TextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ButtonPesquisar.setBackground(new java.awt.Color(255, 102, 0));
        ButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/livraria/imagens/iconePesquisa.png"))); // NOI18N
        ButtonPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });

        ButtonVoltar.setBackground(new java.awt.Color(255, 102, 0));
        ButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/livraria/imagens/iconeVoltar.png"))); // NOI18N
        ButtonVoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        LabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCidade.setText("Cidade");

        TextFieldCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEmail.setText("Email");

        TextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelTelefone.setText("Telefone");

        try {
            Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Telefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ButtonSalvar.setBackground(new java.awt.Color(255, 102, 0));
        ButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonAtualizar.setBackground(new java.awt.Color(255, 102, 0));
        ButtonAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonAtualizar.setText("Atualizar");
        ButtonAtualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtualizarActionPerformed(evt);
            }
        });

        ButtonDeletar.setBackground(new java.awt.Color(255, 102, 0));
        ButtonDeletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonDeletar.setText("Deletar");
        ButtonDeletar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, uJPanelImagem1Layout.createSequentialGroup()
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, uJPanelImagem1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(LabelEmail)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LabelNome)
                                                .addComponent(LabelCidade)
                                                .addComponent(LabelCNPJ)))
                                        .addGap(18, 18, 18)))
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                        .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(ButtonPesquisar))
                                    .addComponent(TextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, uJPanelImagem1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(ButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(142, 142, 142)))
                .addGap(85, 85, 85))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(336, 336, 336)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCNPJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNome)
                            .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCidade))
                        .addGap(15, 15, 15)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTelefone))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
       /*String telefone = Telefone.getText();
       int telefoneF = parseInt(telefone);*/
        Fornecedor f = new Fornecedor(TextFieldCNPJ.getText(),TextFieldNome.getText(),TextFieldCidade.getText(),
                                TextFieldEmail.getText(), Telefone.getText());
            
        try{
            if(dao.salvar(f)){
                JOptionPane.showMessageDialog(null,"Fornecedor cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao casdastrar fornecedor",
                        "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o arquivo",
                    "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed
        Fornecedor f = null;
            
        try{
            f = dao.buscar(TextFieldCNPJ.getText());
        }catch(IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o arquivo",
                    "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        if(f == null){
            JOptionPane.showMessageDialog(null,"Fornecedor não encontrado",
                    "Mensagem de erro", JOptionPane.INFORMATION_MESSAGE);
        }else{
            TextFieldEmail.setText(f.getCnpj());
            TextFieldNome.setText(f.getNome());
            TextFieldCidade.setText(f.getCidade());
            TextFieldEmail.setText(f.getEmail());
            Telefone.setValue(f.getTelefone());
            
        }
    }//GEN-LAST:event_ButtonPesquisarActionPerformed

    private void ButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtualizarActionPerformed
        /*String telefone = Telefone.getText();
       int telefoneF = parseInt(telefone);*/
        Fornecedor f = new Fornecedor(TextFieldCNPJ.getText(),TextFieldNome.getText(),TextFieldCidade.getText(),
                                TextFieldEmail.getText(), Telefone.getText());
            
        try{
            if(dao.atualizarDadosFornecedor(f)){
                JOptionPane.showMessageDialog(null,"Fornecedor atualizado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao casdastrar fornecedor",
                        "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o arquivo",
                    "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonAtualizarActionPerformed

    private void ButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeletarActionPerformed
       /* String telefone = Telefone.getText();
       int telefoneF = parseInt(telefone);*/
        Fornecedor f = new Fornecedor(TextFieldCNPJ.getText(),TextFieldNome.getText(),TextFieldCidade.getText(),
                                TextFieldEmail.getText(), Telefone.getText());
            
        try{
            if(dao.deletar(f)){
                JOptionPane.showMessageDialog(null,"Fornecedor cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao casdastrar fornecedor",
                        "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o arquivo",
                    "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonDeletarActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        TelaDeFuncionalidade telaAnterior = new TelaDeFuncionalidade();
                        this.setLocationRelativeTo(null);
                        telaAnterior.setVisible(true);
                        dispose();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtualizar;
    private javax.swing.JButton ButtonDeletar;
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LabelCNPJ;
    private javax.swing.JLabel LabelCidade;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JFormattedTextField Telefone;
    private javax.swing.JTextField TextFieldCNPJ;
    private javax.swing.JTextField TextFieldCidade;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JLabel jLabel1;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
