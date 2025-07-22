package typeCast;

import java.util.Scanner;

public class typeCast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz (int): ");
        int integerNumber = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz (double): ");
        double decimalNumber = scanner.nextDouble();

        // Otomatik dönüşüm: int → double
        double convertedToDouble = integerNumber;

        // Zorunlu (explicit) dönüşüm: double → int
        int convertedToInt = (int) decimalNumber;

        System.out.println("\n--- Dönüştürme Sonuçları ---");
        System.out.println("Tam sayının double'a dönüşmüş hali: " + convertedToDouble);
        System.out.println("Ondalıklı sayının int'e dönüşmüş hali: " + convertedToInt);

        scanner.close();
    }
}
