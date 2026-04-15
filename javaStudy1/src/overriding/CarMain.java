package overriding;

import extends2.GasCar;

public class CarMain {
    static void main() {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
