package findChar;

import java.util.ArrayList;
import java.util.Scanner;

public class findChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Listedeki 4 harfi bulmak için tahmin et");
        ArrayList<String> list = new ArrayList<>();
        while (list.size() < 4) {
            int rastgeleSayi = (int)(Math.random() * 26);
            String harf = String.valueOf((char) ('a' + rastgeleSayi));

            if (!list.contains(harf)) {
                list.add(harf);
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("Harf Giriniz: ");
            String charI = sc.nextLine();

            if(list.contains(charI)){
                System.out.println("Doğru Tahmin");
                list.set(list.indexOf(charI), "found");
            }

        }
        System.out.println(list);



    }
}
