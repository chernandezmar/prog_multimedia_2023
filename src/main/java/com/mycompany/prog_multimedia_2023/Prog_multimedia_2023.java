/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_multimedia_2023;
import java.util.Scanner;


public class Prog_multimedia_2023 {

    public static void main(String[] args) {
 /*       
- Pedira 10 numeros
- Solo pueden ser 1 al 20
- numMayor=0
- numMenor=21
- Suma=0
- numLeido
- contNumero=1
        
1.- Mostrar leyenda "Dame un numero:", numero que lea lo  guardare en una variable llamada numLeido
1a.- Validamos que numLeido < 21, si: continua,no: regresar al paso 1
2.- contNumero se incremente
3.- numLeido > numMayor? si: numMayor=numLeido, no: continua
4.- numLeido < numMenor? si: numMenor=numLeido, no: continua
5.- suma=suma+numLeido
6.- conNumero < 11? si: Imprime las variables, regresar al paso 1.*/


        int contNumero = 1;
        int numMayor = 0;
        int numMenor = 21;
        int suma = 0;
        int numLeido;
        Scanner sc = new Scanner(System.in);

        
        while (contNumero < 11) {
            System.out.print("Dame un número: ");
            numLeido = sc.nextInt();  
            if ((numLeido < 20) && (numLeido > 0)){
                contNumero++;
                if (numLeido > numMayor) {
                    numMayor = numLeido;
                }
                if (numLeido < numMenor) {
                    numMenor = numLeido;
                }
                suma = suma + numLeido;                        
            }  
            else {
                System.out.println("Error solo acepto numeros del 1 al 20");
            }
        }
        System.out.println("mayor=" + numMayor +" menor="+ numMenor +" suma="+ suma);
        
        
    }

}
