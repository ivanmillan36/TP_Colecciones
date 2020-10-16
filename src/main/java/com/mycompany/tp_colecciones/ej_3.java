/*
 3.Codifiqueuna   aplicación   para   almacenar en   un   ArrayList<Integer> aleatoriamente  20  números  enteros 
positivos  pares  del  1  al  100,  de  los cuales se desea saber:a) su promedio aritmético b) cuántos de los números 
son iguales al promedio aritmético c) cuántos de los números son mayores que el promedio aritmético d) cuántos de los
números son menores que el promedio aritmético
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ivanmillan36
 */
public class ej_3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        llenarListaAleatoriamente(lista);
        imprimirLista(lista);
        int promedio = calcularPromedioLista(lista);
        cantNumerosIgualesPromedio(lista, promedio);
        cantNumerosMayoresPromedio(lista, promedio);
        cantNumerosMenoresPromedio(lista, promedio);
        
    }
    
    public static void llenarListaAleatoriamente(ArrayList<Integer> lista){
        for (int i=0 ; i<20 ; i++){
            lista.add((int)(Math.floor(Math.random()*100 + 1)));
        }
    } 
    
    public static void imprimirLista(ArrayList<Integer> lista){
        System.out.println("Lista:");
        lista.forEach(dato -> {
            System.out.print(dato + " ");
        });
    }
    
    public static int calcularPromedioLista(ArrayList<Integer> lista){
        int sumatoria = 0;
        int promedio;
        
        for (Integer dato : lista){
            sumatoria += dato;
        }
        promedio = sumatoria/lista.size();
        System.out.println("\nEl promedio de la lista es: " + promedio);
        return promedio;
    }
    
    public static void cantNumerosMayoresPromedio(ArrayList<Integer> lista , int promedio){
        int cant = 0;
        for (Integer dato : lista){
            if(dato > promedio){
                cant++;
            }
        }
        
        System.out.println("\n Hay "+ cant + " numeros mayores al promedio");
    }
    
    public static void cantNumerosMenoresPromedio(ArrayList<Integer> lista , int promedio){
        int cant = 0;
        for (Integer dato : lista){
            if(dato < promedio){
                cant++;
            }
        }
        
        System.out.println("\n Hay "+ cant + " numeros menores al promedio");
    }
    
    public static void cantNumerosIgualesPromedio(ArrayList<Integer> lista , int promedio){
        int cant = 0;
        for (Integer dato : lista){
            if(dato == promedio){
                cant++;
            }
        }
        
        System.out.println("\n Hay "+ cant + " numeros iguales al promedio");
    }
    
}
