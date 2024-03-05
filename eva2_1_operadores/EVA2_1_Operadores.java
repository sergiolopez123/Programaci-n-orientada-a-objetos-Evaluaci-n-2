/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author jairl
 */
public class EVA2_1_Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //operadores aritmeticos
        // Suma +, resta -, multiplicacion *
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; //operador de suma +
        System.out.println("la suma es:");
        System.out.println(suma);
        boolean prueba = true;
        System.out.println("el valor de la prueba es: " + prueba);
        // multiplicacion *
        int multi;
        multi = num1 * num2;
        System.out.println("la multiplicacion es: " + multi);
        //division /
        int divi = 7 / 2;
        System.out.println("la division de 5 / 3 es:" + divi);
        double diviDouble = 7 / 2.0;
        System.out.println("la division (double) de 7 / 2 es: " + diviDouble);
        //Acumuladores
        // suma +=, resta -=, multiplicacion *=, division /=
        int sumatoria = 0;
        /*sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;   
        sumatoria = sumatoria + 80;*/
        sumatoria += 90; //agrego 90 a la sumatoria
        sumatoria += 80; //agrego 80 a la sumatoria
        sumatoria += 80; //agrego 80 a la sumatoria
        System.out.println("la sumatoria es: " + sumatoria);
        // sumatoria = sumatoria - 70;
        sumatoria -= 70;
        System.out.println("la sumatoria es: " + sumatoria);
        /*sumatoria /= 2;
        System.out.println("la sumatoria es: " + sumatoria);*/
        int multiAcum = 1; 
        multiAcum *= 100;
        System.out.println("multiacum = " + multiAcum);
        multiAcum *= 5;
        System.out.println("multiacum =  " + multiAcum);
             
    }
    
    
}
