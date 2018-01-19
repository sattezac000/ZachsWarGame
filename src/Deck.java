public class Deck {

    Card[] deck = new Card[52];
    Card card;
    int cardsUsed;

    //Build the Deck
    public Deck(){
        int cardCount = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 14; j++){

                deck[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    public int cardsLeft(){
        return 52 - cardsUsed;
    }

    //Shuffle the Deck
    public void shuffle(){
        for(int i = 51; i > 0; i--){
            int rand = (int) (Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;

    }
    //Deal the Deck - returning 1 card from the deck... multiple card will be assigned
    //in the main game class
    public Card deal(){
        if(!(cardsUsed >= 52)){
            card = deck[cardsUsed];
            cardsUsed++;
        }
        else {
            System.out.println("No more cards in Deck.");

        }
        return card;
    }
    public String toString(){
        String message = "";

        for(Card thing: deck){
            message += thing.toString() + "\n";
        }
        return message;
    }

}
