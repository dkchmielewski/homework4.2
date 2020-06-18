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

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
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
