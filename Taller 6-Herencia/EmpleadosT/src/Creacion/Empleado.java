/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion;

/**
 *
 * @author jdavi
 */
public class Empleado {
    
    private int Horas;
    private double pagoHoras;
    
    public Empleado(){}
    
    public Empleado(int horas,double pago){
        this.Horas=horas;
        this.pagoHoras=pago;
    }

    /**
     * @return the Horas
     */
    public int getHoras() {
        return Horas;
    }

    /**
     * @param Horas the Horas to set
     */
    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    /**
     * @return the pagoHoras
     */
    public double getPagoHoras() {
        return pagoHoras;
    }

    /**
     * @param pagoHoras the pagoHoras to set
     */
    public void setPagoHoras(double pagoHoras) {
        this.pagoHoras = pagoHoras;
    }
    
    public double CalcularSalario(){
      return this.Horas*this.pagoHoras;
    }
    
    
}
