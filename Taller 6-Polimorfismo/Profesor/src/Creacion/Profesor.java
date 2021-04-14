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
public class Profesor extends Persona{
    
      private String ID;

    
    public Profesor(String Nombre, String Apellido,String ID) {
        super(Nombre, Apellido);
        this.ID=ID;
        
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    
    @Override
    public String toString(){
       return "Profesor nombre :" + super.getNombre()+" "+super.getApellido()+" con Id de profesor: Prof "+this.ID+"(test1)";
    }
    
}
