import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Seventh task
public class Main{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Proba");
        list.add("Test");
        list.add("Aminaaaa!");
        list.add("maj maj maj maj");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of words is: " + lengths);
    }
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for (String words : list) {
            lengths.add(words.length());
        }
        return lengths;
    }
}
