public class Car {
    private boolean engineOn = false;

    private int gearCar = 0;

    private int carSpeed = 0;

    public void turnOn() {
        engineOn = true;
    }

    public void turnOff() {
        if (gearCar == 0 && carSpeed == 0) {
            engineOn = false;
        } else {
            System.out.println("É necessário parar o carro completamente antes de desligar");
        }
    }

    public void accelerate() {
        int maxSpeed = gearCar * 20;
        if (!engineOn || gearCar == 0) {
            System.out.println("Você deve engatar a marcha e ligar o carro antes de acelerar");
        } else if (carSpeed >= maxSpeed) {
            System.out.println("TA CORTANDO DE GIRO, TROCA DE MARCHA");
        } else {
            carSpeed++;
        }
    }

    public void slowDown() {
        int minSpeed = (gearCar - 1) * 20;
        if (!engineOn) {
            System.out.println("O motor está desligado");
        } else if (carSpeed == 0) {
            System.out.println("O carro já está parado");
        } else if (carSpeed <= minSpeed) {
            System.out.println("Reduz de marcha se não o carro vai morrer");
        } else {
            carSpeed--;
        }
    }

    public void gearUp() {
        int newMin = gearCar * 20;
        if (!engineOn) {
            System.out.println("O motor está desligado");
        } else if (gearCar == 6) {
            System.out.println("O carro está na 6a marcha, não é possível subir mais");
        }
        else if (carSpeed < newMin) {
            System.out.println("A velocidade está baixa para subir de marcha");
        } else {
            gearCar++;
        }
    }
    public void gearDown(){
        int newMax = (gearCar - 1) * 20;
        if (!engineOn){
            System.out.println("O motor está desligado");
        }else if (gearCar == 0){
            System.out.println("O carro está em ponto morto, não é possivel reduzir mais");
        }
        else if (gearCar != 1 && carSpeed > newMax){
            System.out.println("Velocidade muito alta para reduzir");
        }else{
            gearCar--;
        }
    }
    public void turnLeft(){
        if(!engineOn){
            System.out.println("O carro precisa estar ligado para virar a esquerda");
        }else if(carSpeed < 1 || carSpeed > 40 ){
            System.out.println("Velocidade não permitida para fazer a conversão (Máxima de 40km/h)");
        }
        else{
            System.out.println("Virando a esquerda");
        }
    }
    public void turnRight(){
        if(!engineOn ){
            System.out.println("O carro precisa estar ligado para virar a direita");
        }else if(carSpeed < 1 || carSpeed > 40 ){
            System.out.println("Velocidade não permitida para fazer a conversão (Máxima de 40km/h)");
        }
        else{
            System.out.println("Virando a direita");
        }
    }

    public int getCarSpeed(){
        return carSpeed;
    }


}



