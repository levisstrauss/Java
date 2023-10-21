package Objects.Inheritance;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.name = "Bobby";
    }
}
