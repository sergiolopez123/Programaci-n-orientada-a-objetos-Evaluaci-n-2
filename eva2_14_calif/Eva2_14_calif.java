/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_14_calif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu calificacion (0 - 100)");
        calif = scan.nextInt();
        if (calif >= 90 && calif <= 100){
            System.out.println("A");
        }else if (calif >= 80 && calif <= 89){
        System.out.println("B");
        }else if (calif >= 70 && calif <= 79){
        System.out.println("c");
        }else if (calif >= 60 && calif <= 69){
        System.out.println("D");
        }else if (calif >= 0 && calif <= 59){
        System.out.println("F");
        } else {
        System.out.println("Calificacion no valida");
        }
    }
    
}
