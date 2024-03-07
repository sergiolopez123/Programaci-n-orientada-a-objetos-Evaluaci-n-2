/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_4_Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Piezas;
        int CalcularSaldo;
        Scanner scan = new Scanner(System.in);
        System.out.println("cuantas piezas va a querer?");
        Piezas = scan.nextInt();
        if(Piezas > 1000)
            CalcularSaldo = Piezas * 500;
        else CalcularSaldo = Piezas * 800;
         System.out.println("El saldo es:" + CalcularSaldo); 
    }
    
}
