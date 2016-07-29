import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by palsulea on 7/29/2016.
 */
public class Player {
    final int SIZE = 13;
    private ArrayList<Card> hand;
    int currentBid;
    int score;
    int remaining;
    public Player(ArrayList<Card> hand){
         this.hand = hand;
        score = 0;
        remaining = 104;
    }

    public int bid (int value){
        if(hand.contains(value)){
           hand.remove((Object)value);
            currentBid = value;
            return value;
        }
    return -1;
    }


    public int getScore() {
        return score;
    }



    public int getRemaining() {
        return remaining;
    }


    public String hand(){
        return hand.toString() ;
    }

    public void updateStatus(boolean won,int bidFor){
        if(won){
            score += bidFor;
        }
        remaining -= currentBid;
    }
}
