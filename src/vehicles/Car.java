package vehicles;

import details.Engine;
import professions.Driver;

//Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(),
// которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об
// автомобиле, ее водителе и моторе.
public class Car {
    private String model;
    private String klass;
    private Driver driver;
    private Engine engine;

    public Car(String model, String klass, Driver driver, Engine engine) {
        this.model = model;
        this.klass = klass;
        this.driver = driver;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getKlass() {
        return klass;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", klass='" + klass + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
