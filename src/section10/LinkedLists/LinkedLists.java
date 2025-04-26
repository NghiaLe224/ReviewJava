package section10.LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit2 = new LinkedList<String>();
        placesToVisit2.add("Sydney");
        placesToVisit2.add(0, "Canberra");
        System.out.println(placesToVisit2);

        System.out.println("-".repeat(30));
        addMoreElements(placesToVisit2);
        System.out.println(placesToVisit2);

//        System.out.println("-".repeat(30));
//        removeElements(placesToVisit2);
//        System.out.println(placesToVisit2);

//        System.out.println("-".repeat(30));
//        gettingElements(placesToVisit2);

//        printItinerary(placesToVisit2);
//        printItinerary2(placesToVisit2);
//        printItinerary3(placesToVisit2);

        testIterator(placesToVisit2);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue Method
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack Methods
        list.push("Alice Spring");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        // Queue/Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at Position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        //Stack
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){

//        var iterator = list.iterator();
        var iterator = list.listIterator();
        while(iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
//                iterator.remove();
                iterator.add("Lake Wevenhoe");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}
