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
public class niños {

    private int matricula;
    private String nombres;
    private String sexo;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private String grado;
    private int registroCivil;
    private int idResponsable;
    private String TipoDeSangre;

    public niños(int matricula, String nombres, String sexo, Date fechaNacimiento, Date fechaIngreso, String grado,int registroCivil, int idResponsable, String TipoDeSangre) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.grado = grado;
        this.registroCivil = registroCivil;
        this.idResponsable = idResponsable;
        this.TipoDeSangre = TipoDeSangre;
    }

    public niños() {
    }
    
    
    
    
    public String getTipoDeSangre() {
        return TipoDeSangre;
    }
    
    public void setTipoDeSangre(String TipoDeSangre) {
        this.TipoDeSangre = TipoDeSangre;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getRegistroCivil() {
        return registroCivil;
    }

    public void setRegistroCivil(int registroCivil) {
        this.registroCivil = registroCivil;
    }
    
    

}
