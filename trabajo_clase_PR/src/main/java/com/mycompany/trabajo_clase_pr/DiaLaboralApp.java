/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_clase_pr;

import java.util.Scanner;

/**
 *
 * @author Martin Montes
 */
public class DiaLaboralApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia;
        //Solicita al usuario el dia o si desea salir/AMMM
        while (true) {
            System.out.print("Ingrese un dia de la semana (o escriba 'salir' para terminar): ");
            dia = scanner.nextLine().trim().toLowerCase();
            //Para cerrar el programa
            if (dia.equals("salir")) {
                System.out.println("Programa terminado,gracias por elegirnos.");
                break;
            }
            //Validacion de dias laborales y no laborales
            switch (dia) {
                case "lunes", "martes", "miercoles", "jueves", "viernes" -> System.out.println(dia + " es un dia laboral.");
                case "sabado", "domingo" -> System.out.println(dia + " no es un dia laboral.");
                default -> System.out.println("Dia no valido. Por favor, ingrese un dia de la semana.");
            }
        }
        
        scanner.close();
    }
}

