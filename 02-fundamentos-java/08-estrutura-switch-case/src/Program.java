import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7");
        var option = scanner.nextInt();
        var message =switch (option){
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sabádo";
                yield String.format("Hoje é %s, FIM DE SEMANA UHUL", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";

        };
        System.out.println("Dia da semana: " + message);
        //===========ANOTAÇÕES==========
        //Aprendendo sobre yield, nao conhecia antes, serve para retornar um valor dentro de um case
        //Precisamos dele se não o case não retorna nada
        //Usando ternario dentro da case para dois valores
        //Usando o -> no switch case, náo precisamos usar o break pois ela para sozinha no case escolhido e não escorrega para o proximo case

        /* switch (option){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }*/
    }
}
