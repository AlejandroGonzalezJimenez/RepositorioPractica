/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobucles17;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class Ejerciciobucles17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero, contador;
        System.out.println("Introduce un número entre 0 y 10:");
        numero = teclado.nextInt();
        if (numero<0 | numero>10)
            System.out.println("Número no válido");
        else {
            for (contador=0; contador<=10; contador++) {
                System.out.println(numero + " * " + contador + " = " + (numero*contador) );
            }
        }
    }
    
}
