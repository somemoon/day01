package ApiDemo.ArrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(i, i);
        }
        al.add(5, 2);
//        boolean test = al.add(2);
//        System.out.println(test);
        System.out.println(al);
    }
}
