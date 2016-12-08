import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;
import java.util.ArrayList;

public class DeckTest {

  Deck deck;

  @Before 
  public void before() {
    deck = new Deck( new ArrayList<Card>() );
  }

  @Test
  public void decStartsFull(){
    assertEquals(52, deck.countCardsInDeck());
  }
}