public class Manager extends Employee{
    private double bonus;
    private int teamSize;

    public Manager(String name, int id, double salary, String department, double bonus, int teamSize){
        super(name, id, salary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + " has been promoted to Manager");
    }

    @Override
    public double calculateSalary(){
        System.out.println("Monthly Salary: $" + (baseSalary + bonus));
        return(baseSalary + bonus);
    }

    @Override
    public void work(){
        super.work();
        System.out.println(name + " is managing a team of " + teamSize + " employees");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize + " employees");
    }
}
