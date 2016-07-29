public class Card implements Comparable<Card> {
    private String suit;
    private int rank;

    public final static String suitName = "CHSD";




    public Card(int rank, String suit) {

        this.rank = rank;
        this.suit = suit.substring(0,1).toUpperCase();
    }

    public String getSuit() {
        return suit;
    }


    @Override
    public String toString(){
        return this.rank + " of " + this.suit;
    }

    @Override
    public int compareTo(Card o) {
        return this.rank - o.rank;
    }
}