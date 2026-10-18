import java.util.Scanner;
//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
// a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
// números menores que o primeiro número devem ser ignorados

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número inicial: ");
        int number1 = scanner.nextInt();
        int n = 0;
        while(true){
            System.out.println("Digite o valor para dividir: ");
            n = scanner.nextInt();
            if (n < number1) {
                continue;
                //usar o continue para saltar para fora do if foi a melhor coisa
            }else if(n % number1 !=0 ){
                //Tinha esquecido completamente que poderia usar o break e isso salvou
                break;
            }
            System.out.println("Divisão com resto 0");
        }
        System.out.println("Divisão com resto " + (n % number1));
        System.out.println("Encerrando o programa...");

        scanner.close();
    }
}
