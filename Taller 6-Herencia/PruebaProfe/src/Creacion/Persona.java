package Creacion;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdavi
 */
public class Persona {
    
    private String Nombre;
    private String Apellido;
    
    public Persona(String Nombre, String Apellido){
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        
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
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

 
   
    public String toString(){
        return this.Nombre + " " + this.Apellido;
    }
}
