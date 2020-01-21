package ApiDemo.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer>lsit=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            lsit.add(num);
            System.out.println(lsit);
        }
        for (int i = 0; i < lsit.size(); i++) {

        }
    }
}
