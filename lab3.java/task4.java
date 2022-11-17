import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//Fourth task
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = reader.nextLine();
        System.out.println("Name written in reverse order: ");
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i)+" ");
        }}}
