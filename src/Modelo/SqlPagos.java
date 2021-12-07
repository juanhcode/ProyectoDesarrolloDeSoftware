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
public class SqlPagos extends Conexion {

    public boolean registrar(Pagos pago) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Connection con = getConexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO pagos (IDRegistroPago, FechaPagos, ValorPagos, idResponsable, idAlumno) VALUES(?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getDocRegistroPago());
            ps.setString(2, pago.getFecha());
            ps.setInt(3, pago.getValor());
            ps.setInt(4, pago.getIdResponsable());
            ps.setInt(5, pago.getIdAlumno());

            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existePago(String pago) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Connection con = getConexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(IDRegistroPago) FROM pagos WHERE IDRegistroPago = ?";
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, pago);
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
