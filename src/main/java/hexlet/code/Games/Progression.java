package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class Progression implements Engine {

    private int answer = 0;
    private int index = 0;
    private int result = 0;
    private int[] array;

    public void game() {
        final int sizeLimit = 30;
        final int progreLimit = 10;
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < NUMBER_OF_LOOPS; i++) {
            Random ran = new Random();
            int startOfProgre = ran.nextInt(NUMBER_LIMITATION);
            int stepOfProgre = ran.nextInt(sizeLimit) + 1;
            int numOfMemProgre = ran.nextInt(progreLimit) + 5;
            System.out.print("Question: ");
            takeResult(startOfProgre, stepOfProgre, numOfMemProgre);
            System.out.println("\nYour answer:");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            result = array[index];
            if (result == answer) {
                System.out.println("Correct!");
            } else {
                wrong();
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.yourName + "!");
    }

    public void wrong() {
        System.out.print("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result
                + "'.\nLet's try again, " + Cli.yourName + "!\n");
    }

    public void takeResult(int a, int b, int c) {
        array = new int[c];
        for (int i = 0; i < c; i++) {
            array[i] = a + b * i;
        }
        Random ran = new Random();
        index = ran.nextInt(c - 1);
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
            }
        System.out.print("..");
        for (int i = index + 1; i < c; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
