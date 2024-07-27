package strings;
public class Multiply_strings {
    public static void main(String args[]){
        String num1="10";
        String num2="20";

        int n=Integer.parseInt(num1);
        int m=Integer.parseInt(num2);

        int c=n*m;

        
        String str = Integer.toString(c);
        System.out.println(str);

    }
}
