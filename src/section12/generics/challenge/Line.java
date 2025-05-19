package section12.generics.challenge;

import java.util.Arrays;

public abstract class Line implements Mappable{

//    double[][] points;

//    public Line(double[][] points) {
//        this.points = points;
//    }
//
//    @Override
//    public void render() {
//        System.out.println("LINE at:");
//        for(double[] point : points){
//            System.out.println("(" + point[0] + ", " + point[1] + ")");
//        }
//    }

    double[][] locations;

    public Line(String... locations){
        this.locations = new double[locations.length][];
        int index = 0;
        for(var l : locations){
            this.locations[index++] = Mappable.StringToLaLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + location() + ")");
    }

    private String location(){
        return Arrays.deepToString(locations);
    }
}
