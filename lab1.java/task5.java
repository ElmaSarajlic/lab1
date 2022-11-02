import java.util.Scanner;
public class exercise5 {

    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        System.out.println("Type a number: ");
        int num=Integer.parseInt(reader.nextLine());
        if (num>0)
        {
            System.out.println("number is positive" );
        }
        else
        {
            System.out.println("Number is negative");
        }



    }
}
