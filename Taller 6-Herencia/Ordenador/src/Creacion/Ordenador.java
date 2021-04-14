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
public class Ordenador {
    
    private String codigo;
    private int precio;
    
    public Ordenador(){}
    
    public Ordenador(String cod, int preci){
        this.codigo=cod;
        this.precio=preci;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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


   public String toString(){
        
        return "Codigo  : " + this.codigo + "\n"+
               "Precio  : " + this.precio ;
    }
}
