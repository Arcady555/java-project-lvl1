package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice:");
        Cli cli = new Cli();
        Even even = new Even();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            cli.greeting();
        }
        if (number == 2) {
            cli.greeting();
            even.game();
        }
        if (number == 0) {
            return;
        }
    }
}
