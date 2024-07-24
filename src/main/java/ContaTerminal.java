import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe e Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da CONTA: ");
            int Numero = scanner.nextInt();
        System.out.println("Digite o numero da AGENCIA: ");
            String Agencia = scanner.next();
        System.out.println("Digite seu NOME: ");
            String NomeCliente = scanner.next();
        System.out.println("Digite seu SALDO: ");
             Double Saldo = scanner.nextDouble();;
        //Exibir as mensagens para o nosso usuario
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        +  Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está diponivel para saque.");
        //Obter pela scanner os valores digitados no terminal
        scanner.close();
        //Exibir a mensagem conta criada
    }
}
