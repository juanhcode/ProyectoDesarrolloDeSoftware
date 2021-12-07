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
public class SqlRegistrarNiños extends Conexion {

    public boolean registrar(niños Niño) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Connection con = getConexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO alumno (idAlumno, NombresAlumno, ApellidosAlumno, SexoAlumno,"
                + "FechaDeNacimiento, FechaDeIngreso, Grado, TipoDeSangre, Responsable_idResponsable, IDDocente_Asignado) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, Niño.getId());
            ps.setString(2, Niño.getNombres());
            ps.setString(3, Niño.getAprellidos());
            ps.setString(4, Niño.getSexo());
            ps.setString(5, Niño.getFechaNacimiento());
            ps.setString(6, Niño.getFechaIngreso());
            ps.setString(7, Niño.getGrado());
            ps.setString(8, Niño.getTipoDeSangre());
            ps.setInt(9, Niño.getIdResponsable());
            ps.setInt(10, Niño.getIdDocente());

            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existeNiño(String Niño) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Connection con = getConexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(idAlumno) FROM alumno WHERE idAlumno = ?";
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, Niño);
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
