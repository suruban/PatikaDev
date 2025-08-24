package Enums;

import java.util.Scanner;

public class enums {

    public enum Day {
        SUNDAY("10:00 - 18:00"),
        MONDAY("09:00 - 17:00"),
        TUESDAY("09:00 - 17:00"),
        WEDNESDAY("09:00 - 17:00"),
        THURSDAY("09:00 - 17:00"),
        FRIDAY("09:00 - 17:00"),
        SATURDAY("10:00 - 18:00");

        private String workingHours;

        Day(String workingHours) {
            this.workingHours = workingHours;
        }

        public String getWorkingHours() {
            return this.workingHours;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gün girin (Örnek: MONDAY, TUESDAY, ...): ");
        String inputDay = scanner.nextLine().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(inputDay);
            System.out.println(selectedDay.name() + " için çalışma saatleri: " + selectedDay.getWorkingHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz bir gün girdiniz.");
        }

        scanner.close();
    }
}
