package Class1;

import java.util.Date;

public class Car {
    private String brand;
    private String model;
    private Date manufactureDate;
    private Engine engine;

    public Car(String brand, String model, Date manufactureDate, String engineType, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.manufactureDate = manufactureDate;
        // Car 생성자 내부에서 Engine 객체를 직접 생성함
        this.engine = new Engine(engineType, horsepower);
    }

    public void displayCarInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("제조일자: " + manufactureDate);
        engine.displayEngineInfo();
    }

    public void startCar() {
        engine.startEngine();
        System.out.println(model + " 차량이 출발합니다.");
    }
    public class Engine {
        private String type;
        private int horsepower;

        public Engine(String type, int horsepower) {
            this.type = type;
            this.horsepower = horsepower;
        }

        public void startEngine() {
            System.out.println(this.type + " 엔진이 작동됩니다. (마력: " + this.horsepower + ")");
        }

        public void displayEngineInfo() {
            System.out.println("엔진 타입: " + this.type);
            System.out.println("엔진 마력: " + this.horsepower);
        }
    }

}
