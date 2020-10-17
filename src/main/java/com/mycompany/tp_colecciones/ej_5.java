/*
5.Realice  una  búsqueda  secuencialen  un ArrayList<Integer>que  contenga50 elementos generadosaleatoriamente 
mediante la función java random. Realice una búsqueda secuencial de la siguiente forma: -se lee el valor que se desea 
buscar, -se compara la primera posición; -si son iguales, -fin de la búsqueda. -De   lo   contrario,   compararlo   con   
la   segunda   posición,   y   así sucesivamente. -Si se llega al final del arreglo y no se encontró el valor, debe indicarlo 
con un mensaje apropiado. -Si se encuentra, se debe especificar la posición que ese valor ocupa en la listapor primera vez.
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        llenarListaAleatoriamente(lista);
        imprimirLista(lista);
        System.out.println("\nIngrese un entero para buscarlo en la lista: ");
        Integer datoABuscar = sc.nextInt();
      
        busquedaSecuencial(lista, datoABuscar);
        
    }
    
    
    public static void llenarListaAleatoriamente(ArrayList<Integer> lista){
        for (int i=0 ; i<50 ; i++){
            lista.add((int)(Math.floor(Math.random()*100 + 1)));
        }
    } 
    
    public static void busquedaSecuencial(ArrayList<Integer> lista, Integer datoABuscar){
        boolean encontrado = false;
        
        for(Integer dato : lista){
            if(dato.equals(datoABuscar)){
                encontrado = true;
                System.out.println("Se encontro el numero " + datoABuscar + " en la posicion " + lista.indexOf(dato) + " de la lista.");
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró el numero en la lista.");
        }

    }
    
    public static void imprimirLista(ArrayList<Integer> lista){
        System.out.println("Lista:");
        lista.forEach(dato -> {
            System.out.print(dato + " ");
        });
    }
}
