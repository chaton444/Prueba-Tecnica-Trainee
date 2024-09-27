/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_trainner;

import java.util.Scanner;

/**
 *
 * @author chato
 */
public class Prueba_trainner {

    public static void main(String[] args) {
        boolean bandera=false;
        String continuar;
        String asientos[][]=new String[10][10];
        //cargar mapa
        for(int i=0; i<10;i++){
            for(int j=0;j<10;j++){
             asientos[i][j]="L";
            }
        }
       
        System.out.println("-----------------Bienvenido al sistema de Reservas---------------------");
         while(bandera!=true){
                mapa(asientos);
                System.out.println("Ingrese Fila y Asiento a reservar:");
                System.out.println("Fila(Entre 0 y 9):");
                Scanner scaner= new Scanner(System.in);
                int fila= scaner.nextInt();
                System.out.println("Columna(Entre 0 y 9):");
                int columna= scaner.nextInt();
                
                if(asientos[fila][columna].equals("L")){
                    asientos[fila][columna]="X";
                }else{
                    System.out.println("Estos asientos ya estan ocupados Elija otro");
                }
                System.out.println("Desea continuar 's' para si y 'n' para finalizar");
                continuar=scaner.next();
                bandera = !continuar.equals("s");
         
       
         }     
        
    }
    
public static void mapa(String[][] asientos) {
    // Imprimir la cabecera de las columnas
    System.out.print("    "); // Espacio para el índice de fila
    for (int k = 0; k < 10; k++) {
        System.out.print("[" + k + "] "); // Imprime los índices de columna
    }
    System.out.println(); // Salto de línea después de la cabecera

    // Imprimir la matriz de asientos
    for (int i = 0; i < 10; i++) {
        System.out.print("[" + i + "] "); // Imprime el índice de fila
        for (int j = 0; j < 10; j++) {
            System.out.print("[" + asientos[i][j] + "] "); // Imprime el estado del asiento
        }
        System.out.println(); // Salto de línea después de cada fila
    }
}


}