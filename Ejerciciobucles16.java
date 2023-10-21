/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobucles16;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class Ejerciciobucles16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int edad, contador;
        double altura;
        int sumaEdad = 0;
        double sumaAltura = 0;
        int alumnosAdultos = 0;
        int alumnosAltos = 0;
        for (contador=1; contador<=5; contador++) {
            System.out.println("Introduce la edad del alumno " + contador + ":");
            edad = teclado.nextInt();
            System.out.println("Introduce la altura en metros del alumno " + contador + ":");
            altura = teclado.nextDouble();
            sumaEdad = sumaEdad + edad;
            sumaAltura = sumaAltura + altura;
            if (edad>=18)
                alumnosAdultos = alumnosAdultos + 1;
            if (altura>1.75)
                alumnosAltos = alumnosAltos + 1;
        }
        System.out.printf("La edad media de los alumnos es %5.2f\n", (sumaEdad/5.0) );
        System.out.printf("La altura media de los alumnos es %5.2f\n", (sumaAltura/5.0) );
        System.out.println("El número de alumnos mayores de 18 años es de " + alumnosAdultos + 
        " y el número de alumnos de altura superior a 1.75 metros es de " + alumnosAltos);
    }
    
}
