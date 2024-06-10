package classAndInterface;

public class Car {
    private String type;
    private String make;
    private Engine engine;

    public Car(String type, String make) {
        this.type = type;
        this.type = type;
        this.engine = new Engine(this);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    class Engine {
        private String engineType;

        public Engine(Car car) {
        }

        public void setEngineType(Car car) {

            if (car.getType().equals("economy")) {
                this.engineType = "diesel";
            } else if (car.getType().equals("luxury") ) {
                this.engineType = "electric";
            } else {
                this.engineType = "petrol";
            }
        }
        public String getEngineType() {
            return engineType;
        }
    }
}