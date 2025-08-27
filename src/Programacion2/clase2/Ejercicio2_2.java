package Programacion2.clase2;

import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";
        double acreedores= 0;
        while (true) {
            System.out.println("Ingrese numero de cuenta: ");
            int numeroCuenta = sc.nextInt();

            if (numeroCuenta < 0) {
                break;
            }

            System.out.println("Ingrese saldo actual: ");
            double saldo = sc.nextDouble();

            if (saldo > 0) {
                estado = "Acreedor";
                acreedores += saldo;
            } else if (saldo < 0) {
                estado = "Deudor";
            } else{
                estado = "Nulo";
            }

            System.out.println("Numero Cuenta: " + numeroCuenta);
            System.out.println("Estado de cuenta: " + estado);
        }
        System.out.println("Suma total de acreedores: " + acreedores);
    }
}
