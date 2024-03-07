/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_3_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double calif;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce tu calificacion");
        calif = scan.nextDouble();
        if(calif >= 70){ //esta seccion --> true
            // {} opcionales, solo cuando tenemos mas de una instruccion
            System.out.println("Acreditaste");
        }
        else {
            System.out.println("suerte para la proxima");
        }
       
    }
    
}
