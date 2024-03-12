/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author jairl
 */
public class Eva2_8_volado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // numero aleatorio en java : valores entre 0 y 1.
        double moneda;
        moneda = Math.random();
        System.out.println("el valor de moneda = " + moneda);
        if (moneda < .5){
        System.out.println("Sello"); 
        } else 
            System.out.println("Aguila");
        }
    }
    

