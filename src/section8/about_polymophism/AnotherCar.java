package about_polymophism;

public class AnotherCar {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public AnotherCar(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " -> start engine";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate";
    }

    public String brake(){
        return getClass().getSimpleName() + " -> brake";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
//Mitsubishi, Holden, and Ford.
class Mitsubishi extends AnotherCar {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Holden extends AnotherCar {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Ford extends AnotherCar {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
