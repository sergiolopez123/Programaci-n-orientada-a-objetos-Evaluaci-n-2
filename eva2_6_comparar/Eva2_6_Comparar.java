/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_6_Comparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cual es el mayor valor entre dos numeros
        //pidan al usuario 2 enteros
        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un valor: ");
        num1 = scan.nextInt();
        System.out.println("Introduce otro valor: ");
        num2= scan.nextInt();
        if (num1 > num2){
        System.out.println( num1 + " es mayor.");
        } else if (num1 == num2){
            System.out.println("son iguales");
        }else {
                System.out.println(num2 +  " es mayor.");
        }
            
    }
    
}
