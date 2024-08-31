
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String agencia, nomeCliente;;
        int numero; 
        float saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero da sua agência:");
        agencia = scanner.next();

        System.out.print("Digite o número da sua conta:");
        numero = scanner.nextInt();
        
        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Digite seu saldo atual: ");
        saldo = scanner.nextFloat();

        System.out.print("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+",  conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        scanner.close();
    }
}
