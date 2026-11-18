import java.util.Scanner;
import java.util.Locale;

public class desafio2 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int a, b, SOMA;

        //System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();

        //System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        SOMA = a + b;

        System.out.println("SOMA = " + SOMA);


    }
}
