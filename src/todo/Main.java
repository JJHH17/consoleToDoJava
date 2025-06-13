package todo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array or map containing our to do entries

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to this To Do application!");
        System.out.println("__________________________________");

        // Creating initial program loop
        while (true) {
            System.out.println("Add a new item (add), view an existing item (view), or quit (quit)");
            String continuePrompt = input.next();
            input.nextLine();
            // Exit criteria of code
            if (continuePrompt.toLowerCase().contains("quit")) {
                break;
            }

            switch (continuePrompt.toLowerCase()) {
                case "add":
                    System.out.println("Add a Description");
                    String description = input.nextLine();
                    System.out.println("Add a Priority");
                    String priority = input.next();
                    System.out.println("Is this completed?");
                    char completed = input.next().charAt(0);
                    add(description, priority, completed);
                    break;

                case "view":
                    System.out.println("To also be continued");
                    break;

                default:
                    System.out.println("Please enter a valid argument");
            }
        }
    }

    // Method for when "Add" is entered by user
    public static void add(String description, String priority, char completed) {
        var newToDo = new ToDo(description, priority, completed);
    }

    // Method for when "View" is entered by user
    public static void view(String[] args) {

    }
}
