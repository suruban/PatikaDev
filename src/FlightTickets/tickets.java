package FlightTickets;

import java.util.Scanner;

public class tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Mesafe Giriniz (km): ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk Tipini Seçiniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int tripType = scanner.nextInt();

        // Input validation
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Geçersiz girdi!");
            return;
        }

        double pricePerKm = 0.10;
        double basePrice = distance * pricePerKm;
        double discountRate = 0.0;

        // Age-based discount
        if (age < 12) {
            discountRate = 0.50;
        } else if (age <= 24) {
            discountRate = 0.10;
        } else if (age > 65) {
            discountRate = 0.30;
        }

        double discountedPrice = basePrice - (basePrice * discountRate);

        // Round-trip discount
        if (tripType == 2) {
            discountedPrice -= discountedPrice * 0.20;
            discountedPrice *= 2;
        }

        System.out.printf("Toplam Bilet Ücreti: %.2f TL\n", discountedPrice);
    }
}