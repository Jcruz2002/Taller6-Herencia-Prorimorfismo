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
public class Perecedero extends Producto {
    
    private int diaCaducar;
    
    public Perecedero(String nom, int pre, int Npro, int dias ){
        super(nom,pre,Npro);
        this.diaCaducar=dias;
    }


    /**
     * @return the dias
     */
    public int getDiaCaducar() {
        return diaCaducar;
    }

    /**
     * @param diaCaducar the dias to set
     */
    public void setDiaCaducar(int diaCaducar) {
        this.diaCaducar = diaCaducar;
    }
    
    @Override
    public int CalcularPrecio(){
        if(this.diaCaducar==1)
        {
            return super.CalcularPrecio()-(super.getPrecio()*4);
        }
        else
        {
            if(this.diaCaducar==2)
            {
               return super.CalcularPrecio()-(super.getPrecio()*3); 
            }
            else
            {
               if(this.diaCaducar==3)
            {
               return super.CalcularPrecio()-(super.getPrecio()/2); 
            }  
               else
               {
                   return super.CalcularPrecio();
               }
            }
        }
    }
    
      public String toString(){
        
        return  super.toString()+"\n"+
                "Dias de caducacion :"+this.diaCaducar;
        
    }
    
    
}
