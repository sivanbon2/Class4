import java.io.IOException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        //EX-1
        /*
        * A JavaBean is still a POJO but introduces a strict set of rules around how
        * we implement it:
        * 1. Access levels – our properties are private and we expose getters and setters
        * 2. Method names – our getters and setters follow
        * the getX and setX convention (in the case of a boolean, isX can be
        * used for a getter)
        * 3. Default Constructor – a no-argument constructor must be present so
        * an instance can be created without providing arguments, for
        * example during deserialization
        * Serializable – implementing the Serializable interface allows us to
        * store the state
        * You can find more info here -
        * https://stackoverflow.com/questions/3295496/what-is-a-javabean-exactly*/

        //EX -2
        /*
        * No - We can use Design patterns in any language Although there are Design patterns
        * Which are suitable for specific languages (POJO & Java beans)
        * */

        //EX-3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        Singleton.getInstance().writeToFile(scanner.next());
        System.out.println("Enter your age");
        Singleton.getInstance().writeToFile(scanner.next());
        System.out.println("Enter your address");
        Singleton.getInstance().writeToFile(scanner.next());
        System.out.println("Enter your phone number");
        Singleton.getInstance().writeToFile(scanner.next());
        System.out.println("Thanks");

        //EX-4

        //EX-5
        //git config  --global user.email "sivanbon2@gmail.com"
        //git config  --global user.name "sivanbon2"
        //git clone https://github.com/SeleniumHQ/selenium.git

        //EX-6
        // Repo https://github.com/sivanbon2/Class4

        //EX-7
        /*
        * Maven is an automation and management tool developed by Apache Software Foundation.
        * It is written in Java Language to build projects written in C#, Ruby, Scala, and other languages.
        * It allows developers to create projects, dependency, and documentation using Project
        *  Object Model and plugins.*/
    }
}
