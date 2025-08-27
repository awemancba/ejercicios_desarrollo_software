package Programacion2.clase1;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        int min = 999;
        int max = 1000;
        int numero = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(numero);

        if (numero < 10){
            System.out.println("El numero tiene una cifra");
        } else if (numero < 100) {
            System.out.println("El numero tiene dos cifras");
        } else if (numero < 1000) {
            System.out.println("El numero tiene 3 cifras");
        } else {
            System.out.println("El numero tiene 4 cifras");
        }
    }
}
