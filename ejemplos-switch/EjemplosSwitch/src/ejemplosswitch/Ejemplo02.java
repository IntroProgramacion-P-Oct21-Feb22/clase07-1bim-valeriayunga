/*
* Realizar una miniespecificación que permita seleccionar el tipo de
* operación aritemética (+,-,*) a realizar para dos valores ingresados por teclado
* Realizar la operación y presentar el resultado en pantalla
*/
package ejemplosswitch;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2.  op, i[0,n]
        int op;
        // 3.  valor1, i[0,n]
        int valor1;
        // 4.  valor2, i[0,n]
        int valor2;
        // 5.  resultado, i[-n, n]
        int resultado = 0;
        
        String tipo = "";
        // 6.  Escribir "Ingrese el primer valor la operación"
        System.out.println("Ingrese el primer valor la operación");
        // 7.  Leer valor1
        valor1 = entrada.nextInt();
        // 8.  Escribir "Ingrese el segundo valor la operación"
        System.out.println("Ingrese el segundo valor la operación");
        // 9.  Leer valor2
        valor2 = entrada.nextInt();
                        
        // 10. Escribir "Selecciones la operación que desea realizar"
        // 11. Escribir "Ingrese 1 para sumar"
        // 12. Escribir "Ingrese 2 para restar"
        // 13. Escribir "Ingrese 3 para multiplicar"
        System.out.println("Selecciones la operación que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar");
        op = entrada.nextInt();
        
        switch(op){
            // Opcion 1 // si op es igual a 1; se realiza las instrucciones
            // 17.      resultado <-- valor1 + valor2
            // 18.   Fin
            case 1:
                resultado = valor1 + valor2;
                tipo = "suma";
                break;
            
            case 2:
                resultado = valor1 - valor2;
                tipo = "resta";
                break;
                
            case 3:
                resultado = valor1 * valor2;
                tipo = "multiplicación";
                break;
                
            default:
                System.out.println("Operación incorrecta");
                break;
             
        }
        // 30. Escribir "El resultado de la operación " + tipo + "es :" + resultado
        System.out.printf("El resultado de la operación %s es: %d\n", 
                tipo,
                resultado);
    }
}
