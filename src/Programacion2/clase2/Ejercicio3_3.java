package Programacion2.clase2;

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10: ");
        int numero = sc.nextInt();

        for (int i = 1; i < 13; i++) {
            int valor = i * numero;
            System.out.println("3 x " + i + " = " + valor);
        }
    }
}
