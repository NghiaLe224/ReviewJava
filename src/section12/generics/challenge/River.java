package section12.generics.challenge;

public class River extends Line{
//    private String name;
//
//    public River(String riverName, double[][] points) {
//        super(points);
//        this.name = riverName;
//    }
//
//    @Override
//    public void render() {
//        System.out.print("River " + name + ": ");
//        super.render();
//    }

    private String name;

    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National River";
    }
}
