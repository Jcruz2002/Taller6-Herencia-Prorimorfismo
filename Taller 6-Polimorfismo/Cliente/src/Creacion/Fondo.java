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
public class Fondo {
    
     
    private int Numero;
    private double saldo;
  
  
    public Fondo(int numero, double saldo){
       
        this.Numero=numero;
        this.saldo=saldo;
    }


    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String toString(){
           return   "Numero :"+this.Numero+"\n"+
                    "Saldo  :"+this.saldo;
    }    
}
