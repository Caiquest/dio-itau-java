
/*
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
Ligar o carro;
Desligar o carro;
Acelerar;
diminuir velocidade;
virar para esquerda/direita
verificar velocidade;
trocar a marcha
Siga as seguintes regras na implementação

Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
O carro desligado não pode realizar nenhuma função;
Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrando no carro...");
        Car car = new Car();
        int option;
        do {
            System.out.printf("[ %s | Marcha: %d | %d km/h ]%n", car.isEngineOn() ? "LIGADO" : "DESLIGADO", car.getGearCar(),
                    car.getCarSpeed());
            printMenu();
            System.out.println("Selecione uma opção: ");
            option = scanner.nextInt();
            switch (option){
                case 1 -> {
                    System.out.println("\nLigando o carro...");
                    car.turnOn();
                }
                case 2 -> car.turnOff();
                case 3 -> car.accelerate();

                case 4 -> car.slowDown();

                case 5 -> car.turnLeft();

                case 6 -> car.turnRight();

                case 7 -> car.gearUp();

                case 8 -> car.gearDown();

                case 0 ->{
                    System.out.println("Saindo do carro...");
                }
                default -> System.out.println("Opção inválida, tente novamente");
            };
        }while(option!= 0);

        scanner.close();
    }
    private static void printMenu() {
        System.out.print("""
            
            ========== PAINEL DO CARRO ==========
             1 - Ligar          2 - Desligar
             3 - Acelerar       4 - Frear
             5 - Virar esq.     6 - Virar dir.
             7 - Subir marcha   8 - Reduzir marcha
             0 - Sair
            =====================================
            """);
    }


}
