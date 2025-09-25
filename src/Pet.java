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
        System.out.println(" ");
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
