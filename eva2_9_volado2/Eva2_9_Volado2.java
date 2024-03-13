/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_9_Volado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // pedir al usuario cara o cruz. si introduce un 1 es sello, si introduce un 2 = aguila
        double moneda;
        moneda = Math.random();
        boolean prediccion;
        Scanner scan = new Scanner (System.in);
        System.out.println("¿Que crees que caera la moneda? sello (true) o aguila (false)");
        prediccion = scan.nextBoolean();
        if(moneda < .5 && prediccion == true){
            System.out.println(moneda + " La moneda es sello," + " tu prediccion fue: " + prediccion + ", felicidades, acertaste!!");         
        }else if (moneda < .5 && prediccion == false){
        System.out.println(moneda + " La moneda es sello," + " tu prediccion fue: " + prediccion + ", Ufale, suerte para la proxima.");
        } else if (moneda > .5 && prediccion == false) {
        System.out.println(moneda + " La moneda es Aguila," + " tu prediccion fue: " + prediccion + ", felicidades, acertaste!!");    
        } 
        else {
       System.out.println(moneda + " La moneda es Aguila," + " tu prediccion fue: " + prediccion + ", Ufale, suerte para la proxima.");
        }
        
    }
    
}
