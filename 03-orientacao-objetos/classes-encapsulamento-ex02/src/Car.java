public class Car {
    private boolean engineOn = false;

    private int gearCar = 0;

    private int carSpeed = 0;

    public boolean  turnOn(int gearCar, int carSpeed){
        if (engineOn && gearCar == 0 && carSpeed == 0){
            return engineOn = true;
        }else{
            System.out.println("Não foi possível ligar o carro, tente novamente");
            return false;
        }

    }

}
