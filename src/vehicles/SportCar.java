package vehicles;

import details.Engine;
import professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String model, String klass, Driver driver, Engine engine) {
        super(model, klass, driver, engine);
    }

    @Override
    public String toString() {
        return "sportCar{" +
                "speed=" + speed +
                '}';
    }
}
