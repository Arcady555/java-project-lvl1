package hexlet.code;

import java.util.Scanner;

public final class Cli {

    private static String yourName = "";
    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        yourName = scanner.nextLine();
        System.out.println("Hello, " + yourName + "!");
    }
    public String getYouName() {
        return yourName;
    }
}
