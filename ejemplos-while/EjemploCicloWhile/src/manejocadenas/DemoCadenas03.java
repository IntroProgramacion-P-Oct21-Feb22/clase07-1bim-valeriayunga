/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class DemoCadenas03 {
    public static void main(String[] args) {
        String pais = "Ecuador";
        String ciudad = "Loja";
        String fechaIndependencia = "18 de noviembre";
        String cadenaAcumuladora = "Datos Personales\n";
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, pais);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, ciudad);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, 
                fechaIndependencia);
        
        System.out.printf("%s", cadenaAcumuladora);
        
    }
}
