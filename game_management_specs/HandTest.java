import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class HandTest {

  @Test
  public void canBeDealtCard() {
    Hand hand = new Hand();
    Card card = new Card(SuitType.CLUB, ValueType.SEVEN);
    hand.beDealtCard(card);
    assertEquals(1, hand.showHand().size());
  }

}