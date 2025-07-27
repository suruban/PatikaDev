package salaryGenerator;

public class salaryGenerator {
    // Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu Metot
    public salaryGenerator(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesabı
    public double tax() {
        if (this.salary < 1000) {
            return 0.0;
        } else {
            return this.salary * 0.03;
        }
    }

    // Bonus Hesabı
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0.0;
        }
    }

    // Maaş Artışı
    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // Bilgileri Yazdır
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = this.salary + raise;

        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus +
                "\nToplam Maaş : " + totalSalary;
    }
}
