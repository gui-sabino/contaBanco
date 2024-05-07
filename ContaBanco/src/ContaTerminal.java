import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o número da Conta: ");
        Scanner inputConta = new Scanner(System.in);
        int numeroConta = inputConta.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        Scanner inputAgencia = new Scanner(System.in);
        String numeroAgencia = inputAgencia.nextLine();
        System.out.println("Por favor, digite seu nome completo: ");
        Scanner inputNome = new Scanner(System.in);
        String nomeCompleto = inputNome.nextLine();
        double saldoInicial = 237.48;
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoInicial + " já está disponível para saque.");
    }
}
