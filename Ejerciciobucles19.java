/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobucles19;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class Ejerciciobucles19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero, contador;
        boolean resultado = false;
        for (contador=1; contador<=10; contador++) {
            System.out.println("Introduce el número " + contador + " :");
            numero = teclado.nextInt();
            if (numero<0 & resultado==false)
                resultado=true;
        }
        if (resultado==true)
            System.out.println("Se ha introducido un número negativo");
        else
            System.out.println("No se ha introducido un número negativo");
    }
    
}
