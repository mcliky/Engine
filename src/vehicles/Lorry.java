package vehicles;

import details.Engine;
import professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String model, String klass, Driver driver, Engine engine) {
        super(model, klass, driver, engine);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
