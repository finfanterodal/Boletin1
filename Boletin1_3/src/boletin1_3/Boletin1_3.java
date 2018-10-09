
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author finfanterodal
 */
public class Boletin1_3 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in); 
        float tcambio, euros, dollar;
        //Pedimos datos.
        System.out.println("Introduce la cantidad en euros: ");
            euros=leer.nextFloat();
        System.out.println("Introduce la tasa de cambio: ");
            tcambio=leer.nextFloat();
        //Hacemos el cálculo de tasa de cambio por la cantidad de euros.
        dollar=tcambio*euros;
        //Visualizamos el cambio.
        System.out.println("Esta cantidad de euros: "+euros+" €, equivale a: "+dollar+" $.");
        
        
        
    }
    
}
