package Project.Genspark;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String intro = "You are in a land full of dragons. In front of you %nyou see two caves. In one cave, the dragon is friendly %nand will share his treasure with you. The other dragon %nis greedy and hungry and will eat you on sight.%n";
        String badOutcome = "You approach the cave ...%nIt is dark and spooky ...%nA large dragon jumps out in front of you! He opens his jaws and ... %nGobbles you down in one bite!";
        String goodOutcome = "You approach the cave ...%nYou see a sleeping dragon ...%nYou pass without incident";
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

