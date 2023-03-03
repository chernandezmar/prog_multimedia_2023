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
        int numLeido = 3;
        while (numLeido > 0) { /*esto es un bucle y el programa temrinara cuando el numero leido sea = 0*/
            System.out.print("Ingrese un número entero: ");
            numLeido = sc.nextInt();  //Leo del teclado lo que escriba y lo guardo como un entero en la variable
            System.out.print("el numero leido es:" + numLeido + " el mes elegido es: ");
            /*Apartir de aca creo condiciones para cada numero del 1 al 12*/
            if (numLeido==1) { System.out.println("Enero"); }
            else if (numLeido==2) { System.out.println("Febrero"); }
            else if (numLeido==3) { System.out.println("Marzo"); }
            else if (numLeido==4) { System.out.println("Abril"); }
            else if (numLeido==5) { System.out.println("Mayo"); }
            else if (numLeido==6) { System.out.println("Junio"); }
            else if (numLeido==7) { System.out.println("Julio"); }
            else if (numLeido==8) { System.out.println("Agosto"); }
            else if (numLeido==9) { System.out.println("Septiembre"); }
            else if (numLeido==10) { System.out.println("Octubre"); }
            else if (numLeido==11) { System.out.println("Noviembre"); }
            else if (numLeido==12) { System.out.println("Diciembre"); }
            else if (numLeido==0) { System.out.println("Salir"); } //Si presiono 0 se sale del bucle y termina el programa
            else { System.out.println("Error solo acepto del 1 al 12"); }
        }
    }
}
