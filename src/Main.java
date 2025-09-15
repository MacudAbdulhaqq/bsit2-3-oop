public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);

        manager.displayInfo();
        manager.work();
        manager.calculateSalary();
        System.out.println(" ");
        developer.displayInfo();
        developer.work();
        developer.calculateSalary();
        System.out.println(" ");
        intern.displayInfo();
        intern.work();
        intern.calculateSalary();
    }
}