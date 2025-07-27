package multiplicationTable;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1-10 arasında sayı gir");
        int firstnum =scanner.nextInt();


        if(firstnum<10 && firstnum>0){
            for (int i = 1; i <= firstnum; i++) {
                for (int j = 1; j <= firstnum; j++) {
                    System.out.printf("%-4d", i*j);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Geçersiz bir sayı girdiniz");
        }
    }
}
