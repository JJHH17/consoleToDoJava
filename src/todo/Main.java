package todo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to this To Do application!");
        System.out.println("__________________________________");

        // Creating initial program loop
        while (true) {
            System.out.println("Add a new item (add), view an existing item (view), or quit (quit)");
            String continuePrompt = input.next();

            // Exit criteria of code
            if (continuePrompt.toLowerCase().contains("quit")) {
                break;
            }

            switch (continuePrompt.toLowerCase()) {
                case "add":
                    System.out.println("to be continued");
                    break;
                case "view":
                    System.out.println("To also be continued");
                    break;
                default:
                    System.out.println("Please enter a valid argument");
            }
        }

    }
}
