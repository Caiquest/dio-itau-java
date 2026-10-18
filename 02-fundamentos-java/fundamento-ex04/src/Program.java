import java.util.Scanner;

/*
Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença na tela
 */
public class Program {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Digite o nome da primeira pessoa: ");
        String name1 = scanner.next();
        System.out.print("Digite a idade da primeira pessoa: ");
        int age1 = scanner.nextInt();
        System.out.print("Digite o nome da segunda pessoa: ");
        String name2 = scanner.next();
        System.out.print("Digite a idade da segunda pessoa: ");
        int age2 = scanner.nextInt();

        //Como não posso utilizar if ainda, utilizei o metodo Math.abs para usar o valor absoluto para os numeros que forem dar negativo
        int diference = Math.abs(age1 - age2);

        System.out.printf("A diferença de idade é de %d anos\n", diference);

    }
}
