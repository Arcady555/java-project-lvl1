package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Even {
    private String answer = "";
    private final int numberLimitation = 100;
    private final int cyclesAmoumt = 3;
    public void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 0;
        while (i <= 2) {
            Random ran = new Random();
            int numberOnConsole = ran.nextInt(numberLimitation);
            System.out.println("Question: " + numberOnConsole);
            System.out.println("Your answer:");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (numberOnConsole % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    this.wrong();
                    break;
                }
            }
            if (numberOnConsole % 2 == 1) {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    this.wrong();
                    break;
                }
            }
            i++;
            if (i == cyclesAmoumt) { // maximum number of repetitions of the cycle
                System.out.println("Congratulations, " + Cli.name + "!");
            }
        }
    }
    private void wrong() {
        System.out.print("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                + Cli.name + "!\n");
    }
}
