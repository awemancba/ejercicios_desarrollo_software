package Programacion2.clase1;

import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de hs trabajadas:");
        int hsTrabajadas = sc.nextInt();

        System.out.println("Ingrese pago por hora:");
        int pagoPorHora = sc.nextInt();

        int sueldoMensual = hsTrabajadas * pagoPorHora;
        System.out.println("El sueldo mensual es: " + sueldoMensual);

        sc.close();
    }
}
