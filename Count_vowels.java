package strings;

import java.util.*;
public class Count_vowels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string :");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' ||ch== 'i' ||ch== 'o' ||ch== 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }
        System.out.println("number of vowels in the string :"+count);
    }
}
