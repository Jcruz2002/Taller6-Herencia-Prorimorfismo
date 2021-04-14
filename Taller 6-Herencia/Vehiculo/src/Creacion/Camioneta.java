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
public class Camioneta extends Vehiculo{
    
    private double Carga;
    private int ejes;
    private int rodadas;
    
    public Camioneta(){
        this("24MASD","Chevrolet",2010,4000000,50,4,6);
    
    }
    
    public Camioneta(String NumS, String marca, int an,int precio, double carg, int eje, int rodadas){
        super(NumS,marca,an,precio);
        this.Carga=carg;
        this.ejes=eje;
        this.rodadas=rodadas;
    
    }

    /**
     * @return the Carga
     */
    public double getCarga() {
        return Carga;
    }

    /**
     * @param Carga the Carga to set
     */
    public void setCarga(double Carga) {
        this.Carga = Carga;
    }

    /**
     * @return the ejes
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * @param ejes the ejes to set
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    /**
     * @return the rodadas
     */
    public int getRodadas() {
        return rodadas;
    }

    /**
     * @param rodadas the rodadas to set
     */
    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }
    
      @Override
    public String toString(){
        
        return   super.toString()+"\n"+
                "Capacidad de carga   : "+this.Carga+" Kg"+"\n"+
                "Numero de ejes       : "+this.ejes+"\n"+
                "Numero de rodadas    : "+this.rodadas;
    }
    
    
}
