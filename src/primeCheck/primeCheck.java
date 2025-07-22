package primeCheck;

public class primeCheck {

    // Asal sayı kontrol metodu
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int input = scanner.nextInt();

        if (isPrime(input)) {
            System.out.println(input + " bir asal sayıdır.");
        } else {
            System.out.println(input + " bir asal sayı değildir.");
        }

        scanner.close();
    }
}
