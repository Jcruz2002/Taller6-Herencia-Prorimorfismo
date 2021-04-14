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
public class EmpleadoComision extends Empleado {
    
    private int Comision;
    
    public EmpleadoComision(int hora, double pagh,int Comison){
        super(hora,pagh);
        this.Comision=Comison;
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
       
         return super.CalcularSalario()+this.Comision;
    }
    
}
