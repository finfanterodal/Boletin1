
package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author finfanterodal
 */
public class Boletin1_4 {

    public static void main(String[] args) {
        
  Scanner leer = new Scanner(System.in);  
  float num1, num2;
  float suma, resta, producto, division;
  //Pedimos datos.
   System.out.println("Introduce el primer número: ");
        num1=leer.nextFloat();
   System.out.println("Introduce el segundo número: ");
        num2=leer.nextFloat();
  //Calculamos.
  suma=num1+num2;
  resta=num1-num2;
  producto=num1*num2;
  division=num1/num2;
  //Visualizamos los cálculos.
   System.out.println("Suma = "+suma+"\nResta = "+resta+"\nProducto = "+producto+"\nDivision = "+division);
  
        
        
        
    }
    
}
