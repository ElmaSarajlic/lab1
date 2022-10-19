public class exercise1 {
 
  
    public static void main(String[] args) {
        System.out.println("Elma Sarajlic");
    }
    
}
 
 
 
public class exercise2 {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("and all people in the world");
    }
    
}
 
 
public class exercise3 {
    
    public static void main(String[] args) {
 
        int numberOfSeconds =60*60*24*365;
        System.out.println("There are " + numberOfSeconds + " in the year ");
        
        
        
    }
    
}
 
 
 
import java.util.Scanner;
public class exercise4 {
    
    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        System.out.println("Type a number: ");
        int num1=Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2=Integer.parseInt(reader.nextLine());
        int sum=num1+num2;
        System.out.println("The sum is  "+sum );
        
        
    }
    
}
 
 
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
