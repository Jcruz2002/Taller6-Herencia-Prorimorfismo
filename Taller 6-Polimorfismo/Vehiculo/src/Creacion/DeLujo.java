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
public class DeLujo extends Vehiculo{
    
    private int NPasajero;
    
    public DeLujo(){
        this("435AGD","Lamborghini",2019,1000000000,2);
    
    
    }
    
    public DeLujo(String NumS, String marca, int an, int precio,int Np){
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
        
        return  "Vehiculo de Lujo"+"\n"+
                "Numero de Serie Motor: "+super.getNumeroSerie()+"\n"+
                "Marca                : "+super.getMarca()+"\n"+
                "Año                  : "+super.getAn()+"\n"+
                "Precio               : "+super.getPrecio()+"\n"+
                "Numero de Pasajeros  : "+this.NPasajero;
    }
       
}
