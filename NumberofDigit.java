package strings;
import java.util.*;
public class NumberofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        Long n=sc.nextLong();
        String s=n+"";  //1st method

        String str=Long.toString(n); //2nd method
        System.out.println("number of digits in the number :"+s.length());
        System.out.println("number of digits in the number :"+str.length());

        
 


    }   


}
