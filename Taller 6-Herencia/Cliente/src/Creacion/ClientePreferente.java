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
public class ClientePreferente extends Cliente{
    
    private int NFondos,n;
    private Fondos[] Fond;
    
    

    public ClientePreferente (int inf, long Ncu,double sald,int fondo){
    
      super(inf,Ncu,sald);
      this.NFondos = fondo;
      this.Fond = new Fondos[this.NFondos];
      this.n=0;
     
   }

    /**
     * @return the NFondos
     */
    public int getNFondos() {
        return NFondos;
    }

    /**
     * @param NFondos the NFondos to set
     */
    public void setNFondos(int NFondos) {
        this.NFondos = NFondos;
    }
    
     /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
     public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the Fond
     */
    public Fondos[] getFond() {
        return Fond;
    }

    /**
     * @param Fond the Fond to set
     */
    public void setFond(Fondos[] Fond) {
        this.Fond = Fond;
    }
   
    
      public boolean inscribirFondo(int numero, double sald){
        if(this.n<this.NFondos){
            Fondos j = new Fondos(numero,sald);
            this.Fond[this.n]=j;
            this.n++;
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        
        return super.toString()+"\n"+
                "Numero de fondos: "+this.NFondos;
          
    }

   
    
}
