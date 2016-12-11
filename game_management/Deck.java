package game_management;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{

  public ArrayList<Card> cards;

  public Deck(){

    this.cards = new ArrayList<Card>();
    populate();
}

  public ArrayList<Card> getDeck() {
    return this.cards;
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

  public void shuffle() {
    Collections.shuffle(cards);
  }

  // public void addCard(Card card) {
  //     this.cards.add(card);
  // }

  public Card dealCard() {
         return this.cards.remove(0);
     }





}