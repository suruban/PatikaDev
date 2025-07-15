//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu Girin: ");
        int weight = scanner.nextInt();
        System.out.print("Boyunuzu (metre cinsinden) Girin: ");
        double height = scanner.nextDouble();
        if (height != (double)0.0F && weight != 0) {
            double bodyIndex = (double)weight / (height * height);
            System.out.println("Vücut Kitle İndeksiniz: " + bodyIndex);
        } else {
            System.out.println("Kilonuzu veya boyunuzu sıfır giremezsiniz.");
        }

        scanner.close();
    }
}
