public class Game {



    public static void main (String[] args){

        Card card = new Card();
        Card card2 = new Card("Club", 6);

        card.setRank(8);

        System.out.println(card.toString());
        System.out.println(card2.toString());
    }
}
