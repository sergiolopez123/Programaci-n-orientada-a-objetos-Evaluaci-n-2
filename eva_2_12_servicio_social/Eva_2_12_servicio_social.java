/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva_2_12_servicio_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos, semestre;
        Scanner scan = new Scanner(System.in);
        System.out.println("que semestre cursas?");
       semestre = scan.nextInt();
       System.out.println("cuantos creditos tienes?");
       creditos = scan.nextInt();
       //indicar si puede o no realir el serivicio social, ir en 6t0 semestre o superior
       //tener al menos 150 creditos
       if(creditos >= 150 && semestre >= 6){
       System.out.println("puedes hacer tu servicio social");
       }else {
       System.out.println("todavia no puedes hacer tu servicio!!");
       }
    }
    
}
