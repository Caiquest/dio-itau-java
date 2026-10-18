import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela
//a seguinte mensagem "Olá 'fulano' voce tem 'x anos'"
public class Program {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        //Declarando o formato aceitado para a data
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite o seu nome: ");
        var name = scanner.next();
        System.out.print("Digite sua data de nascimento: ex(dd/MM/yyyy)");
        var birth = scanner.next();
        //Lendo o texto digitado pelo usuario e convertendo em data de verdade
        LocalDate dateOfBirth = LocalDate.parse(birth, format);
        //Pega a data e hora exata do computador
        LocalDate today = LocalDate.now();

        Period period = Period.between(dateOfBirth, today);
        int age = period.getYears();

        System.out.println("Olá " + name + ", você tem " + age + " anos");


    }
}
