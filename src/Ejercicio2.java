import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double numero1;
        double numero2;

        Scanner save = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero1 = save.nextDouble();

        System.out.println("Introduce un número");
        numero2 = save.nextDouble();

        if(numero1 > numero2){
            System.out.println("El número " + numero1 + " Es el mayor");
        } else if (numero2 > numero1) {
            System.out.println("El número " + numero2 + " Es el mayor");
        }
        else {
            System.out.println("Los número son iguales");
        }
    }
}
