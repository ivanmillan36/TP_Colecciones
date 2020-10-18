/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class Matriz {
    static ArrayList<celda> matrizCuadrada = new ArrayList<celda>();
      
    public static void imprimirMatriz(){
        System.out.println("\nDatos cargados en la matriz: ");
        for (celda celda: matrizCuadrada){
            System.out.println(celda.getValor() + " ");
        }
    }
    
    public static void getValor(int fila, int columna){
        boolean encontrado = false;
        for (celda celda: matrizCuadrada){
            if(celda.getFila() == fila && celda.getColumna() == columna){
                encontrado = true;
                System.out.println("El valor almacenado en la fila " + fila + " , columna " + columna + " es: " + celda.getValor());
            }
        }
        
        if (!encontrado){
            System.out.println("La fila y columna indicada no ha sido asignada");
        }
    }
}
