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
public class Pagos {
    private int DocRegistroPago;
    private Date Fecha;
    private int Valor;
    private int Matricula_niño;

    public int getDocRegistroPago() {
        return DocRegistroPago;
    }

    public void setDocRegistroPago(int DocRegistroPago) {
        this.DocRegistroPago = DocRegistroPago;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }


    public int getMatricula_niño() {
        return Matricula_niño;
    }

    public void setMatricula_niño(int Matricula_niño) {
        this.Matricula_niño = Matricula_niño;
    }


}
