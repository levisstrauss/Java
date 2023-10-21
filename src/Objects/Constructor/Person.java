package Objects.Constructor;

public class Person {
    private String name;
    private int age;


    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // main class
    public static void main(String[] args) {
        Person person = new Person("John", 20);

        System.out.println(person.name); // John
        System.out.println(person.age); // 20

    }
}

