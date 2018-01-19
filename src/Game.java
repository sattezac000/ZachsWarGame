import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Game {

    static Hand computer = new Hand();
    static Hand player = new Hand();
    static Deck deck = new Deck();
    static List<Card> pot = new ArrayList<Card>();
    static int rounds = 0;

    public static void setup(){

        deck.shuffle();
        for( int i = 0; deck.cardsLeft() > 0; i++){
            computer.addCard(deck.deal());
            player.addCard(deck.deal());
        }
    }

    public static void playCards(){
        pot.add(0,computer.getCard(0));
        computer.removeCard(0);

        pot.add(1,player.getCard(0));
        player.removeCard(0);

        System.out.println("Computer played:" + pot.get(0));
        System.out.println("Player played:" + pot.get(1));
    }

    public static void checkWin(){
        Scanner read = new Scanner(System.in);

        if(pot.get(0).getRank() > pot.get(1).getRank()){
            Iterator itr = pot.iterator();

            while(itr.hasNext()){
                computer.addCard((Card)itr.next());
                itr.remove();
            }
            System.out.println("You lost.");
            System.out.println("You have " + player.getCardCount() + " cards in your hand.");
            System.out.println("Press enter to continue");
            read.nextLine();
        }
        else if((pot.get(0).getRank() < pot.get(1).getRank())) {
            Iterator itr = pot.iterator();

            while (itr.hasNext()) {
                player.addCard((Card) itr.next());
                itr.remove();
            }
            System.out.println("You won.");
            System.out.println("You have " + player.getCardCount() + " cards in your hand.");
            System.out.println("Press enter to continue");
            read.nextLine();
        }
        else{

            System.out.println("MATCH! Press enter to continue.");
            read.nextLine();

            int rounds = 4;
            if(player.getCardCount() < 4 || computer.getCardCount() < 4){
                rounds = Math.min(player.getCardCount(), computer.getCardCount());
            }

            for(int i = 0; i < rounds; i++){

                System.out.println("*******" + (i+1) + "*******");
                playCards();
                System.out.println("Press enter to continue");
                read.nextLine();

            }

            checkWin();
        }


    }





    public static void main (String[] args){

        setup();

        do {
            playCards();
            checkWin();
            rounds++;

            //checkWin();
        }while(computer.getCardCount() > 0 && player.getCardCount() > 0);
        System.out.println("The match ended in: " + rounds +  " rounds. ");
    }
}
