import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        double numero3;
        double suma1;
        double suma2 = 0;

        Scanner save = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero1 = save.nextDouble();

        System.out.println("Introduce un número");
        numero2 = save.nextDouble();

        System.out.println("Introduce un número");
        numero3 = save.nextDouble();

        for(int i = 0; i < numero3; i++){
            suma1 = numero1 + numero2;
            suma2 += suma1;
            System.out.println(suma2);
        }
    }
}
