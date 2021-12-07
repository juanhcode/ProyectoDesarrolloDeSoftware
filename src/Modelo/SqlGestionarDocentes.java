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
public class SqlGestionarDocentes extends Conexion {
    
    //Registrar Usuarios
    public boolean registrarDocente(docentes usr) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        Connection con = getConexion();
        
        //Aqui se guardan los datos a la base de datos usuarios tabla gestionar_docentes.
        String sql = "INSERT INTO docente (idDocente, NombresDocente, ApellidosDocente, TelefonoDocentes, CorreoDocentes, Grado_Asignado) VALUES(?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId());
            ps.setString(2, usr.getNombres());
            ps.setString(3, usr.getAprellidos());
            ps.setInt(4, usr.getTelefonos());
            ps.setString(5, usr.getCorreo());
            ps.setString(6, usr.getGrado());
            ps.execute();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }
    
     public int existeDocente(String docente) {

        PreparedStatement ps = null; //ps= sentencia preparada;
        ResultSet rs = null;
        Connection con = getConexion();

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(idDocente) FROM docente WHERE idDocente= ?";
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, docente);
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
    public boolean ValidarEmail2(String correo) {
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
