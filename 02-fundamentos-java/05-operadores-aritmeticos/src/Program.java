import java.util.Scanner;

public class Program {
    /*
    Math.sqrt(calcular a raiz quadrada)
    Math.pow(potencia de valor - ex: value1, 2)
    ++ = Atribuição/Incremento
    -- = Decremento
     */
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        var value2 = scanner.nextInt();
        System.out.printf("%s + %s = %S\n", value1, value2, value1 + value2);
        System.out.printf("A raiz quadrada de %s é %s\n", value1 + value2, Math.sqrt(value1 + value2));
    }
}
