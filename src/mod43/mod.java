package mod43;

import java.util.Scanner;

public class mod  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int num = scanner.nextInt();
        for(int i = 0; i <= num; i++){
            if(i%4==0 && i%3==0){
                System.out.println(i);
            }
        }
    }
}