import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import game_management.*;

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Cesaro");
    }

    @Test
    public void canGetName() {
        assertEquals("Cesaro", player.getName());
    }

  }