import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//Fifth task
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = reader.nextLine();
        System.out.println("Enter second word: ");
        String word2 = reader.nextLine();
        int isFound = word1.indexOf(word2);
        if(isFound != -1){
            System.out.println("The word " + word2 + " is found in word " + word1);
        }else
        {
            System.out.println("The word " + word2 + " is not found in word " + word1);
        }}}
