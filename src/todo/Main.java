package todo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Creating instance
    static ToDoManager manager = new ToDoManager();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to this To Do application!");
        System.out.println("__________________________________");

        // Creating initial program loop
        while (true) {
            System.out.println("Add a new item (add), view an existing item (view), delete an item (delete), or quit (quit)");
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
                    System.out.println("Add a Priority: high | medium | low");
                    String priority = input.nextLine();
                    System.out.println("Is this completed?");
                    String completed = input.next().toLowerCase();
                    manager.addToList(description, priority, completed);
                    break;

                case "view":
                    manager.view();
                    break;

                case "delete":
                    System.out.println("Enter a task ID ");
                    int idInput = input.nextInt();
                    manager.delete(idInput);
                    break;

                default:
                    System.out.println("Please enter a valid argument");
            }
        }

        input.close();
    }
}
