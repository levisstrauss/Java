## Welcome to java programing language

1. Fundamentals


     - Types
     - Control flow
     - Clean Code
     - Finding and fixing bugs
     - Packing your application
---
      We use variables to temporary store data in memory.
      -- Primitive types---
        1. byte
        2. short
        3. int
        4. long
        5. float
        6. double
        7. boolean
        8. char

      --- Reference types ---
        1. String
        2. Array
        3. Class
        4. Interface
        5. Enum
        6. Lambda
        7. Annotation
        8. Optional
        9. Object
---
      ---- String ----   

      The String type in java have several built-in function
      that we can use to perform different operations on strings.
      - equals() -> to compare two strings
      - length() -> to get the length of a string
      - toUpperCase() -> to convert a string to upper case
      - toLowerCase() -> to convert a string to lower case
      - trim() -> to remove white spaces from the beginning and end of a string
      - replace(a, b) -> to replace a character with another character
      - startsWith() -> to check if a string starts with a specific prefix
      - endsWith() -> to check if a string ends with a specific suffix
      - charAt() -> to get a character at a specified index
      - indexOf() -> to get the index of a specified character
      - lastIndexOf() -> to get the index of a specified character, 
        searching backward from the end of the string
      - substring() -> to get a substring of a string
      - split() -> to split a string into an array of substrings
      - join() -> to join an array of strings into one string
      - format() -> to format strings
      - valueOf() -> to convert other types to strings
---
        ---- Array ----

        One and two dimensional arrays
        Escape sequences
        Constants
        Arithmetic expressions: +, -, *, /, %, ++, --
        x++, x--, ++x, --x, x+y, x-y, x*y, x/y, x%y
        Assignment operators: =, +=, -=, *=, /=, %=
        Relational operators: ==, !=, >, <, >=, <=
        Logical operators: &&, ||, !
        Conditional operator: ? :
--- 
      ----- Math ---
      
        Math.max(x,y)
        Math.min(x,y)
        Math.sqrt(x)
        Math.abs(x)
        Math.random()
        Math.round(Math.random() * 100)
        Math.ceil(x)
        Math.floor(x)
        Math.pow(x,y)
        Math.PI
        Math.E
---
      ----- Control flow -----
        if
        if-else
        if-else if-else
        switch
        while
        do-while
        for
        for-each
        break
        continue
        return
        try-catch-finally
        throw
        throws
---
      ----- Finding and fixing bugs -----

          Syntax errors
          Runtime errors
          Logical errors
---
      ----- Clean Code -----

          Naming conventions
          Comments
          Formatting
          Programming practices
---
      ----- Packing your java code -----

          File -> Project Structure -> Artifacts -> + -> JAR -> From modules with dependencies
            -> Main class -> OK -> Apply -> OK
            Build -> Build Artifacts -> Build
            java -jar out/artifacts/HelloWorld_jar/HelloWorld.jar

            Open it in the terminal
            java -jar HelloWorld.jar
---
2. Object-Oriented programming


      - Classes
      - Objects
      - Constructors
      - Fields
      - Methods
      - Method overloading
      - Method overriding
      - Access modifiers
      - Packages
      - this
      - static
      - final
      - abstract
      - interface
      - inheritance
      - polymorphism
      - encapsulation
      - abstraction
---
        ----- Classes -----
    
            A class is a blueprint for creating objects.
            A class contains fields (variables) and methods to describe the behavior of an object.
    
            public class Person {
            String name;
            int age;
            }
    
            Person person1 = new Person();
            person1.name = "John";
            person1.age = 20;
    
            Person person2 = new Person();
            person2.name = "Mary";
            person2.age = 25;
    
            System.out.println(person1.name); // John
            System.out.println(person2.name); // Mary
