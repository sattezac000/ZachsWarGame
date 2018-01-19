import java.util.ArrayList;
import java.util.List;

public class Hand {

    List<Card> hand;

    public Hand(){

        hand = new ArrayList<Card>();

    }

    public void addCard(Card c){

        if (c != null){
            hand.add(c);
        }
    }

    public void removeCard(Card c){

        if(c != null){
            hand.remove(c);
        }
    }

    public void removeCard(int position){

        if(position >= 0 && position < hand.size()){
            hand.remove(position);
        }
    }

    public Card getCard(int position){

        if (position >= 0 && position < hand.size())
            return hand.get(position);
        else
            return null;
    }

    public int getCardCount(){

        return hand.size();

    }


    public String toString() {

        return hand.toString();

    }
}
