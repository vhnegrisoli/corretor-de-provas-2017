/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lord Negrisoli
 */
import javax.swing.*;
public class Subjetivas extends javax.swing.JFrame {

    /**
     * Creates new form Subjetivas
     */
    public Subjetivas() {
        initComponents();
        this.setLocationRelativeTo(null);
        qtdQ.setEnabled(true);
        gravarQtd.setEnabled(true);
        valorProva.setEnabled(false);
        gravarValor.setEnabled(false);
        mediaAp.setEnabled(false);
        gravarAp.setEnabled(false);
        nomeAluno.setEnabled(false);
        inserirNota.setEnabled(false);
        corrigir.setEnabled(false);
    }
    CorretorSubjetivas subjetivas = new CorretorSubjetivas();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        valorProva = new javax.swing.JTextField();
        gravarValor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mediaAp = new javax.swing.JTextField();
        gravarAp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        qtdQ = new javax.swing.JTextField();
        gravarQtd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        corrigir = new javax.swing.JButton();
        inserirNota = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Desenvolvido por Victor Hugo Negrisoli & Natália Cristina Martins de Sá");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livro_00000.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 3, 36)); // NOI18N
        jLabel1.setText("Corretor de Provas 5.0");

        jButton5.setText("Nova correção");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        valorProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorProvaActionPerformed(evt);
            }
        });

        gravarValor.setText("Gravar");
        gravarValor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gravarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarValorActionPerformed(evt);
            }
        });

        jLabel6.setText("Média para aprovação:");

        mediaAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaApActionPerformed(evt);
            }
        });

        gravarAp.setText("Gravar");
        gravarAp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gravarAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarApActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade de questões:");

        qtdQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdQActionPerformed(evt);
            }
        });

        gravarQtd.setText("Gravar");
        gravarQtd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gravarQtd.setEnabled(false);
        gravarQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarQtdActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor da prova:");

        corrigir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        corrigir.setText("Corrigir!");
        corrigir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        corrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigirActionPerformed(evt);
            }
        });

        inserirNota.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        inserirNota.setText("Inserir notas");
        inserirNota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inserirNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirNotaActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        label.setText("Digite o nome do aluno:");

        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorProva)
                                    .addComponent(gravarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mediaAp)
                                    .addComponent(gravarAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addGap(46, 46, 46)
                                .addComponent(jButton5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qtdQ)
                                .addComponent(gravarQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(inserirNota, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeAluno)
                    .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(corrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtdQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gravarQtd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gravarValor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mediaAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gravarAp)
                            .addComponent(jButton5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserirNota, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(corrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null, "Todas as informações foram apagadas");
        qtdQ.setEnabled(true);
        gravarQtd.setEnabled(true);
        valorProva.setEnabled(false);
        gravarValor.setEnabled(false);
        mediaAp.setEnabled(false);
        gravarAp.setEnabled(false);
        qtdQ.setText("");
        mediaAp.setText("");
        valorProva.setText("");
        nomeAluno.setText("");
        subjetivas = new CorretorSubjetivas();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void gravarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarValorActionPerformed
        try{
            mediaAp.setEnabled(true);
            gravarAp.setEnabled(true);
            valorProva.setEnabled(false);
            gravarValor.setEnabled(false);
            subjetivas.valorTotalDaProva(Integer.parseInt(valorProva.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, insira algum valor no campo.");
            mediaAp.setEnabled(false);
            gravarAp.setEnabled(false);
            valorProva.setEnabled(true);
            gravarValor.setEnabled(true);
        }
    }//GEN-LAST:event_gravarValorActionPerformed

    private void mediaApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaApActionPerformed
        try{
            mediaAp.setEnabled(false);
            gravarAp.setEnabled(false);
            nomeAluno.setEnabled(true);
            inserirNota.setEnabled(true);
            corrigir.setEnabled(true);
            subjetivas.mediaParaAprovacao(Integer.parseInt(mediaAp.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, insira algum valor no campo.");
            mediaAp.setEnabled(true);
            gravarAp.setEnabled(true);
            nomeAluno.setEnabled(false);
            inserirNota.setEnabled(false);
            corrigir.setEnabled(false);
        }
    }//GEN-LAST:event_mediaApActionPerformed

    private void gravarApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarApActionPerformed
        try{
            mediaAp.setEnabled(false);
            gravarAp.setEnabled(false);
            nomeAluno.setEnabled(true);
            inserirNota.setEnabled(true);
            corrigir.setEnabled(true);
            subjetivas.mediaParaAprovacao(Integer.parseInt(mediaAp.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, insira algum valor no campo.");
            mediaAp.setEnabled(true);
            gravarAp.setEnabled(true);
            nomeAluno.setEnabled(false);
            inserirNota.setEnabled(false);
            corrigir.setEnabled(false);
        }
    }//GEN-LAST:event_gravarApActionPerformed

    private void qtdQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdQActionPerformed
        try{
            valorProva.setEnabled(true);
            gravarValor.setEnabled(true);
            qtdQ.setEnabled(false);
            gravarQtd.setEnabled(false);
            subjetivas.quantidadeDeQuestoes(Integer.parseInt(qtdQ.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, insira algum valor no campo.");
            valorProva.setEnabled(false);
            gravarValor.setEnabled(false);
            qtdQ.setEnabled(true);
            gravarQtd.setEnabled(true);
        }
    }//GEN-LAST:event_qtdQActionPerformed

    private void gravarQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarQtdActionPerformed
        try{
            valorProva.setEnabled(true);
            gravarValor.setEnabled(true);
            qtdQ.setEnabled(false);
            gravarQtd.setEnabled(false);
            subjetivas.quantidadeDeQuestoes(Integer.parseInt(qtdQ.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, insira algum valor no campo.");
            valorProva.setEnabled(false);
            gravarValor.setEnabled(false);
            qtdQ.setEnabled(true);
            gravarQtd.setEnabled(true);
        }
    }//GEN-LAST:event_gravarQtdActionPerformed

    private void corrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigirActionPerformed
        try{
            subjetivas.mostrarRespostas(nomeAluno.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos para continuar.");
        }
    }//GEN-LAST:event_corrigirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        try{
            subjetivas.mostrarRespostas(nomeAluno.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos para continuar.");
        }
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void inserirNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirNotaActionPerformed
        subjetivas.corrigirQuestoes();
    }//GEN-LAST:event_inserirNotaActionPerformed

    private void valorProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorProvaActionPerformed
        try{
            mediaAp.setEnabled(true);
            gravarAp.setEnabled(true);
            valorProva.setEnabled(false);
            gravarValor.setEnabled(false);
            subjetivas.valorTotalDaProva(Integer.parseInt(valorProva.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, insira algum valor no campo.");
            mediaAp.setEnabled(false);
            gravarAp.setEnabled(false);
            valorProva.setEnabled(true);
            gravarValor.setEnabled(true);
        }
    }//GEN-LAST:event_valorProvaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Subjetivas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subjetivas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subjetivas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subjetivas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subjetivas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton corrigir;
    private javax.swing.JButton gravarAp;
    private javax.swing.JButton gravarQtd;
    private javax.swing.JButton gravarValor;
    private javax.swing.JButton inserirNota;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label;
    private javax.swing.JTextField mediaAp;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField qtdQ;
    private javax.swing.JTextField valorProva;
    // End of variables declaration//GEN-END:variables
}
