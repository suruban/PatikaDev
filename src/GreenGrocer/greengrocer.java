

package GreenGrocer;

import java.util.Scanner;

public class greengrocer {
    public static void main(String[] args) {
        double pearCost = 2.14;
        double tomatoCost = 1.11;
        double bananaCost = 0.95;
        double aubergineCost = 5.00;
        double appleCost = 3.67;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo: ");
        double pearSelect = scanner.nextDouble();
        double pearTotal =  (double)pearSelect * (double)pearCost;
        System.out.printf("Tutar: %.2f TL\n", pearTotal);

        System.out.print("Elma Kaç Kilo: ");
        double appleSelect = scanner.nextDouble();
        double appleTotal =  (double)appleSelect * (double)appleCost;
        System.out.printf("Tutar: %.2f TL\n", appleTotal);

        System.out.print("Domates Kaç Kilo: ");
        double tomatoSelect = scanner.nextDouble();
        double tomatoTotal =  (double)tomatoSelect * (double)tomatoCost;
        System.out.printf("Tutar: %.2f TL\n", tomatoTotal);

        System.out.print("Muz Kaç Kilo: ");
        double bananaSelect = scanner.nextDouble();
        double bananaTotal =  (double)bananaSelect * (double)bananaCost;
        System.out.printf("Tutar: %.2f TL\n", bananaTotal);

        System.out.print("Patlıcan Kaç Kilo: ");
        double aubergineSelect = scanner.nextDouble();
        double aubergineTotal =  (double)aubergineSelect * (double)aubergineCost;
        System.out.printf("Tutar: %.2f TL\n", aubergineTotal);


        double totalCost = appleTotal+pearTotal+bananaTotal+aubergineTotal+tomatoTotal;
        System.out.println("Manav Alışverişi Tamamlandı");
        System.out.printf("Toplam: %.2f TL\n", totalCost);


        scanner.close();
    }
}
