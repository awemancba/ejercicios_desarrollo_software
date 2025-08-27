package Programacion2.clase2;

import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        while (true) {
            System.out.println("Ingrese un valor entero");
            int valor = sc.nextInt();
            if (valor == 9999) {
                break;
            }
            acumulador += valor;
        }

        System.out.println(acumulador);
        if (acumulador < 0) {
            System.out.println("El valor es menor a 0");
        } else if (acumulador > 0) {
            System.out.println("El valor es mayor a 0");
        }else {
            System.out.println("El valor es 0");
        }
    }
}
