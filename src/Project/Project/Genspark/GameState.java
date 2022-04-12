package Project.Genspark;

public class GameState {
    State gameState;

    public GameState() {
        this.gameState = State.NULL;
    }

    public State getGameState() {
        return gameState;
    }

    public void setAnswer(String answer) {
        if (answer.equals("0"))
            this.gameState = State.WON;
        else if (answer.equals("1"))
            this.gameState = State.LOST;
        else
            this.gameState = State.INVALID;
    }

}
