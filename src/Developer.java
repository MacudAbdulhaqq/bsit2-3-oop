public class Developer extends Employee{
    private String programmingLanguage;
    private int projectsCompleted;

    public Developer(String name, int id, double salary, String department, String programmingLanguage, int projectsCompleted){
        super(name, id, salary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + " joined as a " + programmingLanguage + " Developer");
    }

    @Override
    public double calculateSalary(){
        System.out.println("Monthly Salary: $" + (baseSalary + (projectsCompleted*1000)));
        return(baseSalary + (projectsCompleted*1000));
    }

    @Override
    public void work(){
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}
