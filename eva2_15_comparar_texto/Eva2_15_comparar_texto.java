/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_15_comparar_texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //comparar texto en java
        String dia;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un dia de la semna (lunes, martes, etc.");
        dia = scan.nextLine();
        if (dia.contains("domingo")){
        System.out.println("1");
        } else if(dia.contains("lunes")) {
        System.out.println("2");
        }else if(dia.contains("martes")) {
        System.out.println("3");
        }else if(dia.contains("miercoles")) {
        System.out.println("4");
        }else if(dia.contains("jueves")) {
        System.out.println("5");
        }else if(dia.contains("viernes")) {
        System.out.println("6");
        }else if(dia.contains("sabado")) {
        System.out.println("7");
        } else {
        System.out.println("dia no valido");
        }
    }
    
}
