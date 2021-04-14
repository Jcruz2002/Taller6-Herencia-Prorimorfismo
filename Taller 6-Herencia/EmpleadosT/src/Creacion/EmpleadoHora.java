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
public class EmpleadoHora extends Empleado {
    
    private int PagExtra;
    
    public EmpleadoHora(int horas, double pagh,int PagExtra){
        super(horas,pagh);
        this.PagExtra=PagExtra;     
    }

    /**
     * @return the PagExtra
     */
    public int getPagExtra() {
        return PagExtra;
    }

    /**
     * @param PagExtra the PagExtra to set
     */
    public void setPagExtra(int PagExtra) {
        this.PagExtra = PagExtra;
    }
   
    @Override
    public double CalcularSalario(){
        if(super.getHoras()>40){
            return super.CalcularSalario()+this.PagExtra;
        }
        else
            return super.CalcularSalario();
    }
}
