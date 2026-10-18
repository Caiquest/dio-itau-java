import java.util.Scanner;
//Escreva um código onde o usuário entra com sua altura e peso,
// seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
//Se for menor ou igual a 18,5 "Abaixo do peso";
//se for entre 18,6 e 24,9 "Peso ideal";
//Se for entre 25,0 e 29,9 "Levemente acima do peso";
//Se for entre 30,0 e 34,9 "Obesidade Grau I";
//Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
//Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double height = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        double weight = scanner.nextDouble();

        double imc = weight/(height * height);
        System.out.printf("Seu calculo de IMC resultou em %.2f%n", imc);

        if (imc <= 18.5)System.out.println("Abaixo do peso");
        else if (imc < 25)System.out.println("Peso ideal");
        else if (imc < 30)System.out.println("Levemente acima do peso");
        else if (imc < 35)System.out.println("Obesidade Grau I");
        else if (imc < 40)System.out.println("Obesidade Grau II (Severa)");
        else System.out.println("Obesidade III (Mórbida)");

        scanner.close();
    }
}
