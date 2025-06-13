package todo;

// Class responsible for adding to do items
public class ToDo {
    int id = 0;// Used for tracking todos
    String description;
    String priority;
    byte completed;

    public ToDo(int id, String description, String priority, byte completed) {
        this.id = id;
        this.description = description;
        this.priority = priority;
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
