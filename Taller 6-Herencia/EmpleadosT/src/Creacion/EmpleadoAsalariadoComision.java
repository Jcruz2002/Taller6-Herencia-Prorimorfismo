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
public class EmpleadoAsalariadoComision extends Empleado{
    
    private int Salario;
    private int Comision;
    
    public EmpleadoAsalariadoComision(int hora, double pagh, int Salario, int Comision){
        super(hora,pagh);
        this.Salario = Salario;
        this.Comision= Comision;
    }

    /**
     * @return the Salario
     */
    public int getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the Comision
     */
    public int getComision() {
        return Comision;
    }

    /**
     * @param Comision the Comision to set
     */
    public void setComision(int Comision) {
        this.Comision = Comision;
    }
    
     @Override
     public double CalcularSalario(){
       
         return this.Salario+this.Comision;
    }
    
    
}
