package strings;

public class Reverse_each_word_in_sentense {

    public static void reverse(StringBuilder sb, int i, int j){
        int n=sb.length();
        i=0;
        j=n-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        
    }
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("I am Rahul");

        int j=0;
        int i=0;
        int n=sb.length();
        while(j<n){
            if(sb.charAt(i)!=' '){
                j++;
            }
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1);
        System.out.println(sb);
        
    }
}

