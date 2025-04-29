package section12.generics;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam {

    private String name;
    private List<Player> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLooses = 0;
    private int totalTies = 0;

    public SportsTeam(String name) {
        this.name = name;
    }

    public void addTeamMember(Player teamMember) {
        if(!teamMembers.contains(teamMember)) {
            teamMembers.add(teamMember);
        }
    }

    public void listTeamMembers() {
        System.out.println(name + "Roster:");
        System.out.println(teamMembers);
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
