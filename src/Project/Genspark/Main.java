package Project.Genspark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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

        String answer = "";
        do {
            System.out.println("Which cave will you go into?");
            try{
                answer = in.nextLine();
            } catch (IllegalStateException e){
                System.out.println("Error: Java scanner is closed; " + e.getMessage());
                System.exit(1);
            }
        } while(!answer.equals("0") && !answer.equals("1"));

        if (answer.equals("1")) {
            System.out.print(String.format(badOutcome));
        } else {
            System.out.println(String.format(goodOutcome));
        }

        System.exit(0);
    }
}

