/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.SqlGestionarDocentes;
import Modelo.docentes;
import Modelo.usuarios;
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
        CampoNom = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CampoApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampoDocu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ConsultaC = new javax.swing.JTextField();
        Grado = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        CampoEstudios = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomActionPerformed(evt);
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
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        CampoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCorreoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("<html> Grado Asignado: </html>");

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
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo", "Estudios"
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
        Grado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Iniciación","Párvulos","Prejardín","Jardín","Transición" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Estudios:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoNom, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(Modificar))
                                            .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Grado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Registrar)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Consultar)
                                            .addComponent(Eliminar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(ConsultaC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoDocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Consultar)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(CampoEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Registrar)
                            .addComponent(Eliminar)
                            .addComponent(Modificar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ConsultaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomActionPerformed

    private void CampoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCorreoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestionDocentes GestionD = new GestionDocentes();
        GestionD.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        SqlGestionarDocentes modSql = new SqlGestionarDocentes();
        docentes mod = new docentes();

        //Valida que ningun campo esté vacio
        if (CampoDocu.getText().equals("") || CampoNom.getText().equals("") 
                || CampoApellidos.getText().equals("") || CampoTelefono.getText().equals("") 
                || CampoEstudios.getText().equals("") || Grado.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos Vacios, Debe Llenar Todos Los Campos");
        } else {

            if (modSql.existeDocente(CampoDocu.getText()) == 0) //usuario no existe
            {
                if (modSql.ValidarEmail2(CampoCorreo.getText())) {

                    int GuardarId = Integer.parseInt(CampoDocu.getText());
                    mod.setDocumento(GuardarId);
                    mod.setNombres(CampoNom.getText());
                    mod.setApellidos(CampoApellidos.getText());
                    int GuardarTelefono = Integer.parseInt(CampoTelefono.getText());
                    mod.setTelefono(GuardarTelefono);
                    mod.setCorreo(CampoCorreo.getText());
                    mod.setEstudios(CampoCorreo.getText());
                    mod.setGrado(Grado.getSelectedItem().toString());
                    
                    if (Grado.getSelectedItem().toString().equals("Iniciación")) {
                        System.out.println("1");
                        mod.setGrado(1 + "");
                        } else if (Grado.getSelectedItem().toString().equals("Párvulos")) {
                        System.out.println("2");
                        mod.setGrado(2 + "");
                        } else if (Grado.getSelectedItem().toString().equals("Prejardín")) {
                        System.out.println("3");
                        mod.setGrado(3 + "");
                        } else if (Grado.getSelectedItem().toString().equals("Jardín")) {
                        System.out.println("4");
                        mod.setGrado(4 + "");
                        } else if (Grado.getSelectedItem().toString().equals("Transición")) {
                        System.out.println("5");
                        mod.setGrado(5 + "");
                        }

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
            where = "WHERE documento_docente = '" + consultaC + "'";

        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();

            String sql = "SELECT documento_docente,nombre_docente,apellidos_docente,telefono_docente,correodoc,estudios FROM docente " // lo que aprendimos en bd uwu seleccionar todos los datos de la tabla gestion docentes 
                    + where;
            System.out.println(sql);
            ps = conn.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            modelo.addColumn("Documento");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("Estudios");
            
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
            Connection conn = Obconn.getCon();

            int Fila = Tabla.getSelectedRow(); //nos trae la fila seleccionada
            String nombreU = Tabla.getValueAt(Fila, 0).toString(); //nos trae el valor que esta en la columna 0 de la fila seleccioanda

            ps = conn.prepareStatement("SELECT idDocente, NombresDocente, ApellidosDocente, TelefonoDocentes, "
                    + "CorreoDocentes, Grado_Asignado FROM docente WHERE idDocente=?");
            ps.setString(1, nombreU);
            rs = ps.executeQuery();

            while (rs.next()) {
      
                CampoDocu.setText(rs.getString("idDocente"));
                CampoDocu.setEditable(false);
                CampoDocu.setEnabled(false);
                CampoNom.setText(rs.getString("NombresDocente"));
                CampoApellidos.setText(rs.getString("ApellidosDocente"));
                CampoTelefono.setText(rs.getString("TelefonoDocentes"));
                CampoCorreo.setText(rs.getString("CorreoDocentes"));
                Grado.setSelectedItem(rs.getString("Grado_Asignado"));
                Grado.setEditable(false);
                Grado.setEnabled(false);
                
                
                
          
               
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        PreparedStatement ps = null;

        try {

            Conexion Obconn = new Conexion();
            Connection conn = Obconn.conectar();

            ps = conn.prepareStatement("UPDATE docente SET  NombresDocente=?, ApellidosDocente=?, TelefonoDocentes=?,"
                    + " CorreoDocentes=?, Grado_Asignado=? WHERE idDocente=?");

            ps.setString(1, CampoNom.getText());
            ps.setString(2, CampoApellidos.getText());
            int CampoT = Integer.parseInt(CampoTelefono.getText());
            ps.setInt(3, CampoT);
            ps.setString(4, CampoCorreo.getText());
            ps.setString(5, Grado.getSelectedItem().toString());
            int CampoID = Integer.parseInt(CampoDocu.getText());
            ps.setInt(6, CampoID);

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos de Docente Modificados Correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error Al Modificar Los Datos Del Docente");
                limpiar();
            }
            conn.close();
        } catch (Exception e) {
            System.err.println(e);
        }


    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        PreparedStatement ps = null;
        try {

            Conexion Obconn = new Conexion();
            Connection conn = Obconn.getCon();

            int Fila = Tabla.getSelectedRow();
            String id = Tabla.getValueAt(Fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM docente WHERE idDocente=?");
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

    private void limpiar() {
        CampoDocu.setText("");
        CampoNom.setText("");
        CampoApellidos.setText("");
        CampoTelefono.setText("");
        CampoCorreo.setText("");
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
    private javax.swing.JTextField CampoApellidos;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoDocu;
    private javax.swing.JTextField CampoEstudios;
    private javax.swing.JTextField CampoNom;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JTextField ConsultaC;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JComboBox<String> Grado;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Registrar;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
