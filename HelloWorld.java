package exercises;
import java.util.Scanner;

public class HelloWorld {
    static Scanner input = new Scanner(System.in);
    static String name = input.nextLine();

    public static void main(String[] arg){
        System.out.println("Hello, what is your name:");

        System.out.println("Hello " + name);
    }

}
