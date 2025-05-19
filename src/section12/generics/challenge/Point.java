package section12.generics.challenge;

import java.util.Arrays;

public abstract class Point implements Mappable{
//    protected double latitude, longitude;
//
//    public Point(double latitude, double longitude) {
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }
//
//    @Override
//    public void render() {
//        System.out.println("POINT at (" + latitude + ", " + longitude + ")");
//    }

    private double[] location = new double[2];

    public Point(String location){
        this.location = Mappable.StringToLaLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    private String location(){
        return Arrays.toString(location);
    }
}
