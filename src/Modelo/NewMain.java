/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Juan Manuel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SqlUsuarios sqlU = new SqlUsuarios();
        //int cantidad = sqlU.existeUsuario("juan");
        //System.out.println("Cantidad de usuarios con el mismo nombre" + cantidad );
        
        sqlU.existePadre(454);
    }
    
}
