package game_management;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{

  public ArrayList<Card> cards;

  public Deck(ArrayList<Card> cards){
    this.cards = cards;
    populate();
}

  public void populate() {
    for (SuitType suit : SuitType.values()) {
      for (ValueType value : ValueType.values()) {
    cards.add(new Card(suit, value));
      }
    }
  }

  public int countCardsInDeck(){
    return cards.size();
  }



}