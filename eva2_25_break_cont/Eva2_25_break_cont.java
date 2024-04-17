/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_break_cont;

/**
 *
 * @author jairl
 */
public class Eva2_25_break_cont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i= 1; i <= 100; i++){
            int mod = i % 2;
            if(mod != 0){ //queremos los casos que sean pares. cuando se ejecuta interrumpe la iteracion actual.
                continue;}
        System.out.println(i);
        }
        System.out.println("break: >>>>>>>>>>>>>");
        for(int i = 0; i < 100; i++){
        System.out.println(i);
        if (i == 50 )break; //cuando se ejecuta detiene por completo el ciclo
        }
    }

}
