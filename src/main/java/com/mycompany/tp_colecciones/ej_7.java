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
public class ej_7 {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        llenarMatriz(matriz.matrizCuadrada);
        matriz.imprimirMatriz();
        buscarValor(matriz);
       
    }
    
    public static void llenarMatriz(ArrayList<celda>matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Se le solicita ingresar fila, columna y valor, para finalizar la carga ingrese \"FIN\" en valor: ");
        do {            
            System.out.println("Ingrese fila: ");
            int fila = sc.nextInt();
            System.out.println("Ingrese columna: ");
            int columna = sc.nextInt();
            System.out.println("Ingrese valor: ");
            String valor = sc.next();
            if(valor.equals("FIN")){
                break;
            }
            celda celda = new celda(fila, columna, valor);
            matriz.add(celda);
        } while (true);
    }
    
    public static void buscarValor(Matriz matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese fila a buscar: ");
        int fila = sc.nextInt();
        System.out.println("Ingrese columna a buscar: ");
        int columna = sc.nextInt();
        
        matriz.getValor(fila, columna);
    }
}
