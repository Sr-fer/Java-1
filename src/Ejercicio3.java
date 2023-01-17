import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        double numero3;

        Scanner save = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero1 = save.nextDouble();

        System.out.println("Introduce un número");
        numero2 = save.nextDouble();

        System.out.println("Introduce un número");
        numero3 = save.nextDouble();

        if((numero1 > numero2) && (numero2 > numero3)){
            System.out.println("El orden de los numeroes es " + numero1 + " " + numero2 + " " + numero3);
        } else if((numero1 > numero3) && (numero3 > numero2)){
            System.out.println("El orden correcto es " + numero1 + " " + numero3 + " " + numero2);
        } else if ((numero2 > numero1) && (numero1 > numero3)){
            System.out.println("El orden correcto es " + numero2 + " " + numero1 + " " + numero3);
        } else if ((numero2 > numero3) && (numero3 > numero1)){
            System.out.println("El orden correcto es " + numero2 + " " + numero3 + " " + numero1);
        } else if((numero3 > numero2) && (numero2 > numero1)){
            System.out.println("El orden correcto es " + numero3 + " " + numero2 + " " + numero1);
        } else{
            System.out.println("El orden correcto es " + numero3 + " " +numero1 + " " + numero2);
        }
}
}