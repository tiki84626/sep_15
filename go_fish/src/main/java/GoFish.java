import java.util.*;

public class Player {
  private List<String> newDeck;
  private String name;
  private List hand;

  public Player(List<String> ) {


  }

  public static ArrayList DeckOfCards() {
    String[] suits = {"S", "C", "H", "D"};
    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    ArrayList<String> deck = new ArrayList<String>();

    for ( String suit : suits ) {
      for ( String value : values) {
        deck.add(value + " of " + suit);
      }
    }
    Collections.shuffle(deck);
    return deck;
  }

  public static List Hand() {
    hand = new ArrayList<>(newDeck.subList(0,5));
    newDeck = newDeck.subList(5, newDeck.size());
    return hand;
  }

  public static List NewDeck() {
    return newDeck;
  }

}
