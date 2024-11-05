/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_clase_pr;

/**
 *
 * @author Martin Montes
 */
    public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Numeros primos entre 1 y 100:"); //Numero desde el 1 al 100/AMMM
        //Empieza desde el dos ya que es un numero primo y el uno no
        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
//Cuando son numeros primos
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
     //Cuando no es numero primo   
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}


