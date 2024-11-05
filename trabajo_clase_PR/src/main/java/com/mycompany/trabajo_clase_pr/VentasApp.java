/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo_clase_pr;

import java.util.Scanner;

/**
 *
 * @author Martin Montes
 */
public class VentasApp { //Solicita numero de ventas a introducir /AMMM
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de ventas a introducir: ");
        int numVentas = scanner.nextInt();
        
        double sumaVentas = 0;
        //Ingresa el monto total de las ventas
        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Ingrese el monto de la venta " + i + ": ");
            double venta = scanner.nextDouble();
            sumaVentas += venta;
        }
        //Suma el total de las ventas 
        System.out.println("La suma total de las ventas es: " + sumaVentas);
        scanner.close();
    }
}
