package LeapYear;

import java.util.Scanner;

public class Leap  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yılı giriniz: ");
        int year = scanner.nextInt();

        boolean isLeap = false;

        // Artık yıl kontrolü
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // 100'e bölünen yıllar sadece 400'e tam bölünüyorsa artık yıldır
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                // 100'e bölünmeyen ama 4'e bölünen yıllar artık yıldır
                isLeap = true;
            }
        }


        if (isLeap) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
