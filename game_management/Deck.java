package game_management;

public class Deck{

  public Card[] deck;

  public Deck(){
    this.deck = new Card[52];
  }

  public int countCardsInDeck(){
    int count = 0;
    for (Card card : deck){
      if (card != null){
        count++;
      }
    }
    return count;
  }  

}