---
        ------- objects ----
    
            An object is an instance of a class.
            We can create many objects from a class.
    
            public class Person {
            String name;
            int age;
            }
    
            Person person1 = new Person();
            person1.name = "John";
            person1.age = 20;
    
            Person person2 = new Person();
            person2.name = "Mary";
            person2.age = 25;
    
            System.out.println(person1.name); // John
            System.out.println(person2.name); // Mary
---
        --- Encapsulation ---
 
            Encapsulation is one of the four fundamental OOP concepts.
            The other three are inheritance, polymorphism, and abstraction.
            Encapsulation in Java is a mechanism of wrapping the data (variables) 
            and code acting on the data (methods) together as a single unit.
            In encapsulation, the variables of a class will be hidden from other
            classes, and can be accessed only through the methods of their current class.
            Therefore, it is also known as data hiding.
            To achieve encapsulation in Java −
            Declare the variables of a class as private.
            Provide public setter and getter methods to 
            modify and view the variables values.
    
            public class Person {
            private String name;
            private int age;
    
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
            }
    
            Person person = new Person();
            person.setName("John");
            person.setAge(20);
    
            System.out.println(person.getName()); // John
            System.out.println(person.getAge()); // 20

            The this keyword refers to the current object in a method or constructor.
---
        ---- Abstraction -----
        
            Abstraction is one of the four fundamental OOP concepts.
            The other three are inheritance, polymorphism, and encapsulation.
            Abstraction in Java is a process of hiding the implementation details 
            and showing only functionality to the user.
            Another way, it shows only essential things to the user and hides the internal details,
            for example, sending SMS where you type the text and send the message.
            You don't know the internal processing about the message delivery.
            Abstraction lets you focus on what the object does instead of how it does it.
            Ways to achieve abstraction in Java
            Abstract class (0 to 100%)
            Interface (100%)
    
            public abstract class Animal {
            public abstract void makeSound();
            }
    
            public class Dog extends Animal {
            @Override
            public void makeSound() {
            System.out.println("Bark");
            }
            }
    
                Animal animal = new Dog();
                animal.makeSound(); // Bark
---
        --- Coupling ---
            
            Coupling refers to the degree of direct knowledge that one element has of another.
            In other words, how often do changes in class A force related changes in class B.
            Loose coupling is a design goal that seeks to reduce the inter-dependencies 
            between components of a system with the goal of reducing the risk that changes 
            in one component will require changes in any other component.
            Loose coupling is achieved by:
            - Using standard protocols such as TCP/IP instead of custom protocols.
            - Avoiding assumptions about message representation (e.g., serialization) 
            and data encoding (e.g., big-endian or little-endian byte ordering).
            - Limiting the assumptions that components make about each other.
            - Decoupling is often achieved with design patterns such as the mediator pattern.
            - Decoupling is particularly important in distributed systems architecture 
            since it can help avoid single points of failure.
            - Decoupling is also an important consideration for testability purposes.
            - Decoupling is the process of separating the dependencies between modules.
            - The goal of decoupling is to reduce the risk that a change made in one module 
            will require changes in other modules.
            - Decoupling is achieved by using design patterns such as the mediator pattern.
            - Decoupling is particularly important in distributed systems architecture 
            since it can help avoid single points of failure.
            - Decoupling is also an important consideration for testability purposes.
---
        --- Constructor ---

            A constructor in Java is a special method that is used to initialize objects.
            The constructor is called when an object of a class is created.
            It can be used to set initial values for object attributes:

            public class Person {
            String name;
            int age;
    
            public Person(String name, int age) {
            this.name = name;
            this.age = age;
            }
            }
    
            Person person = new Person("John", 20);
    
            System.out.println(person.name); // John
            System.out.println(person.age); // 20

            A constructor can also be empty: and overloaded
---
        --- Method overloading ---

            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.
            Method overloading is a feature that allows us to have more than one method 
            with the same name, so long as we use different parameters.

            public class Calculator {
            public int add(int x, int y) {
            return x + y;
            }
    
            public int add(int x, int y, int z) {
            return x + y + z;
            }
            }
    
            Calculator calculator = new Calculator();
    
            System.out.println(calculator.add(1, 2)); // 3
            System.out.println(calculator.add(1, 2, 3)); // 6
