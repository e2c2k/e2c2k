/**	Represents one card from a standard deck of 52 playing cards.

	@author Andrew McAllister
*/
public class Card
{
  /** Face value of the card: 1-13, where 1 = Ace, 2-10 = 2-10,
      and 11-13 = Jack, Queen, King respectively.
  */
  private int face;
  
  /** Suit of the card: 1-4 = clubs, diamonds, spades, hearts.
  */
  private int suit;

  // Constants for the suits and face cards
  // These make the code more readable, and avoids "wrong number" errors
  // These are public, similar to other constants like Math.PI
  public static final int CLUBS    = 1;
  public static final int DIAMONDS = 2;
  public static final int SPADES   = 3;
  public static final int HEARTS   = 4;
  public static final int ACE      = 1;
  public static final int JACK     = 11;
  public static final int QUEEN    = 12;
  public static final int KING     = 13;
  
  // Constant values, which are defined as private since they 
  // are used only by the toString() method in this class.
  private static final String[] SUITLETTER = {"c","d","s","h"};
  private static final String[] FACELETTER 
                    = {"A", "2", "3", "4", "5", "6",
                       "7", "8", "9", "10", "J", "Q", "K"};

  /** Constructs a card given a face and suit value.
  */
  public Card (int faceIn, int suitIn)
  { face = faceIn;
    suit = suitIn;
  }

  /** Constructs a random card.
  */
  public Card ()
  { face = (int)((Math.random()*13.0)) + 1;
    suit = (int)((Math.random()*4.0)) + 1;
  }

  /** Returns the face value of the Card.
      @return A number in the range 1..13
  */ 
  public int getFace()
  { return face;
  }

  /** Returns the suit of the Card
      @return A number in the range 1..4
  */
  public int getSuit()
  { return suit;
  }

  /** Returns a String describing the face of the card.
  */
  public String getFaceDescription()
  { if (face == ACE) return "Ace";
    if (face == JACK) return "Jack";
    if (face == QUEEN) return "Queen";
    if (face == KING) return "King";
    return face+"";
  }

  /** Returns a String describing the suit of the card.
  */
  public String getSuitDescription()
  { if (suit == CLUBS) return "Clubs";
    if (suit == DIAMONDS) return "Diamonds";
    if (suit == SPADES) return "Spades";
    return "Hearts";
  }
  
  /** Returns a String describing the face and suit of the card.
  */
  public String getDescription()
  { return this.getFaceDescription() + " of "
           + this.getSuitDescription();
  }
  

  /** Returns a short representation of the card, for
      example "Ah" for the Ace of hearts, or "10c" for
      the 10 of clubs
  */
  public String toString()
  { return FACELETTER[face-1] + SUITLETTER[suit-1];
  }

  
} // end of Card class