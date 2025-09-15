public class Intern extends Employee{
    private String university;
    private boolean isFullTime;

    public Intern(String name, int id, double salary, String department, String university, boolean isFullTime){
        super(name, id, salary, department);
        this.university = university;
        this.isFullTime = isFullTime;
        System.out.println("Intern " + name + " from " + university + " has started");
    }

    @Override
    public double calculateSalary(){
        System.out.println("Monthly Salary: $" + baseSalary*0.5);
        return(baseSalary*0.5);
    }

    @Override
    public void work(){
        System.out.println(name + " is learning and assisting with tasks");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("University " + university);
        System.out.println("Full-time: " + isFullTime);
    }
}
