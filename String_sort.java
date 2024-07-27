package strings;

import java.util.*;;

public class String_sort {
    public static void main(String args[]){
        String str="rahul"; //for string 
        System.out.println(str);
        char ch[]=str.toCharArray();

        Arrays.sort(ch);
        System.out.println("sorted string");
        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println("\n\nnew stringBuilder");
        StringBuilder sb=new StringBuilder("physis");
        System.out.println(sb);

        char arr[]=sb.toString().toCharArray();

        Arrays.sort(arr);
        System.out.println("after sorting stringbuilder");
        for( char ele : arr){
            System.out.print(ele);
        }




    }
}
