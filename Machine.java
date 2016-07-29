import java.util.ArrayList;

/**
 * Created by bagades on 7/29/2016.
 */
public class Machine {
    ArrayList<Card> machineCards ;
    int score ;
    int remaining ;
    Machine(ArrayList<Card> givenCard) {
        this.machineCards = new ArrayList<>();
        this.score = 0;
        this.remaining = 104;
        for(Card c : givenCard) {
            machineCards.add(c);
        }
    }
    public int selectCard (Card o, int bidValue) {
        if()
        return 0;
    }
}