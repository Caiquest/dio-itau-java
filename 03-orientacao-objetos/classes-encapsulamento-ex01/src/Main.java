import java.util.Scanner;

/*
Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.


 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, vamos criar sua conta!");
        System.out.print("Digite o número da conta: ");
        int numberAccount = scanner.nextInt();
        System.out.print("Digite o valor de depósito inicial: ");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(numberAccount, initialBalance);

        int option;

        do {
            System.out.println("==============BEM-VINDO AO SISTEMA GERENCIAL DO BANCO==============");
            System.out.println("Escolha uma opção válida abaixo: ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque-Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Saque");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar Cheque Especial");
            System.out.println("0 - Encerrar o sistema");

            option = Integer.parseInt(scanner.next());
            switch (option) {
                case 1 -> System.out.printf("Saldo atual: R$%.2f%n", bankAccount.getBalance());
                case 2 -> System.out.printf("Limite do cheque-especial: R$%.2f%n", bankAccount.getOverDraft());
                case 3 -> {
                    System.out.print("Por favor, digite o valor a ser depositado: ");
                    double value = scanner.nextDouble();
                    if (bankAccount.depositAccount(value)) {
                        System.out.println("Depósito realizado com sucesso.");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                }
                case 4 -> {
                    System.out.print("Por favor, digite o valor a ser sacado: ");

                    double value = scanner.nextDouble();
                    if (bankAccount.withDraw(value)) {
                        System.out.printf("Saque realizado com sucesso, saldo atual: R$ %.2f%n", bankAccount.getBalance());
                    } else {
                        System.out.printf("Saque inválido, seu saldo atual não foi alterado: R$%.2f%n", bankAccount.getBalance());
                    }
                }
                case 5 -> {
                    System.out.println("Digite o valor do boleto a ser pago: ");
                    double value = scanner.nextDouble();
                    if (bankAccount.payBill(value)) {
                        System.out.printf("Boleto pago, saldo atual: R$%.2f%n", bankAccount.getBalance());
                    } else {
                        System.out.println("Ocorreu um erro na transação, tente novamente");
                    }
                }
                case 6 -> {
                    if (bankAccount.isUsingOverDraft()) {
                        System.out.printf("Você está usando o cheque-especial, valor: R$%.2f%n", Math.abs(bankAccount.getBalance()));
                    } else {
                        System.out.println("Você não está usando o cheque-especial");

                    }
                }
                case 0 -> {
                    System.out.println("Encerrando o sistema.");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida, tente novamente");
            }
        } while (true);
    }
}
