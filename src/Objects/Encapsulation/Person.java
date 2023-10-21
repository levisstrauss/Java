package Objects.Encapsulation;

public class Person {

    // Now these cannot be accessed from outside the class
    private String name;
    private int age;


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
        Person person = new Person();
        person.setName("John");
        person.setAge(20);

        System.out.println(person.getName()); // John
        System.out.println(person.getAge()); // 20
    }
}

