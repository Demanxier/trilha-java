import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da CONTA: ");
            int Numero = scanner.nextInt();
        System.out.println("Digite o numero da AGENCIA: ");
            String Agencia = scanner.next();
        System.out.println("Digite seu NOME: ");
            String NomeCliente = scanner.next();
        System.out.println("Digite seu SALDO: ");
             Double Saldo = scanner.nextDouble();;

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        +  Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está diponivel para saque.");

        scanner.close();

    }
}
