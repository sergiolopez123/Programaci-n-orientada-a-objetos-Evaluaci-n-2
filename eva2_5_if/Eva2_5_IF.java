/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Capturar temperatura
        int temp;
        Scanner scan = new Scanner(System.in);
        //Captura temperatura
        System.out.println("Temperatura (°C): ");
        temp = scan.nextInt();
        //vamos a evaluar
        // si la temperatura es mayor a 22°, se enciende el AC
        if (temp > 22){
            System.out.println("Encender el aire");
        }
    }
    
}
