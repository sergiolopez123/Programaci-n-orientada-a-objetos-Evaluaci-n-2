/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva_2_20_for_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje;
        int veces;
        Scanner scan = new Scanner(System.in);
        System.out.println("dime un mensaje");
        mensaje = scan.nextLine();
        System.out.println("Cuantas veces va a querer que lo repita?");
        veces = scan.nextInt();
        for(int i = 1; i <= veces; i++){
            System.out.println(mensaje);
        }
        int numero, sumatoria;
        sumatoria = 0;
        System.out.println("introduce un numero entero");
        numero = scan.nextInt();
        for(int i = 1; i <= numero; i++){
        System.out.print(i);
        sumatoria += i;
        if(i < numero){
            System.out.print(" + ");
        }
        }
        System.out.println(" = " + sumatoria);
        int num;
        System.out.println("introduce el numero de veces que quieres que se repita la secuencia");
        num = scan.nextInt();
        for(int i = 1; i <= num; i++){
        for(int j = 1; j <= i; j++){
        System.out.print("*");
        } System.out.println("");
        }
         for(int i = num; i >= 1; i--){
        for(int j = i; j >= 1; j--){
        System.out.print("*");
        } System.out.println("");
        }
    }
    
}
