import java.util.Scanner;
//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número
public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println( number + " X " + i + " = " + result);
        }
        scanner.close();
    }
}
