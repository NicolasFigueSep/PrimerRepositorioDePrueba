/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioordenacionvector;

import java.util.Random;

/**
 *
 * @author Alumno Tarde
 */
public class Ejercicio2 {

    /**
     2. Realizar un programa que genere 20 números enteros
     * aleatorios entre 100 y 199 y los almacene en un array,
     * no deberá haber números repetidos.
     * El programa debe crear un nuevo array 
     * con los números primos que haya entre esos 20 números. 
     * Luego debe mostrar los dos arrays.
     */
    public static void main(String[] args) {
        int [] aleatorio = llenarAleatorios();
        int [] primos = llenarPrimos(aleatorio);
        mostrarVector(aleatorio);
        mostrarVector(primos);
    }
    /*
      Ternario que no mostrara los 0. Esta hecho solo para que no 
      enseñe todos los espacios vacios del vector de primos.
    */
    public static void mostrarVector(int []vector){
        for(int e : vector){            
            System.out.print(e!=0?(e+"\t"):("\t"));
        }
        System.out.println("");
    }
    public static int[] llenarAleatorios(){  
        Random rnd =  new Random();
        int[] aleatorio = new int[20];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i]= rnd.nextInt(100)+100;
        }
        //A lo bruto quitamos repetidos
        for (int i = 0; i <aleatorio.length; i++) {
            for (int j =i+1; j <aleatorio.length; j++) {
                if(aleatorio[i]==aleatorio[j]){
                    System.out.println("Compare " + aleatorio[i] + " y " + aleatorio[j] + " pos i " + i + " pos j " + j);
                    aleatorio[j] = rnd.nextInt(100) + 100;
                    System.out.println("y le di " + aleatorio[j]);
                    i=0;
                }
            }
        }
        return aleatorio;
    }
    public static int[] llenarPrimos(int [] aleatorios){
        int[] primos = new int[aleatorios.length];
        int j=0;
        for (int i = 0; i < aleatorios.length; i++) {
            if(comprobPrimo(aleatorios[i])){
                primos[j]=aleatorios[i];
                j++;
            }
        }
        
        return primos;
    }
    public static boolean comprobPrimo(int numero){
        boolean primo=true;
        for (int i = 2; i < numero; i++) {
           if(numero%i==0){
               primo=false;
           }         
        }
        return primo;
    }
}
