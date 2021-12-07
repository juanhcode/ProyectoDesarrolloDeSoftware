/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Modelo.Conexion.getConexion;
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
        Connection con = getConexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO agenda (idAgenda, Alumno_idAlumno, notaAgenda, Responsable_idResponsable, ID_Docente_Encargado) VALUES(?,?,?,?,?)";
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, Agenda.getId());
            ps.setInt(2, Agenda.getIdA());
            ps.setInt(3, Agenda.getNota());
            ps.setInt(4, Agenda.getIdR());
            ps.setInt(5, Agenda.getIdD());

            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existePago(String agenda) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Connection con = getConexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(Alumno_idAlumno) FROM pagos WHERE Alumno_idAlumno = ?";
        try {

            ps = con.prepareStatement(sql);
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

}
