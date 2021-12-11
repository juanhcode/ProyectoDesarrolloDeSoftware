/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Responsables;
import Modelo.SqlGestionarResponsables;
import Modelo.SqlRegistrarNiños;
import Modelo.niños;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class frmRegistroNiños extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();

    /**
     * Creates new form frmGestionarMatricula
     */
    public frmRegistroNiños() {
        initComponents();
        initComponents();
        setLocationRelativeTo(null); //abre la ventana en la mitad
        setResizable(false);
        this.setContentPane(fondo);
        this.setTitle("Gestión Matricula");
        initComponents();
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/guarderia1.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        campoMatricula = new javax.swing.JTextField();
        campoFecha = new javax.swing.JTextField();
        campoFechaIngreso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoRegistroC = new javax.swing.JTextField();
        campoSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoResponsable = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TipoSangre = new javax.swing.JComboBox<>();
        CampoGrado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Consultar1 = new javax.swing.JButton();
        consultaN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Sexo:");

        Registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        campoMatricula.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Registro civil");

        campoRegistroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRegistroCActionPerformed(evt);
            }
        });

        campoSexo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Fecha De Nacimiento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Fecha De Ingreso:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Grado:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("<html>Documento De Responsable:</html>");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("CRUD De Niños");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Tipo De Sangre:");

        TipoSangre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+" }));

        CampoGrado.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        CampoGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Iniciación","Párvulos","Prejardín","Jardín","Transición"}));
        CampoGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoGradoActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Registro Civil", "Fecha De Nacimiento", "Fecha De Ingreso", "Grado", "Tipo De Sangre", "Sexo", "DOC Responsable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(Tabla);

        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Consultar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Consultar1.setText("Consultar");
        Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Matricula:");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoRegistroC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(CampoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoResponsable)
                                    .addComponent(TipoSangre, 0, 91, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Registrar)
                                .addGap(46, 46, 46)
                                .addComponent(Modificar)
                                .addGap(33, 33, 33)
                                .addComponent(Eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Consultar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(consultaN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(campoRegistroC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(CampoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(campoResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(campoFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(Eliminar)
                            .addComponent(Modificar)
                            .addComponent(Registrar)
                            .addComponent(Consultar1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GestionMatricula regresar = new GestionMatricula();
        regresar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        SqlRegistrarNiños modSql = new SqlRegistrarNiños();
        niños mod = new niños();

        //Valida que ningun campo esté vacio
        if (campoRegistroC.getText().equals("") || campoMatricula.getText().equals("") || campoSexo.getSelectedItem().toString().equals("") || campoFecha.getText().equals("")
                || campoFechaIngreso.getText().equals("") || CampoGrado.getSelectedItem().toString().equals("")
                || campoResponsable.getText().equals("")
                || TipoSangre.getSelectedItem().toString().equals("") || campoFecha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos Vacios, Debe Llenar Todos Los Campos");
        } else {
            if (modSql.existeNiño(campoRegistroC.getText()) == 0) //usuario no existe
            {

                int ConvertirDocumentoNiño = Integer.parseInt(campoRegistroC.getText());
                mod.setRegistroCivil(ConvertirDocumentoNiño);
                mod.setNombres(campoMatricula.getText());
                mod.setSexo(campoSexo.getSelectedItem().toString());
                try {
                    Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(campoFecha.getText());
                    Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(campoFechaIngreso.getText());
                    mod.setFechaNacimiento(date1);
                    mod.setFechaIngreso(date2);
                } catch (ParseException ex) {
                    Logger.getLogger(frmRegistroNiños.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (CampoGrado.getSelectedItem().toString().equals("Iniciación")) {
                    System.out.println("1");
                    mod.setGrado(1 + "");
                } else if (CampoGrado.getSelectedItem().toString().equals("Párvulos")) {
                    System.out.println("2");
                    mod.setGrado(2 + "");
                } else if (CampoGrado.getSelectedItem().toString().equals("Prejardín")) {
                    System.out.println("3");
                    mod.setGrado(3 + "");
                } else if (CampoGrado.getSelectedItem().toString().equals("Jardín")) {
                    System.out.println("4");
                    mod.setGrado(4 + "");
                } else if (CampoGrado.getSelectedItem().toString().equals("Transición")) {
                    System.out.println("5");
                    mod.setGrado(5 + "");
                }
                int ConvertirIDPadre = Integer.parseInt(campoResponsable.getText());
                mod.setIdResponsable(ConvertirIDPadre);
                mod.setTipoDeSangre(TipoSangre.getSelectedItem().toString());
                if (modSql.registrar(mod, mod.getRegistroCivil())) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    // Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error Al Guardar Registro");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El Usuario Ya Existe");
            }

        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion Obconn = new Conexion();

            int Fila = Tabla.getSelectedRow(); //nos trae la fila seleccionada
            String nombreA = Tabla.getValueAt(Fila, 0).toString(); //nos trae el valor que esta en la columna 0 de la fila seleccioanda

            ps = Obconn.conectar().prepareStatement("SELECT nombre,numregistrocivil, num_matricula, fecha_nacimiento,fecha_ingreso,"
                    + "grado,tpsangre,sexo, codigo_responsable FROM niños n inner join se_relaciona s on n.num_matricula = s.num_matricula_niño WHERE num_matricula=?");
            ps.setInt(1, Integer.parseInt(nombreA));
            rs = ps.executeQuery();
            while (rs.next()) {
                campoRegistroC.setText(rs.getInt("numregistrocivil") + "");
                campoNombres.setText(rs.getString("nombre"));
                campoSexo.setSelectedItem(rs.getString("sexo"));
                campoMatricula.setText(rs.getInt("num_matricula") + "");
                Date date = rs.getDate("fecha_nacimiento");  
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
                String strDate = dateFormat.format(date);
                campoFecha.setText(strDate);
                Date date1 = rs.getDate("fecha_ingreso");  
                String strDate1 = dateFormat.format(date1);
                campoFechaIngreso.setText(strDate1);
                CampoGrado.setSelectedItem(rs.getInt("grado"));
                TipoSangre.setSelectedItem(rs.getString("tpsangre"));
                campoResponsable.setText(rs.getString("codigo_responsable"));           
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        PreparedStatement ps = null;
        try {

            Conexion Obconn = new Conexion();
            Connection conn = Obconn.conectar();

            int Fila = Tabla.getSelectedRow();
            String id = Tabla.getValueAt(Fila, 0).toString();
            int matricula = Integer.parseInt(id);

            ps = conn.prepareStatement("begin;"
                    + "DELETE FROM se_relaciona where num_matricula_niño=?;"
                    + "DELETE FROM niños WHERE num_matricula=?;"
                    + "commit;");
            ps.setInt(1, matricula);
            ps.setInt(2, matricula);
            ps.execute();

            // modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Alumno Eliminado");
            Limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Alumno");
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Conexion conexion = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;

        try {
            //con = getConexion();
            ps = conexion.conectar().prepareStatement("begin;"
                    + "UPDATE se_relaciona SET codigo_responsable=? where codigo_responsable=?;"
 		    + "UPDATE niños SET nombre=?, sexo=?, grado=?, tpsangre=?, numregistrocivil=? WHERE numregistrocivil=?;"
                    + "commit;");
            String copiaResponsable = campoResponsable.getText();
            
            //ps = con.prepareStatement("UPDATE se_relaciona SET codigo_responsable WHERE codigo_responsable=?");
            //nt DocumentoR = Integer.parseInt(campoResponsable.getText());
            ps.setInt(1, Integer.parseInt(campoResponsable.getText()));
            ps.setInt(2, Integer.parseInt(copiaResponsable));
            ps.setString(3, campoNombres.getText());
            ps.setString(4, campoSexo.getSelectedItem().toString());
            //String sDate1= campoFecha.getText();
            //String sDate2 =  campoFechaIngreso.getText();
            //Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(sDate1);
            //Date date2=new SimpleDateFormat("yyyy/MM/dd").parse(sDate2);  
            //ps.setDate(4, (java.sql.Date) date1);
            //ps.setDate(5, (java.sql.Date) date2);
            //ps.setString(4, campoFechaIngreso.getText());
            //ps.setString(5, CampoGrado.getSelectedItem().toString());
            ps.setString(6, TipoSangre.getSelectedItem().toString());
            int CampoID = Integer.parseInt(campoRegistroC.getText());
            ps.setInt(7, Integer.parseInt(campoRegistroC.getText()));
            

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos del Alumno Modificados Correctamente");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error Al Modificar Los Datos Del Alumno");
                Limpiar();
            }
            ps.close();
        } catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_ModificarActionPerformed

    private void Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar1ActionPerformed
        String consultaNiño = consultaN.getText();
        String where = "";
        if (!"".equals((consultaNiño))) {
            where = " WHERE num_matricula = '" + consultaNiño + "'";
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Tabla.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();

            String sql = "SELECT n.num_matricula,n.nombre,n.numregistrocivil,n.fecha_nacimiento,n.fecha_ingreso,"
                    + "g.nombre,n.tpsangre,n.sexo,s.codigo_responsable FROM niños n inner join se_relaciona  s on n.num_matricula = s.num_matricula_niño inner join grado g on n.grado = g.codigo" // lo que aprendimos en bd uwu seleccionar todos los datos de la tabla gestion docentes
                    + where;

            System.out.println(sql);
            ps = conn.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            modelo.addColumn("Matricula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Registro Civil");
            modelo.addColumn("Fecha Nacimiento");
            modelo.addColumn("Fecha Ingreso");
            modelo.addColumn("Grado");
            modelo.addColumn("Tipo De Sangre");
            modelo.addColumn("Sexo");
            modelo.addColumn("DOC Responsable");

            //Condicion para los anchos de la tableta xd
            int[] anchos = {50, 80, 50, 45, 70, 70, 50, 20, 50};
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
    }//GEN-LAST:event_Consultar1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JOptionPane.showMessageDialog(null, "Hasta Luego Rector");
        InicioSesion inicio = new InicioSesion();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CampoGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoGradoActionPerformed

    private void campoRegistroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRegistroCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRegistroCActionPerformed
    private void Limpiar() {
        campoRegistroC.setText("");
        campoMatricula.setText("");
        campoSexo.setSelectedItem("");
        campoFecha.setText("");
        campoFechaIngreso.setText("");
        CampoGrado.setSelectedItem("");
        TipoSangre.setSelectedItem("");
        campoResponsable.setText("");

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
            java.util.logging.Logger.getLogger(frmRegistroNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroNiños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CampoGrado;
    private javax.swing.JButton Consultar1;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Registrar;
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> TipoSangre;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoFechaIngreso;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoRegistroC;
    private javax.swing.JTextField campoResponsable;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JTextField consultaN;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
