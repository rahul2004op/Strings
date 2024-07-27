package strings;

import java.util.*;
public class StringBuilder_Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the stringbuilder :");
        StringBuilder sb=new StringBuilder(sc.nextLine());


        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch>=(char)65 && ch<=(char)90){
                ch+=(char)32;
                sb.setCharAt(i, ch);

            }
            else if(ch>=(char)97 && ch<=(char)122){
                ch-=(char)32;
                sb.setCharAt(i, ch);

            }
        }

        System.out.println(sb);
    }
}
