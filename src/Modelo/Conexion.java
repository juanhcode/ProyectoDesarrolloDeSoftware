package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    
    Connection con = null;
    String usuario = "postgres";
    String ip = "localhost";
    String clave = "2001";
    String bd = "guarderia";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(cadena, usuario, clave);
        } catch (Exception e) {
            System.out.println("Conexion fallida");
        }

        return con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    

}
