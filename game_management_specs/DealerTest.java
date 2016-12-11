import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import game_management.*;

public class DealerTest {
    
    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer("Rusev", deck);
    }

    @Test
    public void canDealCard(Player receiver){
        dealer.dealCardToPlayer(receiver);
        assertEquals(51, deck.countCardsInDeck());
    }
}