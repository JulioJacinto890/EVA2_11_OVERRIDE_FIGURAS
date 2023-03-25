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
public class Triangulo extends Figura {
  
   private double altura;    
private double base;    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
   
    
 @Override    
    
   public double calcularA(){
    return (base*altura)/2;    
   }   

   
@Override  

  public double calcularPe(){
    return base*3;    
  }  

  @Override
 
  public String toString(){
    String cade = "\nDatos del triángulo.\n"
            + "Área: "+calcularA()+"\n"
            + "Perímetro: "+calcularPe();
    return cade;
  }
  
}
//clases abstractas solo sirven para generalizar y heredar
 //No sirven para crear objetos 