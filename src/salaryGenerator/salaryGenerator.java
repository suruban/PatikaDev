package salaryGenerator;

import java.util.Scanner;

public class salaryGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax = 0;
        double newSalary =0;
        double bonus = 0;
        double raise =0;

        System.out.print("Adı :");
        String name = scanner.nextLine();
        System.out.print("Maaş :");
        double salary = scanner.nextDouble();
        System.out.print("Çalışma Saati :");
        int clock = scanner.nextInt();
        System.out.print("Başlangıç Yılı :");
        int hireYear  = scanner.nextInt();

        if(salary > 1000) {
            tax = (double) (salary * 0.03);
            newSalary = salary - tax;
        }
        if(clock > 40) {
           bonus = (clock-40)*30;
           newSalary = newSalary + bonus;
        }
        if(2021-hireYear <10 ) {
            raise = (double) (salary * 0.05);
        }
        if(2021-hireYear >9 && 2021-hireYear <20 ) {
            raise = (double) (salary * 0.1);
        }
        if(2021-hireYear >19) {
            raise = (double) (salary * 0.15);
        }

        newSalary = newSalary + raise;
        System.out.println("Adı :" + name);
        System.out.println("Maaşı :" + salary +" TL");
        System.out.println("Çalışma Saati :" + clock);
        System.out.println("Başlangıç Yılı :" + hireYear);
        System.out.println("Vergi  :" + tax +" TL");
        System.out.println("Bonus :" + bonus +" TL");
        System.out.println("Maaş Artışı :" + raise + " TL");
        System.out.println("Vergi Ve Bonuslar İle Birlikte  :" + newSalary +" TL");
        System.out.println("Toplam :" + newSalary +" TL");
        System.out.println(newSalary);
        scanner.close();


    }
}
