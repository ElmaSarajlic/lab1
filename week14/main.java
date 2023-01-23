package lab12;
import java.util.Scanner;
import lab12.personnel.Education;
import lab12.personnel.Employees;
import lab12.personnel.Person;

public class Main {

    public static void main(String[] args) {
        //excercise 1

//		Scanner reader = new Scanner(System.in);
//		System.out.print("Give a string: ");
//		String word = reader.nextLine();
//
//		isAWeekDay(word);
//		allVowels(word);
//		clockTime(word);

        //excercise 2
//		Person arto = new Person("Arto", Education.D);
//		System.out.println(arto);

        Employees university = new Employees();
        university.add(new Person("Matti", Education.D));
        university.add(new Person("Pekka", Education. GRAD));
        university.add(new Person("Arto", Education.D));
        university.print();

        university.fire (Education. GRAD);

        System.out.println("==");
        university.print();
    }

    public static boolean isAWeekDay(String string) {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is fine");
            return true;
        } else{
            System.out.println("The form is wrong");
            return false;
        }
    }

    public static boolean allVowels(String string) {
        if(string.matches("(a|e|i|o|u)*")){
            System.out.println("The form is fine");
            return true;
        } else{
            System.out.println("The form is wrong");
            return false;
        }
    }

    public static boolean clockTime(String string) {
        if(string.matches("(((0|1)[0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]")){
            System.out.println("The form is fine");
            return true;
        } else {
            System.out.println("The form is wrong");
            return false;
        }
    }

}