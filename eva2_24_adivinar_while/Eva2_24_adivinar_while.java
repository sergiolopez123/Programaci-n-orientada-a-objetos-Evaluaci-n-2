/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_24_adivinar_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 5; //numero que tiene que adivinar (entre 1 -10)
    int valor = 0; //valor que almaceoar para que capture la adivinacion
    Scanner scan = new Scanner(System.in);
    
    while(valor != num){
    System.out.println("adivina el numero entre 1 y 10");
    valor = scan.nextInt();
    } System.out.println("adivinaste!!");
    }
    
}
