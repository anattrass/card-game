import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;
import java.util.ArrayList;

public class DeckTest {

  Deck deck;
  Card card;

  @Before 
  public void before() {
    deck = new Deck();
  }

  @Test
  public void decIsFull(){
    assertEquals(52, deck.countCardsInDeck());
  }

  @Test
    public void canAddCard() {
        deck.addCard(card);
        assertEquals(53, deck.countCardsInDeck());
    }

  @Test
    public void canDealCard() {
        deck.dealCard();
        assertEquals(51, deck.countCardsInDeck());
    }
}