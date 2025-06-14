package todo;

// Class responsible for adding to do items
public class ToDo {
    private static int nextId = 1; // Allows us to dynamically increase new ID
    public int id; // Used for tracking todos
    String description;
    String priority;
    char completed;

    public ToDo(String description, String priority, char completed) {
        this.id = nextId++; // Increments ID
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

// TODO: Add handling of values in methods, user can only enter "complete", "ongoing", or "New" in progress
// TODO: Ensure user can only enter "p1, p2, p3, p4" entries in priority