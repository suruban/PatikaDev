package pwControl;

import java.util.Scanner;

public class pwControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen şifrenizi giriniz: ");
        String password = scanner.nextLine();

        boolean isValid = true; // Geçerlilik durumu

        // 1. En az 8 karakter kontrolü
        if (password.length() < 8) {
            isValid = false;
        }

        // 2. Space karakteri içermemeli
        if (password.contains(" ")) {
            isValid = false;
        }

        // 3. İlk harf büyük harf olmalı
        if (password.length() > 0 && !Character.isUpperCase(password.charAt(0))) {
            isValid = false;
        }

        // 4. Son karakter '?' olmalı
        if (!password.endsWith("?")) {
            isValid = false;
        }

        // Sonucu yazdır
        if (isValid) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }

        scanner.close();
    }
}
