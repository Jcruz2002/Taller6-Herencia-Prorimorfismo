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
public class Compacto extends Vehiculo{
    
    private int NPasajeros;
    
    public Compacto(){
    this("23AWA","Chevrolet",2017,4000000,4);
    }
  
    public Compacto(String NumS, String marca, int an, int prec, int NPasj){
        super(NumS,marca,an,prec);
        this.NPasajeros=NPasj;
        
    }    

    /**
     * @return the NPasajeros
     */
    public int getNPasajeros() {
        return NPasajeros;
    }

    /**
     * @param NPasajeros the NPasajeros to set
     */
    public void setNPasajeros(int NPasajeros) {
        this.NPasajeros = NPasajeros;
    }
    
    @Override
    public String toString(){
        
        return  super.toString()+"\n"+
                "Numero de Pasajeros  : "+this.NPasajeros;
    }
    
    
}
