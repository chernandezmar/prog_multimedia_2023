/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_multimedia_2023;
import java.util.Scanner;

/**
 *
 * @author khemtz
 */
public class Prog_multimedia_2023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //inicializo el lector de teclado con la clase Scanner (solo copialo)
        int numLeido = 1;
        int i=0;
        int suma = 0;
        int suma2 = 0;
        do { /*esto es un bucle y el programa temrinara cuando el numero leido sea = 0*/
            System.out.print("Ingrese un número entero: ");
            numLeido = sc.nextInt(); //Leo del teclado lo que escriba y lo guardo como un entero en la variable
            suma += numLeido;
            //esta linea es el mismo valor que la anterior:
            //suma = suma + numLeido;
            suma2=suma2 + numLeido;  
            //i=i+1;
            //i+=1;
            i++;
        } while (i < 5);
        //while (numLeido > 0) //esta condicion es para que el programa entre en bucle mientras el usuario teclea numeros distintos de 0
       
        System.out.println("suma:" + suma );
        System.out.println("suma2:" + suma2 );
    }
}
