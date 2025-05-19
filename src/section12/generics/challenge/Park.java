package section12.generics.challenge;

public class Park extends Point{

//    private String name;
//
//    public Park(String parkName, double latitude, double longitude) {
//        super(latitude, longitude);
//        this.name = parkName;
//    }
//
//    @Override
//    public void render() {
//        System.out.print("Park " + name + " ");
//        super.render();
//    }

    private String name;

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park";
    }
}
