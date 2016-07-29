/**
 * Created by butesa on 7/29/2016.
 */

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final int PackSize = 52;
    public static final int SIZE = 13;
    Player Player ;
    Machine machine;
    boolean won =false;
    ArrayList <Card>Pack = new ArrayList<>();

    public Game() {
        initialize();
        Player = new Player((ArrayList<Card>) distribute("Hearts"));
        machine = new Machine((ArrayList<Card>) distribute("Club"));
        while(hasWon()){
            
        }
    }

    private boolean hasWon() {
        return won;
    }

    private void initialize(){
        String[] SuitArray = {"Club", "Hearts",  "Diamond"};
        for(String suit :SuitArray){
            for(int i = 2 ;i < SIZE + 1 ; i++){
                Pack.add(new Card(i,suit));
            }
        }
    }
    private List<Card> distribute(String suit){
        ArrayList<Card> cardList= new ArrayList<>();
        for(Card card : Pack){
            if(card.getSuit().equals(suit)){
                cardList.add(card);
            }
        }
    return cardList;
    }

}
