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
public class NoPerecedero extends Producto{
    
     private String Tipo;
    
    public NoPerecedero(String nom, int pre, int Nc, String tipo){
        super(nom,pre,Nc);
        this.Tipo=tipo;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    @Override
     public int CalcularPrecio(){
        return (super.getPrecio()*super.getnProducto());
    }
    
    @Override
     public String toString(){
         
         return "Nombre   : "+super.getNombre()+"\n"+
                "Precio   : "+super.getPrecio()+"\n"+
                "Cantidad : "+super.getnProducto()+"\n"+
                "Tipo     : "+this.Tipo;
    }
    


    
}
