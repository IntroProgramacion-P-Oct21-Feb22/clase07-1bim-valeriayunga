/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int limite = 3;
        int contador = 1;
        double suma_total = 0;
        
        double promedio_final;
        double calificacion;
        
        System.out.println("Ingrese las notas de los estudiantes de su "
                + "materia");
        
        while (contador <= limite){
            System.out.printf("Ingrese calificación número %d\n", contador);
            calificacion = entrada.nextDouble();
            suma_total = suma_total + calificacion;
            // contador
            contador = contador + 1;
        }
        
        promedio_final = suma_total/limite;
        System.out.printf("El promedio final es %f\n", promedio_final);
        
    }
}
