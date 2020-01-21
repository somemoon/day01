package ApiDemo.ArrayList;

public class demoEquals01 {
    public static void main(String[] args) {
        String ste1="Hello";
        String str2="Hello";
        char[]charAarray={'H','e','l','l','o'};
        System.out.println(ste1.equals(str2));
        String str3="helLo";
        System.out.println(ste1.equalsIgnoreCase(str3));
    }
}
