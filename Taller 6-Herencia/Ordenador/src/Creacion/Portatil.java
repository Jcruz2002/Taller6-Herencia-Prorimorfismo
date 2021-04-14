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
public class Portatil extends Ordenador {
    
    private double peso;
    
    public Portatil(String cod,int preci,double peso){
        super(cod,preci);
        this.peso=peso;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
     public String toString(){
        
        return super.toString()+"\n"+
               "Peso    : "+this.peso+"\n"+
               "Eslogan : Ideal para sus viajes";
    }
    
}
