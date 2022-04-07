package Project.Genspark;

import java.util.Scanner;

public class Main {
    public enum State{
        WON, LOST, NULL, INVALID
    }
    public static void main(String[] args) {
        String intro = "You are in a land full of dragons. In front of you %n" +
                "you see two caves. In one cave, the dragon is friendly %n" +
                "and will share his treasure with you. " +
                "The other dragon %nis greedy and hungry and will eat you on sight.%n";
        String badOutcome = "You approach the cave ...%n" +
                "It is dark and spooky ...%n" +
                "A large dragon jumps out in front of you! He opens his jaws and ... %n" +
                "Gobbles you down in one bite!";
        String goodOutcome = "You approach the cave ...%n" +
                "You see a sleeping dragon ...%n" +
                "You pass without incident";
        System.out.print(String.format(intro));

        Scanner scanner = new Scanner(System.in);

        State gameState = State.NULL;
        String answer = "";
        do {
            System.out.println("Which cave will you go into?");
            try{
                answer = scanner.nextLine();
            } catch (IllegalStateException e){
                System.out.println("Error: Java scanner is closed; " + e.getMessage());
                System.exit(1);
            }
            gameState = determineGameState(answer);
        } while(gameState == State.INVALID);

        if (gameState == State.LOST) {
            System.out.print(String.format(badOutcome));
        } else {
            System.out.println(String.format(goodOutcome));
        }
    }

    private static State determineGameState(String answer) {
        State gameState;
        if(answer.equals("0"))
            gameState = State.WON;
        else if (answer.equals("1"))
            gameState = State.LOST;
        else
            gameState = State.INVALID;
        return gameState;
    }
}

