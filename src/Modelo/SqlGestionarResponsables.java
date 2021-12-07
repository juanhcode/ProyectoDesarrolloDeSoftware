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
public class SqlGestionarResponsables extends Conexion {

    public boolean registrarResponsables(Responsables res) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Connection con = getConexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO responsable (DocumentoResponsable, NombreResponsable, ApellidosResponsable, DirecciónResponsable, TelefonoResponsable, Parentesco) VALUES(?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, res.getDocumento());
            ps.setString(2, res.getNombre());
            ps.setString(3, res.getApellido());
            ps.setString(4, res.getDirección());
            ps.setInt(5, res.getTelefono());
            ps.setString(6, res.getParentesco());
            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existeResponsable(String res) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Connection con = getConexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(DocumentoResponsable) FROM responsable WHERE DocumentoResponsable = ?";
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, res);
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
