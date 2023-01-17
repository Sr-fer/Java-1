import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double numero1;
        double numero2;

        Scanner save = new Scanner(System.in);
            System.out.println("Introduce un número");
            numero1 = save.nextDouble();

            System.out.println("Introduce un número");
            numero2 = save.nextDouble();

        double multiplicacion = numero1 * numero2;
        double division = numero1/numero2;
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double modulo = numero1 % numero2;

        System.out.println("Multiplicación");
        System.out.println(multiplicacion);
        System.out.println("Division");
        System.out.println(division);
        System.out.println("Suma");
        System.out.println(suma);
        System.out.println("Resta");
        System.out.println(resta);
        System.out.println("Modulo");
        System.out.println(modulo);


    }
}