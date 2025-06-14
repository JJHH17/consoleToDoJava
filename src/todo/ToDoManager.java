package todo;

import java.util.ArrayList;

// Class responsible for managing tasks
public class ToDoManager {
    static ArrayList<ToDo> toDoItems = new ArrayList<>();

    public void addToList(String description, String priority, char completed) {
        var newToDo = new ToDo(description, priority, completed);
        toDoItems.add(newToDo);
    }

    public void view() {
        // Checks if list is empty
        if (toDoItems.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            for (ToDo item : toDoItems) {
                System.out.println("ID: " + item.id + "\tDescription: " + item.description + "\tPriority: " + item.priority + "\tIs Completed? " + item.completed);
            }
        }
    }

    public void delete(int id) {
        boolean found = false;
        if (toDoItems.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        for (int i = 0; i < toDoItems.size(); i++) {
            if (toDoItems.get(i).id == id) {
                toDoItems.remove(i);
                System.out.println("Item ID: "+ id + " removed");
                found = true;
                break;
            }
        }

        // ID not existing check
        if (!found) {
            System.out.println("Task ID: " + id + " not found.");
        }
    }
}
