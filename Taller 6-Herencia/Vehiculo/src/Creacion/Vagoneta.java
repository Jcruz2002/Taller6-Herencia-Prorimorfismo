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
public class Vagoneta extends Vehiculo {
    
    private int NPasajero;
    
    public Vagoneta(){
        
        this("56FSA2","Mazda",2013,4500000,4);
    }
    
    public Vagoneta(String NumS, String marca, int an, int precio, int Np){
        super(NumS,marca,an,precio);
        this.NPasajero=Np;
    }

    /**
     * @return the NPasajero
     */
    public int getNPasajero() {
        return NPasajero;
    }

    /**
     * @param NPasajero the NPasajero to set
     */
    public void setNPasajero(int NPasajero) {
        this.NPasajero = NPasajero;
    }
    
     @Override
    public String toString(){
        
        return   super.toString()+"\n"+
                "Numero de Pasajeros  : "+this.NPasajero;
    }
    
}
