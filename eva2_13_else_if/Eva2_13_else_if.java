/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_13_else_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce el dia de la semana en numero (1 - 7)");
        dia = scan.nextInt();
        if (dia == 1){
        System.out.println("Domingo");
        } else if (dia == 2){
        System.out.println("Lunes");
        }else if (dia == 3){
        System.out.println("martes");
        }else if (dia == 4){
        System.out.println("miercoles");
        }else if (dia == 5){
        System.out.println("juegves");
        }else if (dia == 6){
        System.out.println("Viernes");
        }else if (dia == 7){
        System.out.println("Sabado");
        }
        else {
        System.out.println("numero invalido");
        }
    }
    
}
