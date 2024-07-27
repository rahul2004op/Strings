package strings;
import java.util.*;
public class String_functions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string :");
        String str=sc.nextLine();

        System.out.println(str);
        System.out.println("character at index 4 :");
        System.out.println(str.charAt(4));

        int n=str.length();
        System.out.println("length of string :"+ n);

        System.out.println("index of Character");
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('z'));
        System.out.println("last index of character ");
        System.out.println(str.lastIndexOf('a'));

        String a="abc";
        String b="adc";
        System.out.println("new Strings :\n"+ a +"\n"+ b);
        System.out.println("compareTO");
        System.out.println("comparision of string\n"+ a.compareTo(b));

        String s="Physics Wallah";
        String s2="Skills";
        System.out.println("new string"+s);
        System.out.println(s.contains("phy"));
        System.out.println(s.startsWith("phy"));
        System.out.println(s.endsWith("lah"));

        System.out.println("toLowercase");
        System.out.println(s.toLowerCase());
        System.out.println("toUppercase");
        System.out.println(s.toUpperCase());

        System.out.println(s.concat(s2));

        System.out.println("substring method");
        System.out.println(s2.substring(1));
        System.out.println(s2.substring(1,5));
        System.out.println(s2.substring(1,1));
        System.out.println(s2.substring(1,3));

        
       
                




    }
}
