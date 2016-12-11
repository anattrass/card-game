import game_management.*;
import java.util.*;

public class Runner {


  public static void main(String[] args) {

    Deck deck = new Deck();
    deck.populate();
    deck.shuffle();
    for (Card card : deck.getDeck()) {
      System.out.println(card.toString());
    }
  }
}