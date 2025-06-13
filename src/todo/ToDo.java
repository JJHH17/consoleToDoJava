package todo;

// Class responsible for adding to do items
public class ToDo {
    static int id = 0; // Used for tracking todos
    String description;
    String priority;
    char completed;

    public ToDo() {
        id++;
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
