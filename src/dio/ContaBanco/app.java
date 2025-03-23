package dio.ContaBanco;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        contaTerminal conta = new contaTerminal();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Número da Conta: ");
        int numeroConta = scan.nextInt();
        conta.setNumeroConta(numeroConta);

        System.out.println("Informe a Agência: ");
        String agencia = scan.next();
        conta.setAgencia(agencia);

        scan.nextLine();

        System.out.println("Informe o Nome do Cliente: ");
        String nomeCliente = scan.nextLine();
        conta.setNomeCliente(nomeCliente);

        System.out.println("Informe o Saldo Inicial da Conta: ");
        double saldo = scan.nextDouble();
        conta.setSaldo(saldo);

        System.out.println("#----------------------------#");
        System.out.println("Conta Criada com Sucesso");


    }
}
