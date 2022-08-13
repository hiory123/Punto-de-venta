/*
 * Descripcion: Ventana para inventario o catalogos de los productos
 * Fecha: 24-06-2022
 * Autor: Quiroz Vega Kevin Alexis
 * 
 */
package vista;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Tanya
 */
public class Inventario extends javax.swing.JFrame {

    Connection con;
    /**
     * Creates new form Inventario
     */
    public Inventario() {
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

        etiquetaCatalogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnDepartamentos = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        lbCodigoProducto = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCodigoProducto = new javax.swing.JTextField();
        etiquetaProductos1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCatalogo = new javax.swing.JTable();
        etiquetaAtiende = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        btnBuscarDepartamento = new javax.swing.JButton();
        lbDepartamento = new javax.swing.JLabel();
        btnBuscarCodigo = new javax.swing.JButton();
        btnBuscarMinimo = new javax.swing.JButton();
        lbMinimo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtnMenuVentas = new javax.swing.JMenu();
        BtnMenuClientes = new javax.swing.JMenu();
        BtnMenuProductos = new javax.swing.JMenu();
        BtnMenuProveedores = new javax.swing.JMenu();
        BtnMenuInventario = new javax.swing.JMenu();
        BtnMenuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaCatalogo.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaCatalogo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaCatalogo.setForeground(new java.awt.Color(255, 153, 51));
        etiquetaCatalogo.setText("Catalogo");
        getContentPane().add(etiquetaCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 91, 24));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 844, 10));

        btnNuevo.setText("Nuevo");
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, -1, -1));

        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 41, -1, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 41, -1, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 41, -1, -1));

        btnDepartamentos.setText("Departamentos");
        getContentPane().add(btnDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 41, -1, -1));

        btnCatalogo.setText("Catalogo");
        getContentPane().add(btnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 41, -1, -1));

        lbCodigoProducto.setText("Codigo producto:");
        getContentPane().add(lbCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 844, 10));
        getContentPane().add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 120, 148, -1));

        etiquetaProductos1.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaProductos1.setText("PRODUCTOS");
        getContentPane().add(etiquetaProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 91, 24));

        tblCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProducto", "Nombre Producto", "Codigo de barrasl", "Precio compra", "lPrecio venta", "Minimo", "Maximo", "Existencia", "Departamento", "Tipo Producto", "Caducidad", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCatalogo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 844, -1));

        etiquetaAtiende.setText("Lo atiende");
        getContentPane().add(etiquetaAtiende, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 5, -1, -1));
        getContentPane().add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 149, 148, -1));

        btnBuscarDepartamento.setText("Buscar por departamento");
        btnBuscarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDepartamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 148, -1, -1));

        lbDepartamento.setText("Departamento:");
        getContentPane().add(lbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 152, -1, -1));

        btnBuscarCodigo.setText("Buscar por codigo");
        btnBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 119, -1, -1));

        btnBuscarMinimo.setText("Buscar");
        btnBuscarMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMinimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        lbMinimo.setText("Debajo del minimo");
        getContentPane().add(lbMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        BtnMenuVentas.setText("Ventas");
        jMenuBar1.add(BtnMenuVentas);

        BtnMenuClientes.setText("Clientes");
        jMenuBar1.add(BtnMenuClientes);

        BtnMenuProductos.setText("Productos");
        jMenuBar1.add(BtnMenuProductos);

        BtnMenuProveedores.setText("Proveedores");
        jMenuBar1.add(BtnMenuProveedores);

        BtnMenuInventario.setText("Inventario");
        jMenuBar1.add(BtnMenuInventario);

        BtnMenuConfiguracion.setText("Configuracion");
        jMenuBar1.add(BtnMenuConfiguracion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarDepartamentoActionPerformed

    private void btnBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCodigoActionPerformed

    private void btnBuscarMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMinimoActionPerformed
    
    public boolean conectar(){
        try{
            Driver driver =  new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String cadenaDeConexion = "jdbc:mysql://" + "localhost" + ":3306/" + "facturasupsin2022" ;
            String usuario = "root";
            String contraseña = "";
            con = DriverManager.getConnection(cadenaDeConexion, usuario, contraseña);
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e);
            return false;
        }
    }
    
    public DefaultTableModel consultar(String query){
        try{
            Statement s= con.createStatement();
            ResultSet rs = s.executeQuery(query);
            DefaultTableModel dtm = new DefaultTableModel();
            ResultSetMetaData rsMd = rs.getMetaData(); //Aun no se sabew cuantas columnas hay
            int columnas = rsMd.getColumnCount(); // Regresa el número de columnas
            //Cliclo para columnas
            for(int i = 1; i <= columnas; i++) { // Sirve para obtener los nombres de cada columna (encabezado)
                dtm.addColumn(rsMd.getColumnName(i));
            }
            //Ciclo para filas o datos de la tabla
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                dtm.addRow(fila);
            }
            return dtm;
        }catch(SQLException e){
            
            return null;
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu BtnMenuClientes;
    public javax.swing.JMenu BtnMenuConfiguracion;
    public javax.swing.JMenu BtnMenuInventario;
    public javax.swing.JMenu BtnMenuProductos;
    public javax.swing.JMenu BtnMenuProveedores;
    public javax.swing.JMenu BtnMenuVentas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCodigo;
    private javax.swing.JButton btnBuscarDepartamento;
    private javax.swing.JButton btnBuscarMinimo;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnDepartamentos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel etiquetaAtiende;
    private javax.swing.JLabel etiquetaCatalogo;
    private javax.swing.JLabel etiquetaProductos1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCodigoProducto;
    private javax.swing.JLabel lbDepartamento;
    private javax.swing.JLabel lbMinimo;
    private javax.swing.JTable tblCatalogo;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDepartamento;
    // End of variables declaration//GEN-END:variables
}
