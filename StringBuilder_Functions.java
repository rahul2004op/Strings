package strings;

public class StringBuilder_Functions {
    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder a=new StringBuilder("xyz");
        System.out.println(a);

        StringBuilder x=new StringBuilder();
        System.out.println(x.length());
        System.out.println(x.capacity());

        StringBuilder c=new StringBuilder(10);
        System.out.println(c.capacity());

        System.out.println("comparing stringBuilders");
        System.out.println(sb.compareTo(a));

        System.out.println("reverse stringbuilder");
        System.out.println(sb.reverse());

        System.out.println("append function");
        System.out.println(sb.append("123"));
        System.out.println(sb.append(a));

        System.out.println("deleteCharAt function");
        System.out.println(sb.deleteCharAt(2));

        System.out.println("delete character in range");
        System.out.println(sb.delete(1,5));

        System.out.println("insert at perticular location");
        System.out.println(sb.insert(3,"lkj"));

    }
}
