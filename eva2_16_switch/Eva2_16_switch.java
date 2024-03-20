/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_switch;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_16_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce el numero de mes: ");
        mes = scan.nextInt();
        switch(mes){
            case 1: 
            System.out.println("Enero");
            break; // break == termina el switch
            case 2: 
            System.out.println("Febrero");
            break;
            case 3: 
            System.out.println("Marzo");
            break;
            case 4: 
            System.out.println("Abrl");
            break;
            case 5: 
            System.out.println("Mayo");
            break;
            case 6: 
            System.out.println("Junio");
            break;
            case 7: 
            System.out.println("Julio");
            break;
            case 8: 
            System.out.println("Agosto");
            break;
            case 9: 
            System.out.println("Septiembre");
            break;
            case 10: 
            System.out.println("Octubre");
            break;
            case 11: 
            System.out.println("Noviembre");
            break;
            case 12: 
            System.out.println("Diciembre");
            break;
            default:
                System.out.println("numero de mes no valido");
        }
    }
    
}
