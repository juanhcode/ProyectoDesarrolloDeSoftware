/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Pablo
 */
public class agenda {

    private int Codigo;
    private String Nota;
    private String Descripcion;
    private Date Fecha;
    private int Niño;
    private int Grado;

    public agenda(int Codigo, String Nota, String Descripcion, Date Fecha, int Niño, int Grado) {
        this.Codigo = Codigo;
        this.Nota = Nota;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Niño = Niño;
        this.Grado = Grado;
    }

    public agenda() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getNiño() {
        return Niño;
    }

    public void setNiño(int Niño) {
        this.Niño = Niño;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }
 

    
}
