package Programacion2.clase1;

import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado de un cuadrado:");
        int lado = sc.nextInt();

        int perimetro = lado * 4;

        System.out.println("El perimetro es: " + perimetro);
        sc.close();
    }
}
