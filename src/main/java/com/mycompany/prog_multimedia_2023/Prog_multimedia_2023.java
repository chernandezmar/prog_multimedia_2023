/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_multimedia_2023;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Prog_multimedia_2023 {
    public static void main(String[] args) {
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
