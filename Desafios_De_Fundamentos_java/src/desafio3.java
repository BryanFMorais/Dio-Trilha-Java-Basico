import java.util.Scanner;
import java.util.Locale;
public class desafio3 {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    double a,b,MEDIA;

    //System.out.println("Digite a Primeira nota: ");
    a = scanner.nextDouble();

    //System.out.println("Digite a Segunda nota: ");
    b = scanner.nextDouble();

    MEDIA = (a *3.5+ b *7.5)/11 ;

    System.out.printf("MEDIA = %.5f",MEDIA);
    System.out.println();

    }
}
