package ArithmeticOps;

import java.util.Scanner;

public class ArithmeticOps {
    public static void main(String[] args) {
        int a = scanner(1);
        int b = scanner(2);
        int c = scanner(3);
        int value = a + b * c - b;
        System.out.print("İşlem Sonucu : " + value);
    }

    public static int scanner(int i) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean validInput;

        do {
            System.out.print("Lütfen " + i + ". sayıyı girin: ");
            try {
                value = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                scanner.nextLine(); // hatalı girdiyi temizle
                System.out.println("Lütfen geçerli bir formatta sayı giriniz !!!");
                validInput = false;
            }
        } while (!validInput);

        return value;
    }
}
