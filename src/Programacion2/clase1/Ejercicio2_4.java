package Programacion2.clase1;

import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nota 1:");
        int nota1 = sc.nextInt();

        System.out.println("Ingrese nota 2:");
        int nota2 = sc.nextInt();

        System.out.println("Ingrese nota 3:");
        int nota3 = sc.nextInt();

        double promedio = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("promedio = " + promedio);

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else {
            System.out.println("Regular");
        }
        sc.close();
    }
}
