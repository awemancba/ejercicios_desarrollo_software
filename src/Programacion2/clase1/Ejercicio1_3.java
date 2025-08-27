package Programacion2.clase1;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int numero1 = (int) (Math.random() * (max - min + 1) + min);
        int numero2 = (int) (Math.random() * (max - min + 1) + min);
        int numero3 = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("numero 1 = " + numero1);
        System.out.println("numero 2 = " + numero2);
        System.out.println("numero 3 = " + numero3);

        if (numero1 < numero2) {
            if (numero1 < numero3) {
                System.out.println("El menor es " + numero1);
            } else {
                System.out.println("El menor es " + numero3);
            }
        } else {
            if (numero2 < numero3) {
                System.out.println("El menor es " + numero2);
            } else {
                System.out.println("El menor es " + numero3);
            }
        }
    }
}
