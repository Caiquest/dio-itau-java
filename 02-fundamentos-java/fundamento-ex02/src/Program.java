/*
Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela:
formula: área = lado * lado
 */

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado para calcular sua área: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f\n", area);

    }
}
