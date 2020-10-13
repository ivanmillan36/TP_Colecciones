/*
1.Creeun ArrayList<Integer>, que  permita asignar  los valores  numéricos manualmente  (los  que  tú  quieras)  
hasta  ingresar  un  valor  menor  a  0, mostrar los números por pantalla. Solicite los números mediante un bucle.
 */
package com.mycompany.tp_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Integer num;
        
        while(true){
            System.out.println("Ingrese un numero entero: ");
            num = sc.nextInt();
            if (num < 0){
                break;
            }
            lista.add(num);
        }
        
        System.out.println("Lista: ");
        lista.forEach(dato -> {
            System.out.print(dato + " , ");
        });
    }
}
