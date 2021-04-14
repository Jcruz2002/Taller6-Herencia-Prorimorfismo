/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion;

import java.util.Date;

/**
 *
 * @author jdavi
 */
public class ProfesorInterino extends Profesor {
    
    private Date Fecha;
    public ProfesorInterino(String Nombre,String Apellido,String ID,Date fech){
        super(Nombre,Apellido,ID);
        this.Fecha=fech;
        
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    @Override
     public String toString(){
        return "El profesor interino 1 se incorporo en la fecha: "+ this.Fecha + "(test2)";
      
    }
}
