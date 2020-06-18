public class Task {
    String name;
    String description;
    Integer priority;
    Person person;

    Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Task(String name, String description, Integer priority) {
        this(name, description);
        this.priority = priority;
    }

    Task(String name, String description, Integer priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    boolean highPriority(int priority) {
        this.priority = priority;
        if (priority > 0) {
            System.out.println("High priority");
        }
        return true;
    }

    boolean mediumPriority(int priority) {
        this.priority = priority;
        if (priority == 0) {
            System.out.println("Medium priority");
        }
        return true;
    }

    boolean lowPriority(int priority) {
        this.priority = priority;
        if (priority < 0) {
            System.out.println("Low priority");
        }
        return true;
    }

    void showInfo() {
            System.out.println("Task: " + name);
            System.out.println("Description: " + description);
            System.out.println("Priority: " + priority);
            System.out.println("Person: " + person.firstName + " " + person.lastName);
    }

    void showInfoNoPerson() {
        System.out.println("Task: " + name);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);
    }

    void showInfoNoPersonNoPriority() {
        System.out.println("Task: " + name);
        System.out.println("Description: " + description);
    }


}
