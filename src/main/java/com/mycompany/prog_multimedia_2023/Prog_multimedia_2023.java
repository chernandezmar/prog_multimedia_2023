package com.mycompany.prog_multimedia_2023;
//import java.util.ArrayList;
//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Prog_multimedia_2023 {
    public static void main(String[] args) {
      String archivo = "C:\\prog_multimedia_2023\\prog_multimedia_2023\\sismos2.csv";
      String archivoSalida = "C:\\prog_multimedia_2023\\prog_multimedia_2023\\sismos_mayores_5.txt";
      
      
      Double SismoMayor=0.0;
      String Datos = "";
      
      try {
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        FileWriter escribeArchivo = new FileWriter(archivoSalida,false);
        
        for (int i=0; i<274643; i++) {
            String linea = lector.readLine();
            if (linea.contains("no calculable")) {
                //System.out.println("nop");
            } else {
                String ArrayLinea[] = linea.split(",");
                String valor = ArrayLinea[2];
                //System.out.println(i + " " + ArrayLinea[2]);
                Double magnitud =  Double.parseDouble(valor);
                if (magnitud > 6.5){
                    escribeArchivo.write(linea+"\n");
                }
                if (SismoMayor < magnitud) {
                    SismoMayor=magnitud;
                    Datos = linea;
                }
            }
            
        }
        escribeArchivo.close();
      } catch (IOException e) {
        System.out.println("Error al leer el archivo" + archivo );
        }
      
      System.out.println("El Mayor Sismo fue:" + Datos );
    }
}