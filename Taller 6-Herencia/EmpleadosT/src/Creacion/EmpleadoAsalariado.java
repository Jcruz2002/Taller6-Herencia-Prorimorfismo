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
public class EmpleadoAsalariado extends Empleado {
    
    private double Salario;
    
    public EmpleadoAsalariado(int horas, double pagh,double Salar){
        super(horas,pagh);
        this.Salario=Salar;
        
    }

    /**
     * @return the Salario
     */
    public double getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    @Override
    public double CalcularSalario(){
      return this.Salario;
    }
}
