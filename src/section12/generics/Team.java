package section12.generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player, S> {

    private String name;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLooses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, S affiliation) {
        this.name = name;
        this.affiliation = affiliation;
    }

    public void addTeamMember(T t) {
        if(!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.print(name + "Roster:");
        System.out.println((affiliation == null ? "" : "AFFILIATION: " + affiliation));
        for(T t : teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking(){
        return(totalLooses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if(ourScore == theirScore){
            totalTies++;
            message = "Tied";
        } else {
            totalLooses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return name + " (Ranked " + ranking() + ")";
    }
}
