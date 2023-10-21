/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobucles20;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class Ejerciciobucles20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int base, exponente, contador;
        int resultado = 1;
        System.out.println("Introduce la base:");
        base = teclado.nextInt();
        System.out.println("Introduce el exponente:");
        exponente = teclado.nextInt();
        for (contador=1; contador<=exponente; contador++) {
            resultado = resultado*base;
        }
        System.out.println("El resultado es: " + resultado);
    }
    
}
