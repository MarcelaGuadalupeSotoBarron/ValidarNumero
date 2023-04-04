/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validarnumero;

/**
 *
 * @author Mache
 */
import java.util.Scanner;

public class ValidarNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Ingrese el primer número:");
        numero1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        numero2 = sc.nextInt();
        
        if(numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
            // Aquí se pueden realizar acciones adicionales si se desea
        } else {
            System.out.println("El segundo número es mayor o igual que el primero.");
            // Aquí se pueden realizar acciones adicionales si se desea
        }
    }
}
