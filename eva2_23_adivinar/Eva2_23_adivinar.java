/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_23_adivinar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
    int num = 5; //numero que tiene que adivinar (entre 1 -10)
    int valor; //valor que almaceoar para que capture la adivinacion
   do{
System.out.println("cual es el numero entre 1 y 10?");
valor = scan.nextInt();
}while(num != valor);
   System.out.println("adivinaste");
    }
  
}
