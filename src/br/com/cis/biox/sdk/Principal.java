package br.com.cis.biox.sdk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Principal extends javax.swing.JFrame {
    
    private static byte[] buffer;
    private static byte[] buffer2;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDedo1 = new javax.swing.JButton();
        lblVersao = new javax.swing.JLabel();
        btnComparar = new javax.swing.JButton();
        btnDedo2 = new javax.swing.JButton();
        btnVersao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelarLeitura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CIS SDK Java");
        setResizable(false);

        btnDedo1.setText("Ler digital - Dedo 1");
        btnDedo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDedo1ActionPerformed(evt);
            }
        });

        lblVersao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVersao.setText("Versão SDK");

        btnComparar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnComparar.setText("Comparar as 2 digitais");
        btnComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompararActionPerformed(evt);
            }
        });

        btnDedo2.setText("Ler digital - Dedo 2");
        btnDedo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDedo2ActionPerformed(evt);
            }
        });

        btnVersao.setText("Ler DLL (Versão SDK)");
        btnVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVersaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ler e comprar as digitais");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Teste de conexão com a DLL");

        btnCancelarLeitura.setText("Cancelar leitura");
        btnCancelarLeitura.setEnabled(false);
        btnCancelarLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarLeituraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVersao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDedo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(btnCancelarLeitura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDedo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVersao)
                    .addComponent(lblVersao))
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDedo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDedo2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarLeitura)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDedo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDedo1ActionPerformed
        // TODO add your handling code here:

        // Instanciar a DLL
        CisBiox dll = new CisBiox();

        int iRetorno = dll.iniciar();
        
        if (iRetorno != 1) {
            JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno));
            return;
        }

        btnCancelarLeitura.setEnabled(true);

        new Thread(LerDigital1).start();
    }//GEN-LAST:event_btnDedo1ActionPerformed

    private static Runnable LerDigital1 = new Runnable() {
        @Override
        public void run() {
          
                // Instanciar a DLL
                CisBiox dll = new CisBiox();

                // Capturar a digital no leitor   
                buffer = dll.capturarDigital();

                if (dll.getResultado() != 1) {
                    dll.finalizar();
                    JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(dll.getResultado()));
                    return;
                }

                // Finalizar o SDK        
                int iRetorno = dll.finalizar();
                if (iRetorno != 1) {
                    JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno));
                    return;
                }

                JOptionPane.showMessageDialog(null, "Template gerado!");
           
        }
    

    };    
        
    
    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompararActionPerformed
        // TODO add your handling code here:

        // Instanciar a DLL
        CisBiox dll = new CisBiox();

        dll.iniciar();
 
        if (dll.getResultado() == 1) {
            lblVersao.setText(dll.versao());
        } else {
            JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(dll.getResultado()));
            return;
        }

        int iRetorno = dll.compararDigital(buffer, buffer2);
        
        if (iRetorno == 1) {
            JOptionPane.showMessageDialog(null, "As digitais são iguais");
        } else if (iRetorno == -2) {
            JOptionPane.showMessageDialog(null, "As digitais são diferentes");
        } else {
            JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno));
        }

        // Finalizar o SDK 
        
        if (dll.finalizar() != 1) {
            JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno));
            return;
        }
    }//GEN-LAST:event_btnCompararActionPerformed

    private void btnVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVersaoActionPerformed
        // TODO add your handling code here:

        // Instanciar a DLL
        CisBiox dll = new CisBiox();

        lblVersao.setText("CIS SDK - v." + dll.versao());


    }//GEN-LAST:event_btnVersaoActionPerformed

    private void btnDedo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDedo2ActionPerformed
        // TODO add your handling code here:
        // Instanciar a DLL
        CisBiox dll = new CisBiox();

        int iRetorno = dll.iniciar();
        if (iRetorno != 1) {
            JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno));
            return;
        }

        btnCancelarLeitura.setEnabled(true);

        new Thread(LerDigital2).start();
    }//GEN-LAST:event_btnDedo2ActionPerformed

    private static Runnable LerDigital2 = new Runnable() {
        @Override
        public void run() {
           
                // Instanciar a DLL
                CisBiox dll = new CisBiox();

                // Capturar a digital no leitor   
                buffer2 = dll.capturarDigital();

                if (dll.getResultado() != 1) {
                    dll.finalizar();
                    JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(dll.getResultado()));
                    return;
                }
               
                // Finalizar o SDK        
                int iRetorno = dll.finalizar();
                if (iRetorno != 1) {
                    JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno));
                    return;
                }

                JOptionPane.showMessageDialog(null, "Template gerado!");
            
        }
    ;

    };    
    
    
    private void btnCancelarLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLeituraActionPerformed
        // TODO add your handling code here:

        // Instanciar a DLL
        CisBiox dll = new CisBiox();

        // Cancelar a leitura 
        dll.cancelarLeitura();

        btnCancelarLeitura.setEnabled(false);
    }//GEN-LAST:event_btnCancelarLeituraActionPerformed

    private static Runnable LerWSQ = new Runnable() {
        public void run() {
            try {
                // Instanciar a DLL
                CisBiox dll = new CisBiox();

                // Capturar a imagem da digital em WSQ  
                Pointer pImagem;
                IntByReference iRet = new IntByReference();
                IntByReference iSize = new IntByReference();
                pImagem = dll.lerDigitalLerWSQ(iRet, iSize);
                int iRetorno2 = iRet.getValue();
                if (iRetorno2 == 0) {
                    return;
                }
                if (iRetorno2 != 1) {
                    dll.finalizar();
                    JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno2));
                    return;
                }
                byte[] buffer = pImagem.getByteArray(0, iSize.getValue());

                // Criar a pasta e apagar a imagem anterior
                new File("C:/CIS_SDK/IMAGENS").mkdir();
                File file = new File("C:/CIS_SDK/IMAGENS/Imagem.wsq");
                file.delete();

                // Gravar a imagem em um arquivo
                File arquivo = new File("C:/CIS_SDK/IMAGENS/Imagem.wsq");
                try (FileOutputStream arq = new FileOutputStream(arquivo)) {
                    arq.write(buffer);
                    arq.flush();
                    arq.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro !!! ");
                }

                // Finalizar o SDK        
                int iRetorno = dll.finalizar();
                if (iRetorno != 1) {
                    JOptionPane.showMessageDialog(null, "Erro: " + Integer.toString(iRetorno));
                    return;
                }

                JOptionPane.showMessageDialog(null, "Imagem gerada!");

            } catch (Exception e) {
            }
        }
    };

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        //</editor-fold>        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarLeitura;
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnDedo1;
    private javax.swing.JButton btnDedo2;
    private javax.swing.JButton btnVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblVersao;
    // End of variables declaration//GEN-END:variables
}
