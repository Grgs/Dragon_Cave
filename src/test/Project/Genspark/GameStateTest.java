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
        state.gameState = State.LOST;
        assertEquals(State.LOST, state.getGameState());
    }

    @Test
    void setAnswer() {
        state.setAnswer("0");
        assertEquals(State.WON, state.getGameState());
        state.setAnswer("1");
        assertEquals(State.LOST, state.getGameState());
        state.setAnswer("2");
        assertEquals(State.INVALID, state.getGameState());
    }
}