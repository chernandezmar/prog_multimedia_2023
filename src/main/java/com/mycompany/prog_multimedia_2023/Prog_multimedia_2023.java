package com.mycompany.prog_multimedia_2023;
//import java.util.ArrayList;
//import java.util.Scanner;

//import java.io.BufferedReader; 
import java.io.FileWriter;//libreria para escribir en archivos
import java.io.FileReader;//Libreria para leer archivos
import java.io.IOException;
//import java.util.Arrays;


public class Prog_multimedia_2023 {
    public static void main(String[] args) {
      String archivo = "C:\\prog_multimedia_2023\\prog_multimedia_2023\\prueba_escritura.txt";
      String texto="Esta linea fue escrita en el programa de java";
      
      try {
         FileWriter escribeArchivo = new FileWriter(archivo,true);
         escribeArchivo.write(texto+"\n");
         escribeArchivo.write("Esta es otra linea\n");
         escribeArchivo.write(texto+"\n");
         escribeArchivo.write("*****************************************\n\n");
         escribeArchivo.close(); 
         System.out.println("Se escribio correctamente en el archivo");
         
      } catch (IOException e) {
          System.out.println("Error al escribir en el archivo: " + e.getMessage());
      }

    }
}