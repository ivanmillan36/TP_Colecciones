/*
    2.Codifiqueuna aplicación que: a) lea 20 números decimales ingresados por teclado por el usuario y los coloque 
en un ArrayList<Double>. b) determine y muestre el mayor de los números en el arreglo c)  determine  y  muestre  
el  menor  de  los  números  del  arreglocalcule  y muestre  el  rango  (diferencia  entre  el  mayor  y  el  menor) 
de  los elementos en el arreglo
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author ivanmillan36
 */
public class ej_2 {
    public static void main(String[] args) {
        ArrayList<Double> lista = getArrayList(20);
        Double mayor=0d, menor=0d;
        
        mayor = getMayorLista(lista);
        menor = getMenorLista(lista);
            
        
        System.out.println("El mayor elemento de la lista es: " + mayor);
        System.out.println("El menor elemento de la lista es: " + menor);
        System.out.println("El rango es: " + (mayor - menor));
        
        
    }
    
    public static ArrayList<Double> getArrayList(int cant_datos){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList();
        for (int i=0 ; i<cant_datos ; i++){
            System.out.println("Ingrese un numero para la posicion " + i + " de la lista: ");
            lista.add(sc.nextDouble());
        }
        return lista;
    }
    
    public static Double getMayorLista(ArrayList<Double> lista){
        Double mayor = (double)0;
        
        for (Double dato : lista){
            if(dato > mayor){
                mayor = dato;
            }
        }
        
        return mayor;
    }
    
    public static Double getMenorLista(ArrayList<Double> lista){
        Double menor = lista.get(0);
        
        for (Double dato : lista){
            if(dato < menor){
                menor = dato;
            }
        }
        
        return menor;
    }
    
}
