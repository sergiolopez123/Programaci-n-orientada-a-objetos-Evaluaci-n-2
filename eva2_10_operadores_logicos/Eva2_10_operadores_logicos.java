/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_10_operadores_logicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda;
        moneda = Math.random();
        boolean prediccion;
        Scanner scan = new Scanner (System.in);
        System.out.println("¿Que crees que caera la moneda? sello (true) o aguila (false)");
        prediccion = scan.nextBoolean();
        System.out.println("el valor de moneda = " + moneda);
        //0.5 es la mitad del rango, > 0.5 sello, menor aguila
        if(moneda >.5 && prediccion == true){
            System.out.println("Adivinaste es sello");
        } else 
            if (moneda <= 0.5 && prediccion == false)
                System.out.println("Adivinaste, es aguila");
            else System.out.println("perdiste.");
    }
    
}
