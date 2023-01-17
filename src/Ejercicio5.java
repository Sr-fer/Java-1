import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String frase;

        Scanner save = new Scanner(System.in);
        System.out.println("Introduce una frase");
        frase = save.nextLine();


    for(char letra: frase.toCharArray()){
        if(letra == 'b' || letra == 'm' || letra == 'y'){
            System.out.println("Se ha encontrado la letra " + letra);
            break;
        }
    }
    }
}
