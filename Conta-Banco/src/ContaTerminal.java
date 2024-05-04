import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu numero da conta");
    String conta = scanner.next();

    System.out.println("digite sua sua agencia");
    String agencia = scanner.next();

    System.out.println("Nome do cliente");
    String nomeCliente = scanner.next();

    System.out.println("digite seu saldo");
    double saldo = 237.48;

    
    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " 
    + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
