package todo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Global variable for ID tracking
        int id = 0;
        // Creating an instance
        ToDo toDo1 = new ToDo(id + 1);

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our To Do tracker!");
        System.out.println();

        // Initial prompt for user
        System.out.println("Please create your first To Do!");

        System.out.println("Enter a task description");
        String description = input.nextLine();
        toDo1.setDescription(description);

        System.out.println("Enter a task priority");
        String priority = input.nextLine();
        toDo1.setPriority(priority);

        System.out.println("Task Completed? (Y or N)");
        char completed = input.next().charAt(0);
        toDo1.setCompleted(completed);

        toDo1.getToDo();
    }
}
