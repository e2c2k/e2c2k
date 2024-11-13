public class DeckTest {
    public static void main(String[] args){
       Deck CardDeck = new Deck();

       System.out.println(CardDeck.toString());

       System.out.println("-------------------------------------------------");


       //Shuffle 1
       CardDeck.shuffle1();

       System.out.println(CardDeck.toString());

       System.out.println("-------------------------------------------------");

        //Shuffle2
       CardDeck.shuffle2();

       System.out.println(CardDeck.toString());

    }
}
