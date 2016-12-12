package game_management;
import java.util.*;

public class Hand {
  private ArrayList<Card> cards;

 public Hand(){
  this.cards = new ArrayList<Card>();
  }

 public void beDealtCard(Card card){
  cards.add(cards.size(), card);
 }

 public ArrayList<Card> showHand(){
  return cards;
 }

}