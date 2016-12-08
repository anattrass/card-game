import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before 
  public void before() {
    deck = new Deck();
    card = new Card(SuitType.CLUB, ValueType.FOUR);
  }

  @Test
  public void decStartsEmpty(){
    assertEquals(0, deck.countCardsInDeck());
  }


}