---
        --- Static keyword ---
   
            The static keyword is used to create variables and methods  
            that will exist independently 
            of any instance created for the class.
            Static variables
            Static variables are also known as class variables.
            Local variables are only visible to methods in which they are declared.
            Static variables are visible for all classes.
            Static variables are stored in the static memory.
            Static variables are initialized when the program starts.
            Static variables can be accessed by calling with the class name 
            ClassName.VariableName.
            Static methods
            Static methods can be called without creating objects.
            Static methods can only access static variables.
            Static methods are usually used to access static variables.
            Static methods can be accessed by calling with the class name 
            ClassName.MethodName.
            Static methods cannot access instance variables and instance methods directly.
            They are usually used for operations that don't require any data from an instance of the class 
            (from this).
            Static methods have several restrictions:
            - They can only directly call other static methods.
            - They can only directly access static data.
            - They cannot refer to this or super in any way.
            - They cannot be overridden but can be overloaded.
            - They cannot access instance variables or instance methods directly.
            - They cannot declare abstract methods.
            - They cannot declare instance fields.
            - They cannot declare final methods.
            - They cannot declare synchronized methods.
            - They cannot declare transient fields.
            - They cannot declare volatile fields.
            - They cannot declare native methods.
            - They cannot declare strictfp methods.
            - They cannot declare enum methods.
            - They cannot declare annotation methods.
            - They cannot declare public methods of a private class.
            - They cannot declare protected methods of a protected class.
            - They cannot declare protected or public fields of an interface.
            - They cannot declare static initializer blocks.
            - They cannot declare non-static initializer blocks.
            - They cannot declare constructors.
            - They cannot declare the finalize() method.
            - They cannot declare the clone() method.
            - They cannot declare the getClass() method.
            - They cannot declare the notify() method.
            - They cannot declare the notifyAll() method.
            - They cannot declare the wait() method.
            - They cannot declare the wait(long) method.
            - They cannot declare the wait(long, int) method.
            - They cannot declare the equals() method.
            - They cannot declare the hashCode
---
        ---- Inheritance ----

            Inheritance in Java is a mechanism in which one object acquires all the properties 
            and behaviors of a parent object.
            The idea behind inheritance in Java is that you can create new classes that are built upon 
            existing classes.
            When you inherit from an existing class, you can reuse methods and fields of the parent class.
            Moreover, you can add new methods and fields in your current class also.
            Inheritance represents the IS-A relationship, also known as a parent-child relationship.
            In Java, a class can inherit attributes and methods from another class.
            The class that inherits the properties is known as the sub-class or the child class.
            The class from which the properties are inherited is known as the super-class or the parent class.
            To inherit from a class, use the extends keyword.
            We can inherit fields and methods from one class to another class.

--- 
        ---- Upcasting & Downcasting ----

            Casting an object to one of its superclasses is called upcasting.
            Downcasting is casting a superclass to one of its subclasses.
            Upcasting is always safe because a subclass object is also a superclass object.
            Downcasting is not always safe because a superclass object is not necessarily a 
            subclass object.
            To check the type of an object, use the instanceof operator.
            The instanceof operator returns true if an object is an instance of a class,
            or an instance of a subclass of that class, or an instance of a class that implements 
            a particular interface.       
