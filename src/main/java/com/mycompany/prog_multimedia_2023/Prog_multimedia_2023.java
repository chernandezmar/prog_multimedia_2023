package com.mycompany.prog_multimedia_2023;
//import java.util.ArrayList;
//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Prog_multimedia_2023 {
    public static void main(String[] args) {
      String archivo = "C:\\prog_multimedia_2023\\prog_multimedia_2023\\calificaciones.txt";
      double suma=0;
      double promedio=0;
      try {
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        for (int i=0; i<5; i++){
            suma=0;
            String linea[] = lector.readLine().split(",");
            System.out.println(linea[0] + "***********************");
            for (int x=1; x<=3; x++) {
                String valor = linea[x];
                suma += Double.parseDouble(valor);
                System.out.print(valor + " " );
            }
            promedio = suma/3;
            System.out.println(","+ String.format("%.1f", promedio));
        }
        lector.close();
      } catch (IOException e) {
          System.out.println("Error al leer el archivo" + archivo );
      }
      
   
    }

}