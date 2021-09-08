package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class GCD implements Engine {
    private Cli cli = new Cli();
    private int answer = 0;
    private int result = 0;
    public void game() {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < NUMBER_OF_LOOPS; i++) {
            Random ran = new Random();
            int numberOnConsole1 = ran.nextInt(NUMBER_LIMITATION);
            int numberOnConsole2 = ran.nextInt(NUMBER_LIMITATION);
            result = takeResult(numberOnConsole1, numberOnConsole2);
            System.out.println("Question: " + numberOnConsole1 + " " + numberOnConsole2);
            System.out.println("Your answer:");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            if (result == answer) {
                System.out.println("Correct!");
            } else {
                wrong();
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getYouName() + "!");
    }

    public void wrong() {
        System.out.print("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result
                + "'.\nLet's try again, " + cli.getYouName() + "!\n");
    }

    public int takeResult(int a, int b) {
        int result1 = 0;
        if (a == b) {
            result1 = a;
        } else if (a == 0 | b == 0) {
            result1 = Math.max(a, b);
        }
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arrayListA.add(i);
            }
        }
        for (int j = 1; j <= b; j++) {
            if (b % j == 0) {
                arrayListB.add(j);
            }
        }
        for (int i = 0; i < arrayListA.size(); i++) {
            for (int j = 0; j < arrayListB.size(); j++) {
                if (arrayListA.get(i) == arrayListB.get(j)) {
                    result1 = arrayListA.get(i);
                }
            }
        }
        return result1;
    }
}
