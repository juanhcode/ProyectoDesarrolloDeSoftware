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
public class SqlPagos extends Conexion {

    public boolean registrar(Pagos pago) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Conexion conexion = new Conexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO pago_matricula (codigompk, fecha_pago, valor_pago, codigo_niño) VALUES(?,?,?,?)";

        java.sql.Date dateSql= new java.sql.Date(pago.getFecha().getYear(),
                pago.getFecha().getMonth(),pago.getFecha().getDay());
        try {

            ps = conexion.conectar().prepareStatement(sql);
            ps.setInt(1, pago.getDocRegistroPago());
            ps.setDate(2, dateSql);
            ps.setInt(3, pago.getValor());
            ps.setInt(4, pago.getMatricula_niño());

            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existePago(Integer pago) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Conexion conexion = new Conexion();

        
        String sql = "SELECT count(codigompk) FROM pago_matricula WHERE codigompk = ?";
        try {
            ps = conexion.conectar().prepareStatement(sql);
            ps.setInt(1, pago);
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
