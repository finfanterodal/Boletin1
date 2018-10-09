
package boletin1_1;

import java.util.Scanner;

public class Boletin1_1 {
    
/**
 *
 * @author finfanterodal
 */
    public static void main(String[] args) {
    //Pedimos datos.
    Scanner leer = new Scanner(System.in);    
    float base=4.0f, altura=3.0f, atriangulo;
    //Leemos datos.
    System.out.println("Introduce la base: ");
        base=leer.nextFloat();
    System.out.println("Introduce la altura: ");
        altura=leer.nextFloat();
   //Calculamos.
    atriangulo=(base*altura)/2;
        System.out.println("\nÁrea del triángulo = "+atriangulo);
  
//Sin crear la variable arectangulo.
        System.out.println("Área del triángulo = "+((base*altura)/2));
      
    }
    
}
