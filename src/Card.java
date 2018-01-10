public class Card {

    private String suitList[] = {"Club", "Spade", "Heart", "Diamond"};
    private int rank;
    private String suit;


    //Constructor - runs when the new command is used. Typically this is the executable part of a class. Used primarily to define default behaviors.

    public Card(){

        rank = 2;
        suit = suitList[0];
    }

    public Card(String suit, int rank){

        this.suit = suit;
        this.rank = rank;
    }

    //Method
    public void setSuit(int suit){
        if(suit > 3){
            System.out.println("INVALID SUIT");
        }
        else
            this.suit = suitList[suit];
    }

    public String getSuit(){

        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){

        String output = getRank() + " of " + getSuit();

        return output;

    }
}
