package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Partisipant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T partisipant){
        participants.add(partisipant);
        System.out.println("In team " + name + " was added new part " + partisipant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Winner is " + winnerName);
    }
}
