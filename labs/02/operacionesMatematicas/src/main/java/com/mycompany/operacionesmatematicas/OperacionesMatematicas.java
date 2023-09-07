package com.mycompany.operacionesmatematicas;

import java.util.Scanner;

 /* @Valentina Cardenas
 */
public class OperacionesMatematicas {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        
        System.out.println("Ingrese el numero de filas");
        filas = leer.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = leer.nextInt();
        
        int[][] matrizA= new int [filas][columnas];
        int[][] matrizB= new int [filas][columnas];
        
        System.out.println("Ingrese los datos de la Matriz A: ");
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               System.out.println("Ingrese el dato en [" + i + "][" + j + "]:");
               matrizA[i][j]=leer.nextInt();
           } 
        }
        System.out.println("Ingrese los datos de la Matriz B: ");
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               System.out.println("Ingrese el dato en [" + i + "][" + j + "]:");
               matrizB[i][j]=leer.nextInt();
           } 
        }
         int[][] resultado= new int [filas][columnas];
         
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               resultado[i][j]=matrizA[i][j]+matrizB[i][j];
           }
        }
        System.out.println("Resultado de la suma: ");
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               resultado[i][j]=matrizA[i][j]+matrizB[i][j];
               System.out.println(resultado[i][j]+" ");
           }
           System.out.println();
        }
                
    }
    
}
