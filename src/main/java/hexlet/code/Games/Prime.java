package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class Prime implements Engine {
    private String answer = "";
    public void game() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < NUMBER_OF_LOOPS; i++) {
            Random ran = new Random();
            int numberOnConsole = ran.nextInt(NUMBER_LIMITATION);
            System.out.println("Question: " + numberOnConsole);
            System.out.println("Your answer:");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (isPrime(numberOnConsole) & answer.equals("yes")
                    | !isPrime(numberOnConsole) & answer.equals("no")) {
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

    private boolean isPrime(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        } return true;
    }
}
