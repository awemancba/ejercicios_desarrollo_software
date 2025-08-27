package Programacion2.clase2;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prim = 0;
        int seg = 0;
        int tercer = 0;
        int cuarto = 0;

        System.out.println("Ingrese cantidad de puntos: ");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese valor en X: ");
            int x = sc.nextInt();
            System.out.println("Ingrese valor en Y: ");
            int y = sc.nextInt();

            if (x > 0 && y > 0) {
                prim++;
            } else if (x < 0 && y > 0) {
                seg++;
            } else if (x < 0 && y < 0) {
                tercer++;
            } else {
                cuarto++;
            }
        }
        System.out.println("prim = " + prim);
        System.out.println("seg = " + seg);
        System.out.println("tercer = " + tercer);
        System.out.println("cuarto = " + cuarto);
    }
}
