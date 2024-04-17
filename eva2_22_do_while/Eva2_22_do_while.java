/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_do_while;

/**
 *
 * @author jairl
 */
public class Eva2_22_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 11;
        do {
        System.out.print(cont);
        cont ++;
        if(cont <= 10) {
        System.out.print(" - ");
        }
        }while(cont <= 10);
    }
    
}
