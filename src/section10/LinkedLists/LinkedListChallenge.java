package section10.LinkedLists;

import java.util.LinkedList;
import java.util.Scanner;

record Place (String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlaces(placesToVisit, adelaide);
        addPlaces(placesToVisit, new Place("adelaide", 1374));
        addPlaces(placesToVisit, new Place("Brisbane", 917));
        addPlaces(placesToVisit, new Place("Perth", 3923));
        addPlaces(placesToVisit, new Place("Alice Springs", 2771));
        addPlaces(placesToVisit, new Place("Darwin", 3972));
        addPlaces(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        while (!quitLoop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String menuItem = sc.nextLine().toUpperCase().substring(0,1);
            switch (menuItem){
                case "F" :
                    System.out.println("User wants to go forward");
                    if(!forward){
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B" :
                    System.out.println("User wants to go backward");
                    if(forward){
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M" :
                    printMenu();
                    break;
                case "L" :
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void printMenu(){
        String menu = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit""";
        System.out.println(menu);
    }

    private static void addPlaces(LinkedList<Place> places, Place place){
        if(places.contains(place)){
            System.out.println("Duplicate place by contains: " + place.name());
            return;
        }
        for(Place p : places){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Duplicate place: " + place.name());
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace : places){
            if(place.distance() < listPlace.distance()){
                places.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        places.add(place);
    }
}
