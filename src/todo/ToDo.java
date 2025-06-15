package todo;

// Class responsible for adding to do items
public class ToDo {
    private static int nextId = 1; // Allows us to dynamically increase new ID
    public int id; // Used for tracking todos
    String description;
    String priority;
    String completed;

    public ToDo(String description, String priority, String completed) {
        this.id = nextId++;
        setDescription(description);
        setPriority(priority);
        setCompleted(completed);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        if (priority.equalsIgnoreCase("high") || priority.equalsIgnoreCase("medium") || priority.equalsIgnoreCase("low")) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Invalid priority. Use: high | medium | low");
        }
    }

    public void setCompleted(String completed) {
        if (completed.equalsIgnoreCase("yes") || completed.equalsIgnoreCase("no")) {
            this.completed = completed;
        } else {
            throw new IllegalArgumentException("Invalid completion status. Use: yes | no");
        }
    }

    // Fetches Task item
    public void getToDo() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + this.description);
        System.out.println("Priority: " + this.priority);
        System.out.println("Completed? " + this.completed);
    }
}