package Telas;

import Controlador.Empresa;
import Controlador.Produto;
import javax.swing.JOptionPane;

public class TelaCadastroProdutos extends javax.swing.JFrame {

    private TelaPrincipal telinhaPrincipal;
    Empresa emp;

    private TelaCadastroProdutos() {
        initComponents();
    }

    public TelaCadastroProdutos(TelaPrincipal telaAnterior, Empresa emp) {
        initComponents();
        this.telinhaPrincipal = telaAnterior;
        this.emp = emp;
        this.campoTaxaImportacao.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTaxaImposto = new javax.swing.JTextField();
        campoValor = new javax.swing.JTextField();
        campoDescricao = new javax.swing.JTextField();
        boxTipoProduto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        botaoConfirmarCadastroProduto = new javax.swing.JButton();
        botaoCancelarCadastroProduto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campoTaxaImportacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setLocation(new java.awt.Point(400, 200));
        setType(java.awt.Window.Type.POPUP);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE PRODUTOS");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setText("Valor");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("Taxa de Imposto");

        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });

        boxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produto Nacional", "Produto Importado" }));
        boxTipoProduto.setToolTipText("");
        boxTipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boxTipoProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTipoProdutoItemStateChanged(evt);
            }
        });
        boxTipoProduto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                boxTipoProdutoCaretPositionChanged(evt);
            }
        });
        boxTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Produto");

        botaoConfirmarCadastroProduto.setText("Salvar");
        botaoConfirmarCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarCadastroProdutoActionPerformed(evt);
            }
        });

        botaoCancelarCadastroProduto.setText("Cancelar");
        botaoCancelarCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarCadastroProdutoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel7.setText("Taxa de Importação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campoValor, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campoTaxaImposto, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxTipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, 0, 180, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTaxaImportacao))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel1)))
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoConfirmarCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCancelarCadastroProduto)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTaxaImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(boxTipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoTaxaImportacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmarCadastroProduto)
                    .addComponent(botaoCancelarCadastroProduto))
                .addGap(19, 19, 19))
        );

        campoDescricao.getAccessibleContext().setAccessibleName("Descrição do Produto");
        boxTipoProduto.getAccessibleContext().setAccessibleName("Opção Produto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTipoProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTipoProdutoItemStateChanged

        if (((String) this.boxTipoProduto.getSelectedItem()).equals("Produto Importado")) {
            this.campoTaxaImportacao.setEnabled(true);
        } else {
            this.campoTaxaImportacao.setEnabled(false);
            this.campoTaxaImposto.setText("");
        }
    }//GEN-LAST:event_boxTipoProdutoItemStateChanged

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void boxTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoProdutoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_boxTipoProdutoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
        this.telinhaPrincipal.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void botaoCancelarCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarCadastroProdutoActionPerformed
        this.dispose();
        this.telinhaPrincipal.setEnabled(true);
        this.telinhaPrincipal.toFront();
    }//GEN-LAST:event_botaoCancelarCadastroProdutoActionPerformed

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorActionPerformed

    private void botaoConfirmarCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarCadastroProdutoActionPerformed
        // TODO add your handling code here:
        String descricao;
        float valor;
        float taxaImposto;
        String tipoProduto;
        float taxaImportacao;
        try {
            descricao = campoDescricao.getText();
            valor = Float.parseFloat(campoValor.getText());
            taxaImposto = Float.parseFloat(campoTaxaImposto.getText());
            tipoProduto = (String) boxTipoProduto.getSelectedItem();
            Produto p = null;
            if (tipoProduto.equals("Produto Nacional")) {
                taxaImportacao = 0;
                p = Controlador.Produto.cadProduto(emp.getContp(), 1, descricao, valor, taxaImposto, taxaImportacao);
            } else {
                taxaImportacao = Float.parseFloat(campoTaxaImportacao.getText());
                p = Controlador.Produto.cadProduto(emp.getContp(), 2, descricao, valor, taxaImposto, taxaImportacao);
            }
            if (p != null) {
                if (this.emp.addProduto(p)) {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Produto cadastrado!", "Sucesso", JOptionPane.WARNING_MESSAGE);
                } else {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Produto não cadastrado, tente novamente!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Dados Inválidos", "Alerta", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botaoConfirmarCadastroProdutoActionPerformed

    private void boxTipoProdutoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_boxTipoProdutoCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoProdutoCaretPositionChanged

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
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarCadastroProduto;
    private javax.swing.JButton botaoConfirmarCadastroProduto;
    private javax.swing.JComboBox<String> boxTipoProduto;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoTaxaImportacao;
    private javax.swing.JTextField campoTaxaImposto;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
