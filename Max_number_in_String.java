package strings;
public class Max_number_in_String {

    public static String max(String a, String b){
        String s=purify(a);
        String t=purify(b);

        if(s.length()>t.length()){
            return a;
        }
        if(s.length()<t.length()){
            return b;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)){
                    return a;
                }
                else{
                    return b;
                }
            }
        }
        if(a.length()>=b.length()){
            return a;
        }
        else{
            return b;
        }
    }

    public static String purify(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
               return s.substring(i);
            }
        }
        return s;
    }


    public static void main(String args[]){
        String arr[]={"0001651351","2164984321","651065840","20135","0001522"};
        System.out.println("Array of String numbers");
        for(String ele : arr){
            System.out.print(ele+" ");
        }

        String maxs=arr[0];
        for(int i=1;i<arr.length;i++){
            maxs=max(maxs,arr[i]);
        }
        
        System.out.println("\n\ngreatest number is "+maxs);
    }
}
