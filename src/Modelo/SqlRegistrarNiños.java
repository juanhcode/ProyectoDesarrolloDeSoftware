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
public class SqlRegistrarNiños extends Conexion {

    public boolean registrar(niños Niño,int registroCivil) {    
        Connection conn = null;
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        PreparedStatement pst = null; //ps= sentencia preparada;
        
        //Aqui se guardan los datos a la base de datos usuarios tabla usuarios.
        String sql = "INSERT INTO niños (num_matricula,nombre,numregistrocivil,"
                + "tpsangre,sexo,fecha_nacimiento,fecha_ingreso,grado) VALUES(?,?,?,?,?,?,?,?)";
        
        String sql2 = "INSERT INTO se_relaciona (codigo_responsable,num_matricula_niño) VALUES(?,?)";
        java.sql.Date dateSql= new java.sql.Date(Niño.getFechaNacimiento().getYear(),
                Niño.getFechaNacimiento().getMonth(),Niño.getFechaNacimiento().getDay());

        java.sql.Date dateSql2= new java.sql.Date(Niño.getFechaIngreso().getYear(),
                Niño.getFechaIngreso().getMonth(),Niño.getFechaIngreso().getDay());
        int matricula;
        try {
            
            //SQL1
            pst = conexion.conectar().prepareStatement(sql);
            pst.setInt(1, Niño.getMatricula());
            pst.setString(2, Niño.getNombres());
            pst.setInt(3, Niño.getRegistroCivil());
            pst.setString(4, Niño.getTipoDeSangre());
            pst.setString(5, Niño.getSexo());
            pst.setDate(6, dateSql);
            pst.setDate(7, dateSql2);
            pst.setInt(8, Integer.parseInt(Niño.getGrado()));
            pst.execute();
            
            //SQL3
            String sql3 = "SELECT num_matricula FROM niños WHERE numregistrocivil = '" + registroCivil + "'"; //UNICO
            pst = conexion.conectar().prepareStatement(sql3);
            rs = pst.executeQuery();
            if(rs.next()){
                matricula = rs.getInt("num_matricula");
                pst = conexion.conectar().prepareStatement(sql2);
                pst.setInt(1, Niño.getIdResponsable());
                pst.setInt(2, matricula);
                pst.execute();
            }
            return true;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return false;
    }

    public int existeNiño(String Niño) {

        Connection conn = null;
        Conexion conexion = new Conexion();
        conexion.conectar();
        ResultSet rs = null;
        PreparedStatement pst = null; //ps= sentencia preparada;

        //cuenta el numero de registros que tiene la tabla cuando usuario
        //sea igual al campo que agergamos
        String sql = "SELECT count(num_matricula) FROM niños WHERE numregistrocivil = ?";
        try {

            pst = conexion.conectar().prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(Niño));
            rs = pst.executeQuery();
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
