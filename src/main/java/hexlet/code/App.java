package hexlet.code;

import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit\nYour choice:");
        Even even = new Even();
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            return;
        }
        Cli.greeting();
        switch (number) {
            case(1): {
            break;
            }
            case (2): {
            even.game();
            break;
            }
            case (3): {
            calc.game();
            break;
            }
            default: {
            System.out.println("wrong number :((");
            return;
            }
        }
    }
}
