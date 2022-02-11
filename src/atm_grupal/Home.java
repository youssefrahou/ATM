/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_grupal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Prueba prueba otra prueba
 */
public class Home extends javax.swing.JFrame {

    static Home register;
    //String fnamez;
    //int balancz;
    //int operation;
    Connection con;
    ResultSet rs;
    Statement st;
    String nombre;
    Cliente cliente;

    /**
     * Creates new form Register_Window
     */
    public Home(Cliente cliente) {

        initComponents();
        this.nombre = cliente.getNombre();
        this.cliente = cliente;

        BienvenidoLabel.setText(BienvenidoLabel.getText() + ", " + cliente.getNombre());
        int balance = getBalance(cliente.getId());

        jLabelBalance.setText(String.valueOf(balance) + "€");

        setLocationRelativeTo(null);
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
        BalanceLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        CerrarSesionButton = new javax.swing.JButton();
        BienvenidoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransaccionesTable = new javax.swing.JTable();
        EnviarButton = new javax.swing.JButton();
        ExtraerButton = new javax.swing.JButton();
        AñadirButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagenenviar = new javax.swing.JLabel();
        Imagenextraer = new javax.swing.JLabel();
        imagenañadir = new javax.swing.JLabel();
        iconbalance = new javax.swing.JLabel();
        Imagenmanos = new javax.swing.JLabel();
        jLabelBalance = new javax.swing.JLabel();
        jButtonAbrirTarjetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(255, 204, 204));

        BalanceLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BalanceLabel.setText("Balance:");
        BalanceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ExitButton.setBackground(new java.awt.Color(255, 204, 204));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/Cerrar.png"))); // NOI18N
        ExitButton.setToolTipText("Salir");
        ExitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        CerrarSesionButton.setBackground(new java.awt.Color(255, 204, 204));
        CerrarSesionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-salida-30.png"))); // NOI18N
        CerrarSesionButton.setToolTipText("Salir");
        CerrarSesionButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CerrarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionButtonActionPerformed(evt);
            }
        });

        BienvenidoLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        BienvenidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BienvenidoLabel.setText("BIENVENIDO");

        TransaccionesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Cantidad", "IBAN Origen", "IBAN Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TransaccionesTable);

        EnviarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnviarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-euro-30.png"))); // NOI18N
        EnviarButton.setText("Enviar");
        EnviarButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ExtraerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExtraerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-euro-30.png"))); // NOI18N
        ExtraerButton.setText("Extraer");
        ExtraerButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        AñadirButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AñadirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-euro-30.png"))); // NOI18N
        AñadirButton.setText("Añadir");
        AñadirButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        AñadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-historia-de-la-actividad-30.png"))); // NOI18N
        jLabel1.setText("Historial de Transacciones");

        imagenenviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-money-30.png"))); // NOI18N

        Imagenextraer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-money-30_2.png"))); // NOI18N

        imagenañadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-money-30_1.png"))); // NOI18N

        iconbalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-balance-30.png"))); // NOI18N

        Imagenmanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-apreton-de-manos-corazon-30.png"))); // NOI18N

        jLabelBalance.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelBalance.setText("jLabel2");

        jButtonAbrirTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_grupal/icons8-card-30.png"))); // NOI18N
        jButtonAbrirTarjetas.setText("Tarjetas");
        jButtonAbrirTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirTarjetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconbalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BalanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBalance)
                .addGap(120, 120, 120))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(CerrarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 753, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(imagenenviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(BienvenidoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(Imagenmanos))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(EnviarButton)
                                .addGap(45, 45, 45)
                                .addComponent(Imagenextraer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExtraerButton)
                                .addGap(43, 43, 43)
                                .addComponent(imagenañadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AñadirButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAbrirTarjetas)))
                .addContainerGap())
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(CerrarSesionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BienvenidoLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(Imagenmanos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(iconbalance)
                        .addGap(8, 8, 8))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BalanceLabel)
                        .addComponent(jLabelBalance)))
                .addGap(25, 25, 25)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAbrirTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExtraerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AñadirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagenextraer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenañadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenenviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnviarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionButtonActionPerformed

    }//GEN-LAST:event_CerrarSesionButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AñadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirButtonActionPerformed
        // TODO add your handling code here:
        //añadir dinero
        String cantidad = "";
        cantidad = JOptionPane.showInputDialog("Dinero que desea ingresar");

        try {
            int id_cuenta_corriente = 5;
            int id_cliente = cliente.getId();
            get_id_cuenta_corriente_by_id_cliente(cliente.getId());
            insertarDinero(cantidad, id_cuenta_corriente, id_cliente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(cantidad);


    }//GEN-LAST:event_AñadirButtonActionPerformed

    private void jButtonAbrirTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirTarjetasActionPerformed
        ListadoTarjetas tarjetas = new ListadoTarjetas(cliente);
        
        tarjetas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAbrirTarjetasActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Home(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirButton;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JLabel BienvenidoLabel;
    private javax.swing.JButton CerrarSesionButton;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ExtraerButton;
    private javax.swing.JLabel Imagenextraer;
    private javax.swing.JLabel Imagenmanos;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable TransaccionesTable;
    private javax.swing.JLabel iconbalance;
    private javax.swing.JLabel imagenañadir;
    private javax.swing.JLabel imagenenviar;
    private javax.swing.JButton jButtonAbrirTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public static int getBalance(int id) {
        int balance = 0;
        System.out.println(id);
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT * FROM `cuentas_corrientes` where id_cliente = " + id + ";";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                balance = rs.getInt("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }

    /*private boolean registrar(String nombre, String dni, String fecha, String direccion, String cp, String email, String contrasena) {

        System.out.println("usuario ");
        //INSERT INTO `clientes` (`ID`, `nombre`, `apellidos`, `edad`, `dni`, `direccion`, `poblacion`, `usuario`, `contrasena`) VALUES (NULL, 'aaaaaa', 'aaaaaa', '23', 'aaaaaa', 'aaaaaa', 'aaaaaa', 'aaaaaa', 'aaaaaa');

        //aqui nos registramos
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");

            PreparedStatement update = con.prepareStatement("INSERT INTO `clientes` (`ID`, `nombre`, `apellidos`, `edad`, `dni`, `direccion`, `poblacion`, `usuario`, `contrasena`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)");
            update.setString(1, nombre);
            update.setString(2, dni);
            update.setString(3, fecha);
            update.setString(4, direccion);
            update.setString(5, cp);
            update.setString(6, email);
            update.setString(7, contrasena);
            update.setString(8, contrasena);

            update.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }*/
    private void insertarDinero(String cantidad, int id_cuenta_corriente, int id_cliente) {

        double cant = Double.parseDouble(cantidad);
        //int id_cuenta_corriente = 5;
        //int id_cliente = 13;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            PreparedStatement ps = con.prepareStatement("INSERT INTO `transacciones` (`id`, `tipo_transaccion`, `cantidad_transaccion`, `id_tarjeta`, `id_cuenta_corriente`, `id_cliente`) VALUES (NULL, '1', ?, NULL, ?, ?)");

            ps.setDouble(1, cant);
            ps.setInt(2, id_cuenta_corriente);
            ps.setInt(3, id_cliente);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private int get_id_cuenta_corriente_by_id_cliente(int id) {
        int id_cuenta_corriente = 0;
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT * FROM `cuentas_corrientes` where id_cliente = " + id + ";";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                id_cuenta_corriente = rs.getInt("balance");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return id_cuenta_corriente;

    }

}
