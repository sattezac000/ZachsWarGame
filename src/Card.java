public class Card {

    private String suitList[] = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private int rank;
    private String suit;


    //Constructor - runs when the new command is used. Typically this is the executable part of a class. Used primarily to define default behaviors.

    public Card(){

        rank = 2;
        suit = suitList[0];
    }

    public Card(int suit, int rank){

        setSuit(suit);
        setRank(rank);
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
        if (rank > 13 || rank < 1) {
            System.out.println("INVALID RANK");
        }
        else
            this.rank = rank;
    }


    public String toString(){
        String rankStr = "";

        switch(rank) {
            case 1: rankStr = "Ace";
                break;
            case 2: rankStr = "2";
                break;
            case 3: rankStr = "3";
                break;
            case 4: rankStr = "4";
                break;
            case 5: rankStr = "5";
                break;
            case 6: rankStr = "6";
                break;
            case 7: rankStr = "7";
                break;
            case 8: rankStr = "8";
                break;
            case 9: rankStr = "9";
                break;
            case 10: rankStr = "10";
                break;
            case 11: rankStr = "Jack";
                break;
            case 12: rankStr = "Queen";
                break;
            case 13: rankStr = "King";
                break;
        }

        String output = rankStr + " of " + getSuit();

        return output;

    }
}
