/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.SqlGestionarDocentes;
import Modelo.docentes;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class frmgestionardocente extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    DefaultTableModel modelo = new DefaultTableModel();

    public frmgestionardocente() {
        initComponents();
        setLocationRelativeTo(null); //abre la ventana en la mitad
        setResizable(false);
        this.setContentPane(fondo);
        this.setTitle("Gestionar Docentes");
        //  cargar(); //carga la tableta
        initComponents();

    }

    /* public void cargar (){
         String[] titulos ={"ID", "Nombres", "Apellidos", "Telefono", "Correo", "Estudios"};
         String[] registros = new String[50];
         
         String sql = "SELECT * FROM gestionar_docentes"; // lo que aprendimos en bd uwu seleccionar todos los datos de la tabla gestion docentes 

       
        
        model = new DefaultTableModel(null, titulos);
        
        
       
        Connection con = getConexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla gestionar_docentes.
        try{
           PreparedStatement ps = null; //ps= sentencia preparada;
           ResultSet rs = ps.executeQuery(sql);
            while (rs.next())
            {
              registros[0]  = rs.getString("id");
              registros[1]  = rs.getString("nombres");
              registros[2]  = rs.getString("apellidos");
              registros[3]  = rs.getString("telefono");
              registros[4]  = rs.getString("correo");
              registros[5]  = rs.getString("estudios");
              
              model.addRow(registros); // trae los arreglos de la bd
            } //fin while
            Tabla.setModel(model);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
     */ // }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        camponombres = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoapellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campotelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campocorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ConsultaC = new javax.swing.JTextField();
        Grado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoEstudios = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        camponombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombresActionPerformed(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CRUD Docente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        campocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocorreoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Correo:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Consultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Telefono", "Correo", "Grado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        Grado.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Jardín", "Jardín", "Transición" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("<html> Grado Asignado: </html>");

        jLabel9.setText("Estudios");

        campoEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstudiosActionPerformed(evt);
            }
        });

        jMenu3.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(64, 64, 64)
                                    .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(0, 2, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(camponombres, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addComponent(Modificar))
                                        .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Grado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Registrar)
                                .addGap(18, 18, 18)
                                .addComponent(Eliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(ConsultaC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(Consultar)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(campoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(camponombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ConsultaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Consultar))))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Registrar)
                    .addComponent(Eliminar)
                    .addComponent(Modificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camponombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponombresActionPerformed

    private void campocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocorreoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestionDocentes GestionD = new GestionDocentes();
        GestionD.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        SqlGestionarDocentes modSql = new SqlGestionarDocentes();
        docentes mod = new docentes();

        //Valida que ningun campo esté vacio
        if (campoid.getText().equals("") || camponombres.getText().equals("") || campoapellidos.getText().equals("")
                || campotelefono.getText().equals("") || Grado.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos Vacios, Debe Llenar Todos Los Campos");
        } else {

            if (modSql.existeDocente(campoid.getText()) == 0) //usuario no existe
            {
                if (modSql.ValidarEmail2(campocorreo.getText())) {

                    int GuardarId = Integer.parseInt(campoid.getText());
                    mod.setId(GuardarId);
                    mod.setNombres(camponombres.getText());
                    mod.setAprellidos(campoapellidos.getText());
                    int GuardarTelefono = Integer.parseInt(campotelefono.getText());
                    mod.setTelefonos(GuardarTelefono);
                    mod.setCorreo(campocorreo.getText());
                    mod.setGrado(Grado.getSelectedItem().toString());

                    if (modSql.registrarDocente(mod)) {
                        JOptionPane.showMessageDialog(null, "Registro Guardado");
                        // Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error Al Guardar Registro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Correo Electronico No Es Valido");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El Usuario Ya Existe");
            }
            limpiar();
        }


    }//GEN-LAST:event_RegistrarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        String consultaC = ConsultaC.getText();
        String where = "";
        if (!"".equals((consultaC))) {
            where = "WHERE idDocente = '" + consultaC + "'";

        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            //Connection con = conn.getConexion();

            String sql = "SELECT idDocente, NombresDocente, ApellidosDocente, TelefonoDocentes, CorreoDocentes, Grado_Asignado FROM docente " // lo que aprendimos en bd uwu seleccionar todos los datos de la tabla gestion docentes 
                    + where;
            System.out.println(sql);
            //ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("Grado");
            //Condicion para los anchos de la tableta xd 
            int[] anchos = {20, 50, 50, 50, 150, 100};
            for (int i = 0; i < Tabla.getColumnCount(); i++) {
                Tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        //Evento al hacer click en la Tabla
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion Obconn = new Conexion();
            //Connection conn = Obconn.getConexion();

            int Fila = Tabla.getSelectedRow(); //nos trae la fila seleccionada
            String nombreU = Tabla.getValueAt(Fila, 0).toString(); //nos trae el valor que esta en la columna 0 de la fila seleccioanda
            /*
            ps = conn.prepareStatement("SELECT idDocente, NombresDocente, ApellidosDocente, TelefonoDocentes, "
                    + "CorreoDocentes, Grado_Asignado FROM docente WHERE idDocente=?");
            */
            ps.setString(1, nombreU);
            rs = ps.executeQuery();

            while (rs.next()) {
      
                campoid.setText(rs.getString("idDocente"));
                campoid.setEditable(false);
                campoid.setEnabled(false);
                camponombres.setText(rs.getString("NombresDocente"));
                campoapellidos.setText(rs.getString("ApellidosDocente"));
                campotelefono.setText(rs.getString("TelefonoDocentes"));
                campocorreo.setText(rs.getString("CorreoDocentes"));
                Grado.setSelectedItem(rs.getString("Grado_Asignado"));
                Grado.setEditable(false);
                Grado.setEnabled(false);
                
                
                
          
               
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        Connection con = null;
        PreparedStatement ps = null;

        try {

            //con = getConexion();

            ps = con.prepareStatement("UPDATE docente SET  NombresDocente=?, ApellidosDocente=?, TelefonoDocentes=?,"
                    + " CorreoDocentes=?, Grado_Asignado=? WHERE idDocente=?");

            ps.setString(1, camponombres.getText());
            ps.setString(2, campoapellidos.getText());
            int CampoT = Integer.parseInt(campotelefono.getText());
            ps.setInt(3, CampoT);
            ps.setString(4, campocorreo.getText());
            ps.setString(5, Grado.getSelectedItem().toString());
            int CampoID = Integer.parseInt(campoid.getText());
            ps.setInt(6, CampoID);

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos de Docente Modificados Correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error Al Modificar Los Datos Del Docente");
                limpiar();
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }


    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        PreparedStatement ps = null;
        try {

            Conexion Obconn = new Conexion();
            //Connection conn = Obconn.getConexion();

            int Fila = Tabla.getSelectedRow();
            String id = Tabla.getValueAt(Fila, 0).toString();

            //ps = conn.prepareStatement("DELETE FROM docente WHERE idDocente=?");
            ps.setString(1, id);
            ps.execute();

            // modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Docente Eliminado");
            limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Docente");
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JOptionPane.showMessageDialog(null, "Hasta Luego Rector");
        InicioSesion inicio = new InicioSesion();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void campoEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstudiosActionPerformed

    private void limpiar() {
        campoid.setText("");
        camponombres.setText("");
        campoapellidos.setText("");
        campotelefono.setText("");
        campocorreo.setText("");
        Grado.setSelectedItem("");
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/registroD.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }

    }

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmgestionardocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConsultaC;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JComboBox<String> Grado;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Registrar;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField campoEstudios;
    private javax.swing.JTextField campoapellidos;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JTextField campoid;
    private javax.swing.JTextField camponombres;
    private javax.swing.JTextField campotelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
