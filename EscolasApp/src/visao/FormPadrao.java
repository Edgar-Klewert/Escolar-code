 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

/**
 *
 * @author klewe
 */
public class FormAluno extends javax.swing.JInternalFrame {

    
    public FormAluno() {
        initComponents();
        habilitaBotoes(true);
        habilitaCampos(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBotoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jpnFormularios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jpnConsulta = new javax.swing.JPanel();

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jbNovo.setMnemonic('N');
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jbAlterar.setMnemonic('A');
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        jbExcluir.setMnemonic('E');
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jbSalvar.setMnemonic('S');
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jbCancelar.setMnemonic('C');
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fechar.png"))); // NOI18N
        jbFechar.setMnemonic('F');
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir)
                .addGap(57, 57, 57)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jbFechar)
                .addContainerGap())
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("ID");

        jLabel2.setText("Descrição");

        jtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDActionPerformed(evt);
            }
        });

        jtfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnFormulariosLayout = new javax.swing.GroupLayout(jpnFormularios);
        jpnFormularios.setLayout(jpnFormulariosLayout);
        jpnFormulariosLayout.setHorizontalGroup(
            jpnFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormulariosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormulariosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfDescricao))
                .addContainerGap())
        );
        jpnFormulariosLayout.setVerticalGroup(
            jpnFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormulariosLayout.createSequentialGroup()
                .addGroup(jpnFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 99, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(0, 0, 114));

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnFormularios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        limpaCampo();
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescricaoActionPerformed

    private void jtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExcluirActionPerformed

    //Método para habilitar e desabilitar acesso ao campo de edição
    public void habilitaCampos(boolean estado){
        jtfID.setEnabled(estado);
        jtfDescricao.setEnabled(estado);        
    }
    
    //Método para limpar os campos do formulario
    public void limpaCampo(){
        jtfDescricao.setText("");
    }
    
    //Método para habilitar e desabilitar botões no formulario
    public void habilitaBotoes(boolean estado){
        jbNovo.setEnabled(estado);
        jbAlterar.setEnabled(estado);
        jbExcluir.setEnabled(estado);
        jbSalvar.setEnabled(!estado);
        jbCancelar.setEnabled(!estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpnBotoes;
    private javax.swing.JPanel jpnConsulta;
    private javax.swing.JPanel jpnFormularios;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfID;
    // End of variables declaration//GEN-END:variables
}
