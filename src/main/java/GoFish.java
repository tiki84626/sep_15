import java.util.*;

public class GoFish {

  public Game() {

  }

  public Player() {

  }

  public DeckOfCards() {
    String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    ArrayList<String> deck = new ArrayList<>();

    for ( String suit : suits ) {
      for ( String value : values) {
        deck = (value + " of " + suit);
      }
    }
  }


}
