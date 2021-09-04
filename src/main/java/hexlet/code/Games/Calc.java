package hexlet.code.Games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Calc implements Engine {

    private int answer = 0;
    private int result = 0;
    public void game() {
        System.out.println("What is the result of the expression?");
        char[] operands = {'-', '+', '*'};
        for (int i = 0; i < NUMBER_OF_LOOPS; i++) {
            Random ran = new Random();
            int numberOnConsole1 = ran.nextInt(NUMBER_LIMITATION);
            char operand = chooseOp();
            int numberOnConsole2 = ran.nextInt(NUMBER_LIMITATION);
            result = takeResult(operand, numberOnConsole1, numberOnConsole2);
            System.out.println("Question: " + numberOnConsole1 + operand + numberOnConsole2);
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
        System.out.println("Congratulations, " + Cli.yourName + "!");
    }

    public void wrong() {
        System.out.print("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result
                + "'.\nLet's try again, " + Cli.yourName + "!\n");
    }

    private char chooseOp() {
        char[] operands = {'-', '+', '*'};
        Random random = new Random();
        return operands[random.nextInt(operands.length)];
    }

    private int takeResult(char operand, int a, int b) {
        switch (operand) {
            case ('-'): {
                return a - b;
            }
            case ('+'): {
                return a + b;
            }
            default: {
                return a * b;
            }
        }
    }
}
