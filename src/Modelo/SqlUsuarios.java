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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pablo
 */
public class SqlUsuarios extends Conexion {

    public static String user = "";
    String pass = "";
    //Registrar Usuarios

    public boolean registrar(usuarios usr) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Connection con = getConexion();

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO usuarios (id_Usuario, usuario, contraseña, nombre, correo, Tipo_Usuario_id_tipo) VALUES(?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId());
            ps.setString(2, usr.getUsuario());
            ps.setString(3, usr.getPassword());
            ps.setString(4, usr.getNombre());
            ps.setString(5, usr.getCorreo());
            ps.setInt(6, usr.getId_tipo());
            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    //Validar si un usuario ya existe
    public int existeUsuario(String Usuario) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Connection con = getConexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(id_Usuario) FROM usuarios WHERE usuario = ?";
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
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

    //Validar Correo Electronico
    public boolean ValidarEmail(String correo) {
        //Patron para validar email---- indica que la cadena debe iniciar con esos caracteres--- puede llevar los siguientes
        // debe llevar un arroba - dominio - punto
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+´)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        //se encarga de hacer la validacion del string con el patron
        Matcher mather = pattern.matcher(correo);
        //nos indica si lo encontró o no lo encontró
        return mather.find();
    }

}
