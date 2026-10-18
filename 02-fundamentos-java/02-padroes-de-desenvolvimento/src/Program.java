import java.util.*;

public class Program {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args){
        /*
        Primeiro programa com Scanner em java
        Testando nova forma de documentação com *
        Entendendo mais sobre a tipagem do java
        java tem variaveis estaticas
        Testando constantes em java
         */
        var sc = new Scanner(System.in);
        System.out.print(WELCOME_MESSAGE);
        var name = sc.nextLine();
        System.out.print("Informe sua idade: ");
        var age = sc.nextInt();
        System.out.printf("Olá %s, sua idade é %s", name, age);
    }
}
