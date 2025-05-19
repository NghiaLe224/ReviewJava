package section11.abstractions;

abstract class Mammal extends Animal {

    public Mammal(String type, double weight, String size) {
        super(type, weight, size);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println( speed.equals("slow") ? "walk" : "run");
    }

    public abstract void shedHair();
}

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, double weight, String size) {
        this.type = type;
        this.weight = weight;
        this.size = size;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
