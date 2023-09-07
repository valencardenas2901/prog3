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
         int[][] resultadoSuma= new int [filas][columnas];
         
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               resultadoSuma[i][j]=matrizA[i][j]+matrizB[i][j];
           }
        }
        System.out.println("Resultado de la suma: ");
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               System.out.println(resultadoSuma[i][j]+" ");
           }
           System.out.println();
        }
        
        int[][] ProductoMatrices= new int [filas][columnas];
       for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               ProductoMatrices[i][j]=matrizA[i][j]*matrizB[i][j];
           }
        } 
       System.out.println("Producto de matrices= ");
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               System.out.println(ProductoMatrices[i][j]+" ");
           }
           System.out.println();
        }
        
        int escalar=0;
       System.out.println("Ingrese el escalar");
        escalar = leer.nextInt();
       
        int[][] ProductoEscalarA= new int [filas][columnas];
        int[][] ProductoEscalarB= new int [filas][columnas];
       for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               ProductoEscalarA[i][j]=matrizA[i][j]*escalar;
               ProductoEscalarB[i][j]=matrizB[i][j]*escalar;
           }
        }
       System.out.println("Productos escalar A= ");
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               System.out.println(ProductoEscalarA[i][j]+" "); 
           }
           System.out.println();
        }
        System.out.println("Productos escalar B= ");
        for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               System.out.println(ProductoEscalarB[i][j]+" "); 
           }
           System.out.println();
        } 
       
    
    }
    
}
