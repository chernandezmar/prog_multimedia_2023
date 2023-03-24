/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_multimedia_2023;
import java.util.HashMap;
import java.util.Scanner;


public class Prog_multimedia_2023 {
    
    public static void main(String[] args) {
        System.out.println("----------------ARRAY------------------------");
        int array[] = {1,2,3,4,5,6,7,8,9,10,100,34,56,78};
        System.out.println(array[0] + " " + array[5]);
        for(int i=0; i< array.length; i++) {
            System.out.println(i + "->" + array[i]);
        }
        System.out.println(array.length);
        
        
        System.out.println("----------------ARRAY Palabras------------------------");
        
        String arrayS[] = {"hola", "mundo", "como", "estas"};
        System.out.println(arrayS[0] + " " + arrayS[1]);
        
        
        
        System.out.println("----------------MATRIZ------------------------");
        
        int matriz[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        /*
        1  2  3  4
        5  6  7  8
        9  10 11 12
             */
        System.out.println(matriz[2][3]);
        
        for(int y=0; y< matriz.length; y++) {
            for(int x=0; x<matriz[y].length; x++) {
                System.out.print(matriz[y][x] + " ");            
            }
            System.out.print("\n");
        }
       
        System.out.println(matriz.length);
        
        System.out.println("----------------HASH------------------------");
        
        HashMap<Integer, String> ProductoInfo = new HashMap<>();

        ProductoInfo.put(1, "Zapatos de Cuero");
        ProductoInfo.put(2, "Casacas Cortaviento");
        ProductoInfo.put(3, "Zapatillas Running");
        ProductoInfo.put(56, "Gorra");
        
        System.out.println(ProductoInfo);
        
        System.out.println(ProductoInfo.get(56));
        
        
    }

}
