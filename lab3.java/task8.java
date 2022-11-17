import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//Eight task
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = reader.nextLine();
        if (palindrom(word)) {
            System.out.println("The word is a palindrome!");
        }
        else {
            System.out.println("The word is not a palindrome!");
        }

    }
    public static boolean palindrom(String word){
        int length = word.length();
        String reversed = "";
        for (int i= length-1; i >= 0; i-- )  {
            reversed+=word.charAt(i);
        }

        return word.equals(reversed);
    }
}