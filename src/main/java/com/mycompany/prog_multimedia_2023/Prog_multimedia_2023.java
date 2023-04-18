package com.mycompany.prog_multimedia_2023;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog_multimedia_2023 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero = 10;
       int resultado = 0;
       do {
            imprime_menu();
            System.out.print("Ingrese la opcion deseada2: ");
            numero = sc.nextInt();  
            if (numero == 1 ) {
                resultado=suma_numeros();
                System.out.println("el resultado de la suma es:"+ resultado);
            } 
            if (numero == 2 ) {
                fibonacci();
            } 
       } while (numero > 0);
       
       
       
      
    }

    private static void imprime_menu() {
        System.out.println( "*******************************************");
        System.out.println( "****************** MENU ******************");
        System.out.println( "1.- Suma de de numeros");
        System.out.println( "2.- Obtener Serie Fibonacci");
        System.out.println( "3.- Calcular Mayor, Menor, Avg de numeros");
        System.out.println( "*******************************************");
    }
    
    private static int suma_numeros() {
        Scanner sc = new Scanner(System.in); //inicializo el lector de teclado con la clase Scanner (solo copialo)
        int numLeido = 1;
        int i=0;
        //int suma = 0;
        int suma2 = 0;
        do { 
            System.out.print("Ingrese un número entero: ");
            numLeido = sc.nextInt(); //Leo del teclado lo que escriba y lo guardo como un entero en la variable
            suma2=suma2 + numLeido;  
            i++;
        } while (i < 5);
        return suma2;
    }
    
    private static void fibonacci() {
        int maxFibo;
        int i1=0, i2=0, sum=0;
        //int fibo[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //el problema aqui es que no es posible asignar un tamaño variable en este tipo de declaracion
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("dame el tamaño de fibinacci que deseas:");
        maxFibo=sc.nextInt();
        
        for (int i=0; i < maxFibo; i++) {
            if (i<2) {
                fibo.add(1);
            }
            else {
                i1= fibo.get(i-1);
                i2=fibo.get(i-2);
                sum=i1+i2;
                fibo.add(sum);
            }
        }
        System.out.println(fibo.toString());
    }
    
}

