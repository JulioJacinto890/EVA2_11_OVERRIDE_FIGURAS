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
public class EVA2_11_OVERRIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //area, perimetro
        
        //circulo implementa su propia version de area y perimetro
        
        //triangulo
        
        
        
      Circulo circulo = new Circulo();
     circulo.setRadio(6);
     System.out.println(circulo);     
     
     Triangulo tri = new Triangulo();
     tri.setAltura(5);
     tri.setBase(4);
     System.out.println(tri);
     
    }
    
}
