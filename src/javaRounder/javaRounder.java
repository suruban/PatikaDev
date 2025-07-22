package javaRounder;

import java.util.Scanner;

public class javaRounder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalıklı Sayı Giriniz : ");
        double num = scanner.nextDouble();

        System.out.println("Yuvarlanan en yakın sayı :" + Math.round(num));
        System.out.println("Yuvarlanan en yukarıdaki sayı :" + Math.ceil(num));
        System.out.println("Yuvarlanan en aşşağıdaki sayı :" + Math.floor(num));
        scanner.close();
    }
}
