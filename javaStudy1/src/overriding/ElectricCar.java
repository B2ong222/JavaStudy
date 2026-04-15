package overriding;

import extends3.Car;

public class ElectricCar extends Car {
    @Override
    public void move(){
        System.out.println("전기차 이동");
    }
    public void charge(){
        System.out.println("충전");
    }
}
