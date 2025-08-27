package Programacion2.clase2;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese valor");
            int valor = sc.nextInt();
            if (i > 4) {
                acumulador+=valor;
            }
        }
        System.out.println(acumulador);
    }
}
