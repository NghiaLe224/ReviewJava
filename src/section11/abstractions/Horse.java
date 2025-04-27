package section11;

public class Horse extends Mammal{
    public Horse(String type, String size,double weight) {
        super(type, weight, size);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