---
        --- Polymorphism ---

            Polymorphism means "many forms", and it occurs when we have many classes that are related 
            to each other by inheritance.
            Inheritance lets us inherit attributes and methods from another class. 
            Polymorphism uses those methods to perform different tasks. 
            This allows us to perform a single action in different ways.
            For example, think of a superclass called Animal that has a method called animalSound(). 
            Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation 
            of an animal sound (the pig oinks, and the cat meows, etc.):
            Another example: 
            A superclass Vehicle with a method called speed() and two subclasses Car and Bicycle 
            that also have a method called speed(). 
            For these methods to work differently, we need to create a separate implementation for each class.
            This is called polymorphism.
            Polymorphism uses those methods to perform different tasks. 
            This allows us to perform a single action in different ways.
            For example, think of a superclass called Animal that has a method called animalSound(). 
            Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation 
            of an animal sound (the pig oinks, and the cat meows, etc.):
            Another example: 
            A superclass Vehicle with a method called speed() and two subclasses Car and Bicycle 
            that also have a method called speed(). 
            For these methods to work differently, we need to create a separate implementation for each class.
            This is called polymorphism.
            Polymorphism uses those methods to perform different tasks. 
            This allows us to perform a single action in different ways.
            For example, think of a superclass called Animal that has a method called animalSound(). 
            Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation 
            of an animal sound (the pig oinks, and the cat meows, etc.):
            Another example: 
            A superclass Vehicle with a method called speed() and two subclasses Car and Bicycle 
            that also have a method called speed(). 
            For these methods to work differently, we need to create a separate implementation for each class.
            This is called polymorphism.
            Polymorphism uses those methods to perform different tasks. 
            This allows us to perform a single action in different ways.
            For example, think of a superclass called Animal that has a method called animalSound().
            Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation
            of an animal sound (the pig oinks, and the cat meows, etc.):
            Another example:
            A superclass Vehicle with a method called speed() and two subclasses Car and Bicycle
            that also have a method called speed().
            For these methods to work differently, we need to create a separate implementation for each class.
            This is called polymorphism.

            Note: the polymorphism is achieved by method overriding.
---

        --- Abstract class ---

            An abstract class is a class that is declared abstract—it may or may not include abstract methods.
            Abstract classes cannot be instantiated, but they can be subclassed.
            An abstract method is a method that is declared without an implementation (without braces, 
            and followed by a semicolon):
            Abstract classes may have static fields and static methods.
            Abstract classes can have a constructor and it will be called when a subclass is instantiated.
            An abstract class can implement an interface and not implement its methods. 
            In this case, the subclass has to implement the interface methods.
            An abstract class can extend another Java

        --- Interface ---

            An interface is a completely "abstract class" that is used to group related methods with empty bodies.
            To access the interface methods, the interface must be "implemented" (kinda like inherited) 
            by another class with the implements keyword (instead of extends). 
            The body of the interface method is provided by the "implement" class.
            Interfaces are useful when you do not want to inherit from a class, 
            but still, want to declare methods.
            Another example: 
            A superclass Vehicle with a method called speed() and two subclasses Car and Bicycle 
            that also have a method called speed(). 
            For these methods to work differently, we need to create a separate implementation for each class.
            This is called polymorphism.
            Polymorphism uses those methods to perform different tasks. 
            This allows us to perform a single action in different ways.
            For example, think of a superclass called Animal that has a method called animalSound(). 
            Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation 
            of an animal sound (the pig oinks, and the cat meows, etc.):
            Another example: 
            A superclass Vehicle with a method called speed() and two subclasses Car and Bicycle 
            that also have a method called speed(). 
            For these methods to work differently, we need to create a separate implementation for each class.
            This is called polymorphism.
            Polymorphism uses those methods to perform different tasks. 
            This allows us to perform a single action in different ways.
            For example, think of a superclass called Animal that has a method called animalSound(). 
            Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation 
            of an animal sound (the pig oinks, and the cat meows, etc.):
            Another example: 
            A superclass Vehicle with a method called speed() and two subclasses Car and Bicycle 
            that also have a method called speed(). 
            For these methods to work differently, we need to create a separate implementation for each class.
            This is called polymorphism.
            Polymorphism uses those methods to perform different tasks. 
            This allows us to perform a single action in different ways.
            For example, think of a superclass called Animal that has a method called animalSound(). 
            Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation
            of an animal sound (the pig oinks, and the cat meows, etc.):
            
            Note: The p
             
     
            

     
        
     
       
  
    






