package ChineseZodiac;

import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılı alınır
        System.out.print("Doğum yılınızı girin: ");
        int birthYear = scanner.nextInt();

        // Burçları temsil eden dizi
        String[] zodiac = {
                "Maymun",   // 0
                "Horoz",  // 1
                "Köpek",      // 2
                "Domuz",      // 3
                "Fare",      // 4
                "Öküz",       // 5
                "Kaplan",    // 6
                "Tavşan",   // 7
                "Ejderha",   // 8
                "Yılan",    // 9
                "At",    // 10
                "Koyun"      // 11
        };

        // Mod alma işlemiyle burç bulunur
        int index = birthYear % 12;
        String zodiacSign = zodiac[index];

        // Sonuç yazdırılır
        System.out.println("Çin zodyak burcunuz: " + zodiacSign);
    }
}
