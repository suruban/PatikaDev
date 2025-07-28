package closeNums;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class closeNums {
    public static void main(String[] args) {
        System.out.println("Liste Oluşturuluyor");
        ArrayList<Integer> list = new ArrayList<>(10);
        int minDiff = Integer.MAX_VALUE;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            list.add(num);
        }

        System.out.println(list);
        System.out.println("En yakın iki sayı");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int diff = Math.abs(list.get(i) - list.get(j));
                if (diff < minDiff) {
                    minDiff = diff;
                    sum = list.get(i);
                    sum2 = list.get(j);
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum2);


    }
}
