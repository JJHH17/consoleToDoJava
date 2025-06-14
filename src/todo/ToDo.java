package todo;

// Class responsible for adding to do items
public class ToDo {
    public int id; // Used for tracking todos
    String description;
    String priority;
    char completed;

    // Private variable for increasing ID
    private static int incId = 1;

    public ToDo(String description, String priority, char completed) {
        this.id = incId++; // Increments ID
        setDescription(description);
        setPriority(priority);
        setCompleted(completed);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setCompleted(char completed) {
        this.completed = completed;
    }

    // Fetches Task item
    public void getToDo() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + this.description);
        System.out.println("Priority: " + this.priority);
        System.out.println("Completed? " + this.completed);
    }
}
