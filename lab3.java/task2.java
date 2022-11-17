import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Second task
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = reader.nextLine();
        System.out.println("Number of characters in your name is: " + name.length());
    }
}
