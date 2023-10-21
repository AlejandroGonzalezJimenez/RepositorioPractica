/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobucles18;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class Ejerciciobucles18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double nota;
        int contador;
        int alumnosAprobados = 0;
        int alumnosSuspensos = 0;
        int alumnosCondicionados = 0;
        for (contador=1; contador<=6; contador++) {
            System.out.println("Introduce la nota del alumno " + contador + " :");
            nota = teclado.nextDouble();
            if (nota>=5 & nota<=10)
                alumnosAprobados = alumnosAprobados + 1;
            else if (nota<5 & nota>=4)
                alumnosCondicionados = alumnosCondicionados + 1;
            else if (nota<4 & nota>=0)
                alumnosSuspensos = alumnosSuspensos + 1;
            else
                System.out.println("Nota incorrecta");
        }
        System.out.println("El número de alumnos aprobados es de " + alumnosAprobados);
        System.out.println("El número de alumnos suspensos es de " + alumnosSuspensos);
        System.out.println("El número de alumnos condicionados es de " + alumnosCondicionados);
    }
    
}
