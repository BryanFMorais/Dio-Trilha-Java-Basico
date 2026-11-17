import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
   public static void main(String[] args) {
       /*
       //os argumentos começam com indice 0
       String nome = args[0];
       String sobremome = args[1];
       int idade = Integer.valueOf(args[2]); //vamos falar sobre mais adiante
       double altura = Double.valueOf(args[3]);

       System.out.println("Meu nome é " + nome + " " + sobremome);
       System.out.println("Tenho " + idade + " anos");
       System.out.println("Minha altura é " + altura + " cm");

       //java aboutMe Bryan Fraga_morais 21 1.83
        */

       //criando o objeto scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("digite sua altura:");
       double altura = scanner.nextDouble();

       System.out.println("Digite seu nome:");
       String nome = scanner.next();

       System.out.println("Digite seu sobrenome:");
       String sobrenome = scanner.next();

       System.out.println("digite sua idade:");
       int idade = scanner.nextInt();

       //dados obtidos do usuario
       System.out.println("Meu nome é " + nome + " " + sobrenome);
       System.out.println("Tenho " + idade + " anos");
       System.out.println("Minha altura é " + altura + " cm");



    }
}
