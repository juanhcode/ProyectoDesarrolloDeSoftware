/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class SqlAgenda extends Conexion {

    public boolean registrarAgenda(agenda Agenda) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Conexion conexion = new Conexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO agenda (codigo, nota, descripcion, fecha, niño, grado) VALUES(?,?,?,?,?,?)";
        
        java.sql.Date dateSql= new java.sql.Date(Agenda.getFecha().getYear(),
                Agenda.getFecha().getMonth(),Agenda.getFecha().getDay());
        try {

            ps = conexion.conectar().prepareStatement(sql);
            ps.setInt(1, Agenda.getId());
            ps.setString(2, Agenda.getNota());
            ps.setString(3, Agenda.getDescripcion());
            ps.setDate(4, dateSql);
            ps.setInt(5, Agenda.getMatriculaNinio());
            ps.setInt(6, Agenda.getGrado());

            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }
/*
    public int existePago(String agenda) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Conexion conexion = new Conexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(Alumno_idAlumno) FROM pagos WHERE Alumno_idAlumno = ?";
        try {

            ps = conexion.conectar().prepareStatement(sql);
            ps.setString(1, agenda);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return 1;

    }
*/
}
