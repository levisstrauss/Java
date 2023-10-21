package Fundamentals;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Fundamentals {

    public static void main(String[] args) {

        //------------- Primitive types ------------------>

        int myNumber = 88;
        short myShort = 847;
        long myLong = 3_434_343_434_343_434_343L;

        double myDouble = 7.3243;
        float myFloat = 324.3f;

        char myChar = 'y';
        boolean myBoolean = false;

        byte myByte = 127;

        //----Reference types to store complex object--------->

        Date now = new Date();

        //----  String and some of the built in method --------->

        String message = "Hello world!";
        char t = message.charAt(0);
        int p = message.length();
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        String trim_message = message.trim();
        String replaced_message = message.replace("a", "b");

        //----------- Escape Sequence --------------------------->

        String msg = "c:\\Window\\...";
        String msg1 = "c:\nWindow\\...";
        String msg2 = "c:\tWindow\\...";

        //---------------- Arrays ---------------------->

         int[] numbers = new int[5];
         numbers[0] = 1;
         numbers[1] = 1;
         numbers[2] = 1;
        int[] numbers1 = {1, 10, 52};
        Arrays.sort(numbers);


        // Two dimension
        int [][] number = new int [2][3];
        int [][] number1 = {{1,2, 3}, {4, 5, 6}};

        number[0][0] = 1;

        //---------------- Constants  ---------------------->
        final float PI = 3.14F;

        //---------------- Casting  ---------------------->

        int my_num = 10;
        double my_double = (int)my_num;
        String x = "1";
        Short.parseShort(x);
        Integer.parseInt(x);
        Float.parseFloat(x);

        //----------- Formatting numbers ----------------->

        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

        //----------- Read input  ----------------->
        Scanner scanner = new Scanner(System.in); // Or we can use a print statement
        System.out.print("Name: ");
        byte age = scanner.nextByte();
        scanner.nextLine();
        scanner.next();
        scanner.nextBoolean();
        scanner.nextFloat();
        scanner.nextLong();
        scanner.nextDouble();
        scanner.nextShort();
        scanner.nextByte();
        System.out.println("Age: " + age);

        //----------- If statement  ----------------->
        if (age > 18) {
            System.out.println("Adult");
        } else if (age > 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Kid");
        }

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); // We can use this to simplify the if statement

        //----------- Ternary operator  ----------------->

        String className = income > 100_000 ? "First" : "Economy";

        //----------- Switch statement  ----------------->

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

        //----------- For loop  ----------------->
        // Use for loop when you know the number of iterations

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
        }

        //----------- While loop  ----------------->
        // Use while loop when you don't know the number of iterations

        int i = 0;
        while (i < 5) {
            System.out.println("Hello World " + i);
            i++;
        }

        //----------- Do while loop  ----------------->
        // Use do while loop when you want to execute the code at least once
        do {
            System.out.println("Hello World " + i);
            i++;
        } while (i < 5);

        //----------- For each loop  ----------------->
        // Use for each loop when you want to iterate over an array or collection

        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //----------- Break and continue  ----------------->
        // Use break to exit the loop
        // Use continue to skip the current iteration

        String[] fruits1 = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits1) {
            if (fruit.equals("Mango")) {
                continue;
            }
            System.out.println(fruit);
        }

        Scanner scanner1 = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner1.next().toLowerCase();
            System.out.println(input);
        }


        //----------- Built your java code  ----------------->
        /*
          File -> Project Structure -> Artifacts -> + -> JAR -> From modules with dependencies
            -> Main class -> OK -> Apply -> OK
            Build -> Build Artifacts -> Build
            java -jar out/artifacts/HelloWorld_jar/HelloWorld.jar

            Open it in the terminal
            java -jar HelloWorld.jar

         */

       //------- Printing results ------------------------>

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
        //---
        System.out.println(now);
        //---
        System.out.println(message);
        //-----
        System.out.println(Arrays.toString(numbers)); // The arrays class
        System.out.println(numbers.length); // To get the length
        //--- multi dimension
        System.out.println(Arrays.deepToString(number));// To print two-dimensional arrays
        System.out.println(my_double);
    }
}
