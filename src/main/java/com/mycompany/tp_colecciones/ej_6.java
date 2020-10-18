/*
 6.Codifiqueuna aplicación que solicite y cargue en una ArrayList<Integer>10 dígitos  enteros,  luego  cree 
dos  nuevas ArrayList<Integer>y  asigne  ala primeralos números ingresados por el usuario de forma ascendente y 
en la segundade   forma   descendente.   Muestre   las   2 listaspor   pantalla. Investigue como ordenar una Lista(List<>)
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        lista = getArrayList(10);
        imprimirLista(lista, "Lista original:");
        
        ArrayList<Integer> listaAscendente = new ArrayList();
        ArrayList<Integer> listaDescendente = new ArrayList();
        
        Comparador comparador = new Comparador();
        ComparadorDescendente comparador_descendente = new ComparadorDescendente();
        
        listaAscendente = (ArrayList<Integer>) lista.clone();
        listaDescendente = (ArrayList<Integer>) lista.clone();
        
        listaAscendente.sort(comparador);
        listaDescendente.sort(comparador_descendente);
        
        imprimirLista(listaAscendente, "Lista ordenada ascendente:");
        imprimirLista(listaDescendente, "Lista ordenada descendente");
        
    }
    
    
    public static ArrayList<Integer> getArrayList(int cant_datos){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();
        for (int i=0 ; i<cant_datos ; i++){
            System.out.println("Ingrese un numero para la posicion " + i + " de la lista: ");
            lista.add(sc.nextInt());
        }
        return lista;
    }
    
    public static void imprimirLista(ArrayList<Integer> lista, String mensaje){
        System.out.println("\n" + mensaje);
        lista.forEach(dato -> {
            System.out.print(dato + " ");
        });
    }
    
}




class Comparador implements Comparator<Integer>{

        @Override
        public int compare(Integer e1, Integer e2){
            return e1.compareTo(e2);
        }
}

class ComparadorDescendente implements Comparator<Integer>{

        @Override
        public int compare(Integer e1, Integer e2){
            return -e1.compareTo(e2);
        }
}
