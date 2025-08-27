package Programacion2.clase2;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        System.out.println("Ingrese cantidad de alturas");
        double cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese altura");
            double altura = sc.nextDouble();
            suma +=altura;
        }
        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);

    }
}
