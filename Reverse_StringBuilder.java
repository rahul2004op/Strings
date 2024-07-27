package strings;

import java.util.*;
public class Reverse_StringBuilder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the stringbuilder :");
        StringBuilder sb=new StringBuilder(sc.nextLine());

        System.out.println("reverse of stringbuilder");
      
        int n=sb.length();
        for(int i=0;i<n/2;i++){
            int j=n-i-1;
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(j);
        
            sb.setCharAt(i, ch2);
            sb.setCharAt(j,ch1);
        
        }
        System.out.println(sb);

        System.out.println("\n 2nd method ");
        int i=0;
        int j=n-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
