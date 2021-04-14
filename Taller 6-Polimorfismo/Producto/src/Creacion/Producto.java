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
public abstract class Producto {
    
    private String Nombre;
    private int precio;
    private int nProducto;
    
    public Producto(){}
    
    public Producto(String Nombre, int precio, int Nproduct){
        this.Nombre=Nombre;
        this.precio=precio;
        this.nProducto=Nproduct;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the nProducto
     */
    public int getnProducto() {
        return nProducto;
    }

    /**
     * @param nProducto the nProducto to set
     */
    public void setnProducto(int nProducto) {
        this.nProducto = nProducto;
    }
    
    public abstract int CalcularPrecio();
    
    public abstract String toString();
    
}
