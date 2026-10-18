import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        /*
        operador ^ é o contrario do &, retorna 0 se for igual e 1 se for diferente.
        operador & retorna 1 se for igual e 0  se for diferente
        operador | retorna 1 se um dos dois numeros comparados for 1
        operador ~ transforma a representação binaria ao contrario 100 ficaria 011
        operador << desloca o numero binario para esquerda
        operador >> desloca o numero para a direita
         */
        var scanner = new Scanner(System.in);
        var value1 = 4;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operacao %s (representação binaria %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value2, binary2);
        var result = value1 & value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (representacao binaria %s)\n", value1, value2, result, binaryResult);

    }
    /*

     */

}
