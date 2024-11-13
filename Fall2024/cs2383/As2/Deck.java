/** A simple representation of a standard deck of 
	52 playing cards.

	@author Andrew McAllister
*/

import java.util.Random;
import java.io.*;

public class Deck { 
  public final int DECKSIZE = 52;

  /** An array of 52 Card objects
  */
  private Card[] deck = new Card[DECKSIZE];

  /** Constructs a full deck of Card objects in sorted order.
  */
  public Deck()
  { int cardNumber=0;
    for (int suit = 1; suit <= 4; suit++)
      for (int face = 1; face <= 13; face++)
      {  deck[cardNumber] = new Card(face, suit);
         cardNumber++;
      }
  }
  
  /** Returns a Card object reference from the card array.
  
      @param index The index of the Card in the card array.
      @return A reference to the Card object in the array
              position given by index.
  */
  public Card getCard(int index)
  {	if ((index<0) || (index>=DECKSIZE)) return null;
  	return deck[index];
  }
  
  /** Returns a short, printable representation of all 
      52 cards in the deck, with thirteen cards in each of
      four rows. 
  */
  public String toString()
  { StringBuilder r = new StringBuilder();
  	int pos = 0;
  	for (int row=1; row<=4; row++)
  	{	for (int col=1; col<=13; col++)
  		{	r.append(deck[pos].toString() + "  ");
  			pos++;
  		}
  		if (row<4) r.append("\n");
  	} // end outer for loop
  	return r.toString();
  } // end toString() method

  /** Randomizes the order of the cards in the deck using
      the recursive algorithm described in Part A.2 of
      CS2383 Assignment 2.
  */
    public void shuffle1() {
        Card[] shuffle = new Card[52];
        shuffle = recursiveShuffle(shuffle, 0);
        deck =shuffle;
    }


  /** Randomizes the order of the cards in the deck using
      the O(N) algorithm described in Part A.2 of CS2383 
      Assignment 2.
  */
  public void shuffle2(){
    Random index = new Random(); 
    Card temp;
    for (int i = deck.length -1;i>0;i-- ){
      int newPos = index.nextInt(i+1);
      temp = deck[i];
      deck[i] = deck[newPos];
      deck[newPos] = temp;
    }
  }

  public Card[] recursiveShuffle(Card[] shuffled , int position){
    int newPos;
    if (position >= 52) {
      return shuffled;
    }
    do {
        newPos = (int)(Math.random() * 52); 
    } while (shuffled[newPos] != null);     
    shuffled[newPos] = deck[position];
    
    return recursiveShuffle(shuffled, position + 1);
  }
} // End of the Deck class

