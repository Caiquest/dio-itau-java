import java.util.Scanner;

//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar
// , com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
// incluindo os números informados e em ordem decrescente;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int number1 = scanner.nextInt();
        System.out.print("Digite o segundo número: (ATENÇÃO ELE DEVE SER MAIOR QUE O PRIMEIRO) ");
        int number2 = scanner.nextInt();

        while(number2 <= number1){
            System.out.println("Número inválido, o segundo número deve ser maior que o primeiro, digite novamente:");
            number2 = scanner.nextInt();
        }
        System.out.println("Deseja ver o intervalo de (PAR/IMPAR)? ");
        String option = scanner.next();

        while(!option.equalsIgnoreCase("PAR") && !option.equalsIgnoreCase("IMPAR")){
            System.out.println("Opção inválida, tente novamente: ");
            option = scanner.next();
        }

        if(option.equalsIgnoreCase("par")){
            for (int i = number2; i >= number1; i --){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }else {
            for (int i = number2; i >= number1; i--){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
        scanner.close();


    }
}
