import java.util.ArrayList;

/**
 * Created by bagades on 7/29/2016.
 */
public class Machine {
    ArrayList<Card> machineCards ;
    int score ;
    int remaining ;
    int currentBid;
    Machine(ArrayList<Card> givenCard) {
        this.machineCards = new ArrayList<>(givenCard);
        this.score = 0;
        this.remaining = 104;
        this.currentBid = 0;
    }
    public int selectCard (Card o) {
        if(this.remaining <o.rank) {
                this.currentBid = lowestPossible();
        } else if(o.rank > 1 && o.rank < 8) {
            this.currentBid = lowestPossible();
        } else if(o.rank > 7 && o.rank <15) {
            this.currentBid = highestPossible();
        }
        return this.currentBid;
    }
    public int lowestPossible () {
        int low = machineCards.remove(0).rank;
        return low;
    }
    public int highestPossible() {
        int high = machineCards.remove(this.machineCards.size()-1).rank;
        return high;
    }
    public void updateStatus(boolean status, int bidFor) {
        if (status) {
             this.score += bidFor;
            this.remaining -= this.currentBid;
        }
        else
            this.remaining -= this.currentBid;

    }
}