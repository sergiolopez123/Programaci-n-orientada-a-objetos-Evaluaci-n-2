/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author jairl
 */
public class Eva2_11_operadores_logicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean haydinero, haybuenclima;
        //para hacer la carne asada se necesita: que haya dinero y que haya buen clima
        haydinero = false;
        haybuenclima = false;
        System.out.println("1. no hay dinero y no hay buen clima");
        if(haydinero == true && haybuenclima == true){
            System.out.println("se puede hacer la carne asada.");
        } else {
        System.out.println("Buevito");
        }
        haydinero = false;
        haybuenclima = true;
        System.out.println("2. no hay dinero pero hay buen clima");
        if(haydinero == true && haybuenclima == true){
            System.out.println("se puede hacer la carne asada.");
        } else {
        System.out.println("Buevito");
        }
        haydinero = true;
        haybuenclima = false;
        System.out.println("3. hay dinero pero no hay buen clima");
        if(haydinero == true && haybuenclima == true){
            System.out.println("se puede hacer la carne asada.");
        } else {
        System.out.println("Buevito");
        }
        haydinero = true;
        haybuenclima = true;
        System.out.println("4. hay dinero y hay buen clima");
        if(haydinero == true && haybuenclima == true){
            System.out.println("se puede hacer la carne asada.");
        } else {
        System.out.println("Buevito");
        }
    }
    
}
