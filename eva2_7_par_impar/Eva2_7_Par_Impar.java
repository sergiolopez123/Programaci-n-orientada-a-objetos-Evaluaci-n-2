/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_7_Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N1, divi, resi;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un numero;");
        N1 = scan.nextInt();
        divi = N1 / 2;
        System.out.println("division entera de " + N1 + " / 2 = " + divi);
        resi = N1 % 2;
        System.out.println("el residuo de " + N1 + " % 2 = " + resi);
        if (resi == 0){
        System.out.println(N1 + " es par");
        } else 
            System.out.println(N1 + " es impar");
        }
    }
    

