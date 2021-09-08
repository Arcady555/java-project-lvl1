package hexlet.code;

import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Prime;
import hexlet.code.Games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter.\n1 - Greet\n2 "
                        + "- Even\n3 - Calc\n4 - GCD\n5 - GCD\n6 - GCD\n0- Exit\nYour choice:");
        Even even = new Even();
        Calc calc = new Calc();
        GCD gcd = new GCD();
        Progression progression = new Progression();
        Prime prime = new Prime();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if (number == "0") {
            return;
        }
        Cli.greeting();
        switch (number) {
            case "1":
                break;

            case "2":
                even.game();
                break;

            case "3":
                calc.game();
                break;

            case "4":
                gcd.game();
                break;

            case "5":
                progression.game();
                break;

            case "6":
                prime.game();
                break;

            default: {
                System.out.println("wrong number :((");
            }
        }
    }
}
