import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int numero;
    String nomeCliente,agencia;
    boolean saldo;

    System.out.println("Digite Seu Nome: ");
    nomeCliente = scanner.next();

    System.out.println("Bom Dia senhor(a) "+nomeCliente+" E um Prazer Ver o Senhor(a) Por Aqui. Primeiramente Poderia Nos Dizer o Numero de Sua Agencia?");
    System.out.println("Digite o Numero de Sua Agencia sem o ultimo digito: ");
    agencia = scanner.next();

    System.out.println("Perfeito Senhor(a) "+nomeCliente+" Agora Poderia Nos dizer Quantos R$ o Senhor(a) está transferindo? ");
    System.out.println("Digite aqui o valor: ");
    saldo = scanner.nextBoolean();

    System.out.println("Otimo. Fico feliz que tenha Confiado BrauBanks para isso.");
    System.out.println("Agora o Senhor(a) Poderia me dizer 3 numeros de sua preferencia por favor: ");
    System.out.println("Digite o numero da conta: ");
    numero = scanner.nextInt();

    System.out.println("Otimo senhor(a) "+nomeCliente+" Agora aguarde só um momento enquanto criamos sua conta.");
    System.out.println("...............");
    System.out.println("...............");
    System.out.println("...............");
    System.out.println("...............");
    System.out.println("...............");
    System.out.println("...............");

    System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta no BrauBanks, sua agência é "+agencia+"-2, conta "+numero+", e seu saldo "+saldo+" já está disponivel para saque.");
    }
}
