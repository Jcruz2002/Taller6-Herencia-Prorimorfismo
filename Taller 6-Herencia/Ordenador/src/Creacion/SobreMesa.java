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
public class SobreMesa extends Ordenador{
    
    private String Descripcion;
    
    public SobreMesa(String Codigo,int precio,String descrip){
        super(Codigo,precio);
        this.Descripcion=descrip;
       
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
     public String toString(){
        
        return super.toString()+"\n"+
               "Descripcion : "+this.Descripcion+"\n"+
               "Eslogan     : Es el que más pesa, pero el que menos cuesta";
    }
    
}
