/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_override_figuras;

/**
 *
 * @author hp
 */
public class Circulo extends Figura {
  
   private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
  @Override   
    
  public double calcularA(){
  return Math.PI*(radio*radio);
  }  
    

 @Override

 public double calcularPe(){
 return Math.PI*(radio*2);   
 } 
 
 @Override
 
  public String toString(){
    String cade = "\nDatos del círculo.\n"
            + "Área: "+calcularA()+"\n"
            + "Perímetro: "+calcularPe();
    return cade;
  }
    
    
}