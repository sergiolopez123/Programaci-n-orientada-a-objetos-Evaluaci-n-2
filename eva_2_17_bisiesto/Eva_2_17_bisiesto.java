/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva_2_17_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce el año que quieras");
        año = scan.nextInt();
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
        System.out.println(año + " es un año biciesto");
        } else {
        System.out.println(año + " no es un año biciesto");
        }
    }
    
}
