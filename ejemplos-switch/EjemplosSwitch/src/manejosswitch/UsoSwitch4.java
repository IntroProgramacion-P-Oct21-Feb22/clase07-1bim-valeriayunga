/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch4 {
    
    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double radianes;
        double resultado;
        
        resultado = 0;
        System.out.println("Ingrese la opción trigonométrica.\n"
                + "1 seno\n"
                + "2 coseno\n"
                + "3 tangente");
        opcion = entrada.nextInt();
        
        System.out.println("Ingrese el valor en radianes");
        radianes = entrada.nextDouble();
        
        switch(opcion){
            case 1:
                resultado = Math.sin(radianes);
                break;
                
            case 2:
                resultado = Math.cos(radianes);
                break;
            
            case 3:
                resultado = Math.tan(radianes);
                break;
                
            default:
                System.out.println("ninguna de las opciones anteriores es "
                        + "correcta");
                break;
        }
        
       System.out.printf("El resultado de la operación es %.2f\n", resultado); 
    }
}
