
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author finfanterodal
 */
public class Boletin1_5 {

    
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in); 
      float millas,metros;
      //Pedimos datos.
      System.out.println("Introduce la distancia en millas: ");
        millas=leer.nextFloat();
      //Calculamos.
      metros=1852*millas;
      System.out.println("Esta distancia en millas: "+millas+", equivalen a "+metros+" metros");
      
    }
    
}
