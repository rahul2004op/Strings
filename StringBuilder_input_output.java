package strings;

import java.util.*;

public class StringBuilder_input_output {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the stringBuilber :");
        StringBuilder sb=new StringBuilder(sc.nextLine()); //input

        System.out.println(sb);         //output

        StringBuilder sb2=new StringBuilder("Skills");

        System.out.println("new stringbuilder \n"+sb2);
        System.out.println("after setCharAt function");
        sb2.setCharAt(0,'a');
        System.out.println(sb2);
    }
}
