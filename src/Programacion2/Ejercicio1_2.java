package Programacion2;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int numero1 = (int)(Math.random() * (max - min + 1) + min);
        int numero2 = (int)(Math.random() * (max - min + 1) + min);
        int numero3 = (int)(Math.random() * (max - min + 1) + min);

        System.out.println("v1:" + numero1 + " v2:" + numero2 + " v3:" + numero3);
        double promedio = (numero1 + numero2 + numero3) / 3.0;
        System.out.println("Promedio: " + promedio);

        if (promedio >= 5){
            System.out.println("El promedio es mayor o igual a 5");
        } else {
            System.out.println("El promedio es menor a 5");
        }
    }
}
