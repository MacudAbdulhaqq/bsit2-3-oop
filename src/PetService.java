public class PetService{
    private static final double BASE_FEE = 50.0;
    private static final double VACCINATION_FEE = 25.0;
    private static final double GROOMING_FEE = 30.0;

    public double calculateFee(){
        return BASE_FEE;
    }

    public double calculate(boolean withVaccination){
        if (withVaccination) {return BASE_FEE + VACCINATION_FEE;}
        return BASE_FEE;
    }

    public double calculate(boolean withVaccination, boolean withGrooming){
        double fee = BASE_FEE;
        if (withVaccination) { fee += VACCINATION_FEE;}
        if (withGrooming) { fee += GROOMING_FEE;}
        return fee;
    }

    public double calculateFee(String emergencyType){
        return 200;
    }

    public static void main(String[] args){
        PetService service = new PetService();

        System.out.println("Basic Checkup: $" + service.calculateFee());
        System.out.println("Checkup with Vaccination: $" + service.calculate(true));
        System.out.println("Full Service: $" + service.calculate(true, true));
        System.out.println("Emergency: $" + service.calculateFee("emergency"));
        System.out.println(" ");

        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);
        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("==========================");
        dog.displayInfo();
        System.out.println(" ");
        cat.displayInfo();
        System.out.println(" ");
        bird.displayInfo();
        System.out.println(" ");

        System.out.println("Training Session Started!");
        System.out.println("=========================");
        dog.performTrick();
        bird.performTrick();
    }
}

abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    public void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age);
        System.out.println(name + " says: " + makeSound());
    }
}

interface Trainable{
    void performTrick();
}

class Dog extends Pet implements Trainable{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public String makeSound(){
        return "Woof! Woof!";
    }

    @Override
    public void performTrick(){
        System.out.println("Training " + name + ": Sits and shakes hands");
    }
}

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Meow! Meow!";
    }
}

class Bird extends Pet implements Trainable{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Tweet! Tweet!";
    }

    @Override
    public void performTrick(){
        System.out.println("Training " + name + ": Flies in circles and lands on perch");
    }
}