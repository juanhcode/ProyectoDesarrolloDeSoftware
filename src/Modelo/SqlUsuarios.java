/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 */
public class SqlUsuarios extends Conexion {

    public static String user = "";
    String pass = "";
    //Registrar Usuarios

    public boolean registrar(usuarios usr, String fecha) {

        Conexion conexion = new Conexion();
        ResultSet rs = null;
        PreparedStatement pst = null; //ps= sentencia preparada;

        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO usuario (codigo,nombre, contraseña,idtipousuario,usuario_nickname,correo_electronico,last_session)"
                + " VALUES(?,?,?,?,?,?,?)";
        try {
            pst = conexion.conectar().prepareStatement(sql);
            pst.setInt(1, usr.getId());
            pst.setString(2, usr.getNombre());
            pst.setString(3, usr.getPassword());
            pst.setInt(4, usr.getId_tipo());
            pst.setString(5, usr.getUsuario());
            pst.setString(6, usr.getCorreo());
            pst.setTimestamp(7, Timestamp.valueOf(fecha));
            pst.execute();
            pst.close();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    //Validar si un usuario ya existe
    public int existeUsuario(String Usuario) {
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        PreparedStatement pst = null; //ps= sentencia preparada;

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agregamos
        String sql = "SELECT count(codigo) FROM usuario WHERE usuario_nickname = ?";
        try {

            pst = conexion.conectar().prepareStatement(sql);
            pst.setString(1, Usuario);
            rs = pst.executeQuery();
            System.out.println("Hola GG");
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return 1;

    }

    public int existeResponsable(int responsable) {
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        PreparedStatement pst = null; //ps= sentencia preparada;
        String sql = "SELECT documento_res FROM responsables WHERE documento_res = '" + responsable + "'";

        try {
            pst = conexion.conectar().prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Si existe un responsable");
                return 1;
            } else {
                System.out.println("No existe un responsable");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return 0;
    }
    
   public int existeDocente(int docente) {
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        PreparedStatement pst = null; //ps= sentencia preparada;
        String sql = "SELECT documento_docente FROM docente WHERE documento_docente = '" + docente + "'";

        try {
            pst = conexion.conectar().prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Si existe un docente");
                return 1;
            } else {
                System.out.println("No existe un docente");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return 0;
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
