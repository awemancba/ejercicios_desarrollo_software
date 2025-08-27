package Programacion2.clase1;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese precio del articulo:");
        int precio = sc.nextInt();

        System.out.println("Ingrese cantidad a llevar:");
        int cantidad = sc.nextInt();

        int pagoTotal = precio * cantidad;

        System.out.println("El total es: " + pagoTotal);

        sc.close();
    }

}
