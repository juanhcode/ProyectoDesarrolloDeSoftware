/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO responsables (documento_res, nombreres, direccion, numtelefono, parentesco) VALUES(?,?,?,?,?)";

        try {
            ps = conexion.conectar().prepareStatement(sql);
            ps.setInt(1, res.getDocumento());
            ps.setString(2, res.getNombre());
            ps.setString(3, res.getDirección());
            ps.setInt(4, res.getTelefono());
            ps.setString(5, res.getParentesco());
            ps.execute();
            ps.close();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existeResponsable(String res) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Conexion conexion = new Conexion();
        conexion.conectar();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(documento_res) FROM responsables WHERE documento_res = ?";
        try {
            
            ps = conexion.conectar().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(res));
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
