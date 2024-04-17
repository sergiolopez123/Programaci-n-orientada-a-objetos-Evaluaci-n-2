/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_26_break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vamos a generar un aceso por usuario y contraseña
        String usuario, pwd;
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        Scanner scan = new Scanner(System.in);
        //como es un control de acceso, debemos preguntar un numero indeterminado de veces
        //hasta que el usuario y la contraseña sean correctos.]
        while(true){
        System.out.println("usuario");
       usuario = scan.nextLine();
       System.out.println("contraseña");
       pwd = scan.nextLine();
       if (usuario.equals(USUARIO) && pwd.equals(PASSWORD))//usuario correcto
           break;
        }
        System.out.println("bienvenido al sistema");
    }
    
}
