package todo;

// Class responsible for adding to do items
public class ToDo {
    int id = 0;// Used for tracking todos
    String description;
    String priority;
    char completed;

    public ToDo(int id, String description, String priority, char completed) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
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
        System.out.println("ID: " + this.id);
        System.out.println("Description: " + this.description);
        System.out.println("Priority: " + this.priority);
        System.out.println("Completed? " + this.completed);
    }
}
