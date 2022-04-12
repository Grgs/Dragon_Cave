package Project.Genspark;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    GameState state;

    @BeforeEach
    void setUp() {
        state = new GameState();
    }

    @Test
    void getGameState() {
        assertEquals(State.NULL, state.getGameState());
    }

    @Test
    void setAnswer() {
    }
}