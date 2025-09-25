public class Main {
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
        cat.displayInfo();
        bird.displayInfo();

        System.out.println("Training Session Started!");
        System.out.println("=========================");
        dog.performTrick();
        bird.performTrick();
    }
}
