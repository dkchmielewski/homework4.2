public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Daniel", "Chmielewski");
        Task task1 = new Task("Software update", "Update Android software", 4, person1);
        task1.showInfo();
        System.out.println("High priority? " + task1.highPriority());
        System.out.println("Medium priority? " + task1.mediumPriority());
        System.out.println("Low priority? " + task1.lowPriority());

        Person person2 = new Person("Jan", "Kowalski");
        Task task2 = new Task("Grade homework", "Grade computer science homework for 10 students",
                0, person2);
        System.out.println();
        task2.showInfo();
        System.out.println("High priority? " + task2.highPriority());
        System.out.println("Medium priority? " + task2.mediumPriority());
        System.out.println("Low priority? " + task2.lowPriority());

        Person person3 = new Person("Piotr", "Nowak");
        Task task3 = new Task("Do groceries", "Buy milk and bread", -4, person3);
        System.out.println();
        task3.showInfo();
        System.out.println("High priority? " + task3.highPriority());
        System.out.println("Medium priority? " + task3.mediumPriority());
        System.out.println("Low priority? " + task3.lowPriority());

        Task task4 = new Task("Repair car", "Fix the engine");
        System.out.println();
        task4.showInfoNoPersonNoPriority();

        Task task5 = new Task("Call clients", "Call at least 10 clients on the list",
                2);
        System.out.println();
        task5.showInfoNoPerson();
        System.out.println("High priority? " + task5.highPriority());
        System.out.println("Medium priority? " + task5.mediumPriority());
        System.out.println("Low priority? " + task5.lowPriority());

    }
}
