package section11.interfaces;

import section11.abstractions.Fish;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

//        System.out.println("-".repeat(30));
//        inFlight(bird);
        System.out.println("-".repeat(30));
        inFlight(flier);
        System.out.println("-".repeat(30));
        Jet jet = new Jet();
        inFlight(jet);
        System.out.println("-".repeat(30));
        Truck truck = new Truck();
        truck.track();
        System.out.println("-".repeat(30));
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        System.out.println("-".repeat(30));
        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    public static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers){
            flier.land();
        }
    }

}
