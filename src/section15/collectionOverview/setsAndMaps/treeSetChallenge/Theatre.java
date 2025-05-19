package section15.collectionOverview.setsAndMaps.treeSetChallenge;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Theatre {
    private String name;
    private int seatsPerRow;
    private Set<Seat> seats = new TreeSet<Seat>();

    class Seat {
        private char rowCharacter;
        private int seatNumber;
        private boolean reserved;

        public Seat(char rowCharacter, int seatNumber, boolean reserved) {
            this.rowCharacter = rowCharacter;
            this.seatNumber = seatNumber;
            this.reserved = reserved;
        }

        @Override
        public String toString() {
            return "tutu";
        }
    }

    public Theatre(String name, int rowNo, int totalSeats){
        this.name = name;
        int rowCharacter = 64;
        int statredNum = 0;
        int seatsPerRow = (int) Math.ceil(totalSeats/rowNo);
        for(int i = 0; i < rowNo; ++i){
            rowCharacter++;
            for(int j = 0; j < seatsPerRow; ++j){

            }
        }
    }
}
