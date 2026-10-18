import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        /*
        Verificar se dois valores sao iguais (igualdade): ==
        Verificar se dois valores sao diferentes: =!
        Inverter um valor: ! - operador not
        Operador maior que x: >
        Operador ou: ||
        Operador E: &&
         */
        var scanner =  new Scanner(System.in);
        System.out.println("Quantos anos voce tem? ");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Voce pode dirigir? (%s)\n", canDrive);

    }

}
