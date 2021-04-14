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
public abstract class Vehiculo {
    
      private String NumeroSerie;
    private String Marca;
    private int An;
    private int Precio;
    
    public Vehiculo(){
        this("1A23BC","MAZDA",2012,3000000);
    }
    
    public Vehiculo(String NumS, String marca, int an, int precio){
        this.NumeroSerie=NumS;
        this.Marca=marca;
        this.An=an;
        this.Precio=precio;
    }

    /**
     * @return the NumeroSerie
     */
    public String getNumeroSerie() {
        return NumeroSerie;
    }

    /**
     * @param NumeroSerie the NumeroSerie to set
     */
    public void setNumeroSerie(String NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the An
     */
    public int getAn() {
        return An;
    }

    /**
     * @param An the An to set
     */
    public void setAn(int An) {
        this.An = An;
    }

    /**
     * @return the Precio
     */
    public int getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
     public abstract String toString();
    
}
