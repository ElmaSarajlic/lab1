import java.util.Scanner;
public class exercise6 {

    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        System.out.println("Type a number: ");
        int num1=Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2=Integer.parseInt(reader.nextLine());
        if(num1>num2)
        {
            System.out.println("Greater is: "+num1);
        }
        else if(num1<num2)
        {
            System.out.println("Greater is: "+num2);
        }
        else
        {
            System.out.println("Numbers are equal");
        }


    }

}