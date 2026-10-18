import java.util.Scanner;

/*
Escreva um código que receba a base e a altura de um retangulo, calcule sua área e exiba na tela
formula: area = base * altura
 */
public class Program {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite o valor da altura do retangulo: ");
        double height = scanner.nextDouble();

        double area = base * height;

        System.out.printf("O valor da area do retangulo é %.2f\n", area);

    }
}
