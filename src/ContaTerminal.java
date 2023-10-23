import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Por favor, informe o número da agência: ");
        String agenciaCliente = scanner.next();
        

        System.out.print("Insira o número da conta: ");
        int numeroDaConta = scanner.nextInt();
        

        System.out.print("Insira seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Insira seu sobrenome: ");
        String sobrenomeCliente = scanner.next();
        
        
        System.out.print("Insira seu saldo: ");
        double saldoCliente = scanner.nextDouble();
        
        scanner.close();

        String mensagemParaCliente = 
        "Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaCliente +", conta " + numeroDaConta+ " e seu saldo de R$" + saldoCliente + " já está disponível para saque";
        
        System.out.println(mensagemParaCliente);

    }
}
