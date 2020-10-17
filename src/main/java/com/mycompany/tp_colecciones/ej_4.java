/*
 * 4.Codifiqueuna aplicaciónque   permita   almacenar   palabras   en   un ArrayList<String>hasta  que  se  
ingrese  la  palabra “salir”,  al  finalizar muestre por pantalla:a)Las palabras ingresadasb)Indicar cuálde las
palabrasingresadasposee máscaracteresc)Indicar si se ingresaron o no palabras igualeso repetidasd)Mostrar las palabras
repetidasingresadas y cuantas veces se repitióesa palabra
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_4 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        llenarListaConPalabras(lista);
        imprimirLista(lista);
        imprimirPalabrasMasGrandes(lista);
        palabrasRepetidas(lista);
        
    }
    
    public static void llenarListaConPalabras(ArrayList<String> lista){
        String palabra="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabras, para finalizar ingrese \"salir\".");
        do{
            lista.add(palabra);
            palabra = sc.nextLine();        
        }while(!palabra.equals("salir"));
    }
    
    public static void imprimirLista(ArrayList<String> lista){
        System.out.println("Lista:");
        lista.forEach(dato -> {
            System.out.print(dato + "  ");
        });
    }
    
    public static void imprimirPalabrasMasGrandes(ArrayList<String> lista){
        int mayor_tamaño = 0;
        for(String dato : lista){
            if(dato.length() > mayor_tamaño){
                mayor_tamaño = dato.length();
            }
        }
        System.out.println("\nPalabras mas largas: ");
        for(String dato : lista){
            if(dato.length() == mayor_tamaño){
                System.out.print(dato + "  ");
            }
        }
    }
    
    public static void palabrasRepetidas(ArrayList<String> lista){
        ArrayList<String> listaRepetidas = new ArrayList();
        
        for (String dato : lista){
            if(cantPalabrasIguales(lista, dato) > 1){
                listaRepetidas.add(dato);
            }
        }
        
        if(listaRepetidas.isEmpty()){
            System.out.println("\n\nNo se ingresaron palabras repetidas");
        }else{
            System.out.println("\n\nSe ingresaron palabras repetidas: ");
            do{
                int cant = cantPalabrasIguales(listaRepetidas, listaRepetidas.get(0));
                System.out.println(listaRepetidas.get(0) + " , se repite " + cant + " veces.");
                listaRepetidas.removeIf(palabra -> (palabra.equals(listaRepetidas.get(0))));
            }while(!listaRepetidas.isEmpty());
        }
    }
    
    public static int cantPalabrasIguales(ArrayList<String> lista , String palabra){
        int cant = 0;
        for(String dato : lista){
            if(dato.equals(palabra)){
                cant++;
            }
        }
        return cant;
    }
    
}
