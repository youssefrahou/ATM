/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_grupal;

import java.awt.Color;
import java.awt.Panel;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Loading_Window extends javax.swing.JFrame {

    /**
     * Creates new form Loading_Window
     */
    public Loading_Window() {
        
        Variables.getVariables();

        initComponents();
        setLocationRelativeTo(null);
        Logo.setForeground(Variables.principal);
        Logo.setBackground(Variables.principal);
        Logo.setOpaque(true);

        Carga.setForeground(Variables.principal);
        Carga.setBackground(Variables.principal);
        Carga.setOpaque(true);

        //Panel.setBackground(Variables.principal);
        //Panel.setOpaque(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Carga = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Progreso = new javax.swing.JProgressBar();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 350));
        setSize(new java.awt.Dimension(0, 0));

        MainPanel.setBackground(Variables.principal);

        Carga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Carga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/Carg.gif"))); // NOI18N

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/logo_icono.png"))); // NOI18N

        Progreso.setPreferredSize(new java.awt.Dimension(146, 20));
        Progreso.setStringPainted(true);

        jLabelNombre.setFont(new java.awt.Font("Toledo Heavy", 0, 48)); // NOI18N
        jLabelNombre.setText(Variables.nombre);

        jLabelFrase.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabelFrase.setText(Variables.frase);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Carga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelFrase))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFrase)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Carga, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //llamado a la ventana    
        Loading_Window splash = new Loading_Window();//llamos la ventana para iniciarla
        splash.setVisible(true); //Se hace visible
        try {
            for (int i = 0; i <= 100; i++) { //iniciar el ciclo de 0 a 100
                Thread.sleep(50); //velocidad de carga
                splash.Progreso.setValue(i);
                if (i == 99) { // si el valor es igual a 99
                    splash.setVisible(false); // cierra el formulario 
                    Login_Window VentanaLogin = new Login_Window();
                    VentanaLogin.setVisible(true); // ense??a ventana
                }
            }
            return;  // for para la carga

        } catch (InterruptedException e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Loading_Window().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carga;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MainPanel;
    public static javax.swing.JProgressBar Progreso;
    private javax.swing.JLabel jLabelFrase;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
}
