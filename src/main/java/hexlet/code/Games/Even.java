package hexlet.code.Games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Even implements Engine {

    private String answer = "";
    public void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_LOOPS; i++) {
            Random ran = new Random();

            int numberOnConsole = ran.nextInt(NUMBER_LIMITATION);
            System.out.println("Question: " + numberOnConsole);
            System.out.println("Your answer:");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (numberOnConsole % 2 == 0 & answer.equals("yes")
                    | numberOnConsole % 2 == 1 & answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                    this.wrong();
                    return;
            }
        }
        System.out.println("Congratulations, " + Cli.yourName + "!");
    }

    public void wrong() {
        String correctAnswer = "";
        if (answer.equals("yes")) {
            correctAnswer = "no";
        } else if (answer.equals("no")) {
            correctAnswer = "yes";
        }
        System.out.print("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + correctAnswer
                + "'.\nLet's try again, " + Cli.yourName + "!\n");
    }
}
