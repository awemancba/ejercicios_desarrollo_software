package Programacion2.clase2;

import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int cantidad;

        System.out.println("Ingrese cantidad de numeros:");
        cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un numero entero");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println("Canidad pares: " + pares);
        System.out.println("Cantidad impares: " + impares);
    }
}
