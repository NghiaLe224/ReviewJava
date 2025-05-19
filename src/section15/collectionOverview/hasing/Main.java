package section15.collectionOverview.hasing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String aTest = "Hello";
        String bTest = "Hello";
        String cTest = String.join("l", "He", "lo");
        String dTest = "He".concat("llo");
        String eTest = "hello";

        List<String> hellos = new ArrayList<>(Arrays.asList(aTest, bTest, cTest, dTest, eTest));

        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());

        for(String setValue : mySet){
            System.out.print(setValue + ": ");
            for(int i = 0; i < hellos.size(); ++i){
                if(setValue == hellos.get(i)){
                    System.out.print(i + ", ");
                }
            }
            System.out.println(" ");
        }

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> cards = new ArrayList(Arrays.asList(aceHearts, kingClubs, queenSpades));
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCard> deck = new HashSet<>();
        for(PlayingCard c : cards){
            if(!deck.add(c)){
                System.out.println("Found a duplicate for " +  c);
            }
        }
        System.out.println(deck);
    }
}
