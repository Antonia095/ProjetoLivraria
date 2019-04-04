package br.com.livraria.visao;

/**
 *
 * @author JOCERLANIA
 */
public class TelaDeFuncionalidade extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeFuncionalidade
     */
    public TelaDeFuncionalidade() {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemLivro = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemFornecedor = new javax.swing.JMenuItem();
        jMenuCompra = new javax.swing.JMenu();
        jMenuItemComprar = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemVender = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\JOCERLANIA\\Documents\\Projetos\\Livraria\\src\\br\\com\\livraria\\imagens\\telaInicial.png"));

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/livraria/imagens/iconeLivro.png"))); // NOI18N
        jMenuItemLivro.setText("Livro");
        jMenuItemLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLivroActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemLivro);

        jMenuItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/livraria/imagens/iconePessoa.png"))); // NOI18N
        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFuncionario);

        jMenuItemFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/livraria/imagens/iconeFornecedor.png"))); // NOI18N
        jMenuItemFornecedor.setText("Fornecedor");
        jMenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFornecedor);

        jMenuBar1.add(jMenuCadastro);

        jMenuCompra.setText("Compra");

        jMenuItemComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/livraria/imagens/iconeCompra.png"))); // NOI18N
        jMenuItemComprar.setText("Comprar Livro");
        jMenuCompra.add(jMenuItemComprar);

        jMenuBar1.add(jMenuCompra);

        jMenuVenda.setText("Venda");

        jMenuItemVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/livraria/imagens/iconeVenda.png"))); // NOI18N
        jMenuItemVender.setText("Vender Livro");
        jMenuVenda.add(jMenuItemVender);

        jMenuBar1.add(jMenuVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLivroActionPerformed
        CadastroLivro telaLivro = new CadastroLivro();
                        this.setLocationRelativeTo(null);
                        telaLivro.setVisible(true);
                        dispose();
    }//GEN-LAST:event_jMenuItemLivroActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        CadastroFuncionario telaFuncionario = new CadastroFuncionario();
        this.setLocationRelativeTo(null);
        telaFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorActionPerformed
        CadastroFornecedor telaFornecedor = new CadastroFornecedor();
        this.setLocationRelativeTo(null);
        telaFornecedor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeFuncionalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeFuncionalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeFuncionalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeFuncionalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeFuncionalidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCompra;
    private javax.swing.JMenuItem jMenuItemComprar;
    private javax.swing.JMenuItem jMenuItemFornecedor;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemLivro;
    private javax.swing.JMenuItem jMenuItemVender;
    private javax.swing.JMenu jMenuVenda;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}