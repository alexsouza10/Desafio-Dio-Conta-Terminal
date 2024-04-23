import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Conta();
    }

    public static void Conta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o nome da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente da Agência:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Agência:");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
