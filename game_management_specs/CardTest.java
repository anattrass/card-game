import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before() {
    card = new Card(SuitType.CLUB, ValueType.FOUR);
  }

  @Test
  public void canGetSuit() {
    assertEquals(SuitType.CLUB, card.getSuit());
  }

  @Test
  public void canGetValue() {
    assertEquals(ValueType.FOUR, card.getValue());
  }

}