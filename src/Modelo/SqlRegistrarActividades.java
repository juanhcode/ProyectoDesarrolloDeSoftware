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
public class SqlRegistrarActividades extends Conexion {

    public boolean registrar(Actividades act) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Connection con = getConexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO actividades (idActividades, nombreActividad, DescripciónActividad, FechaActividad) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, act.getId());
            ps.setString(2, act.getNombre());
            ps.setString(3, act.getDescripcion());
            ps.setString(4, act.getFecha());

            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existeActividad(String Act) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Connection con = getConexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(idActividades) FROM actividades WHERE nombreActividad = ?";
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, Act);
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
