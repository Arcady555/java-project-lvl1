package hexlet.code;

import java.util.Scanner;

public final class Cli {
    static String name = "";
    public  static void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
