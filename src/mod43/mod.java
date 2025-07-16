package mod43;
import java.util.Scanner;

public class mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int total = 0;
        int count = 0;

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }

        if (count > 0) {
            double ortalama = (double) total / count;
            System.out.println("0 ile " + sayi + " arasındaki 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("0 ile " + sayi + " arasında 3 ve 4'e tam bölünen sayı yok.");
        }
        scanner.close();
    }
}