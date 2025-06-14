package todo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ToDo> toDoItems = new ArrayList<>();

    public static void main(String[] args) {
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
                    String priority = input.nextLine();
                    System.out.println("Is this completed?");
                    char completed = input.next().charAt(0);
                    add(description, priority, completed);
                    break;

                case "view":
                    view();
                    break;

                default:
                    System.out.println("Please enter a valid argument");
            }
        }

        input.close();
    }

    // Method for when "Add" is entered by user
    public static void add(String description, String priority, char completed) {
        var newToDo = new ToDo(description, priority, completed);
        toDoItems.add(newToDo);
    }

    // Method for when "View" is entered by user
    public static void view() {
        // Checks if list is empty
        if (toDoItems.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            for (int i = 0; i < toDoItems.size(); i++) {
                ToDo item = toDoItems.get(i); // used to iterate and print
                System.out.println("ID: " + item.id + "\tDescription: " + item.description + "\tPriority: " + item.priority + "\tIs Completed? " + item.completed);
            }
        }
    }

    // Method for deleting item
    public static void delete(String id) {
        System.out.println("placeholder");
    }
}
