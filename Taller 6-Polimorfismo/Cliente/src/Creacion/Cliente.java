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
public abstract class Cliente {
    
    private int NIF;
    private long NumeroCuenta;
    private double saldo;
    
    public Cliente(){}
    
    public Cliente(int nif, long NCuen, double sald){
        this.NIF=nif;
        this.NumeroCuenta=NCuen;
        this.saldo=sald;
        
    }

    /**
     * @return the NIF
     */
    public int getNIF() {
        return NIF;
    }

    /**
     * @param NIF the NIF to set
     */
    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    /**
     * @return the NumeroCuenta
     */
    public long getNumeroCuenta() {
        return NumeroCuenta;
    }

    /**
     * @param NumeroCuenta the NumeroCuenta to set
     */
    public void setNumeroCuenta(long NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
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
    
     public abstract String toString();
        
}
