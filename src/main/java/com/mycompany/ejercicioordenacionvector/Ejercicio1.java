/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioordenacionvector;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class Ejercicio1 {

    /**
     *1. Escribir un programa Java que pida por teclado el número de elementos
     * que se van a introducir 
     * y posteriormente vaya pidiendo el valor de esos números enteros,
     * los almacene en un array, los ordene y los muestre por pantalla.
     */
    public static void main(String[] args) {
        int [] vector = new int [pedirDato("tamaño vector ")];
        int aux=0;
        for (int i = 0; i < vector.length; i++) {
            vector[i]=pedirDato("valor " + (i+1));
        }
        for (int i = 0; i <vector.length; i++) {
            for (int j = i+1; j<vector.length; j++) {
                if(vector[i]>vector[j]){
                    aux=vector[j];
                    vector[j]=vector[i];
                    vector[i]=aux;
                    //////////////PRUEBBABABABABBABABA
                }
            }
        }
        for(int e: vector){
            System.out.print(e+"\t");
        }
    }
    public static int pedirDato(String dato){
        Scanner entrada =  new Scanner(System.in);
        int respuesta;
        System.out.println("Introducir " + dato  + ": ");
        respuesta= entrada.nextInt();
        return respuesta;
    }
    
}
