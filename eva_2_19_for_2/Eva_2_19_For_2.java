/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva_2_19_For_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //preguntar: cantidad de estudiantes en el grupo
        int estudiantes;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("cuantos estudiantes tiene el grupo?");
        estudiantes = scan.nextInt();
        //hay que capturar todas las calificaciones:
        for(int i = 0; i <= estudiantes; i ++){
            //i = 0             5
            System.out.println("calificacion: ");
            int calificacion = scan.nextInt();
        }
    }
    
}
