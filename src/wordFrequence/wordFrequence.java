package wordFrequence;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class wordFrequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> word = new HashMap<>();

        System.out.println("Enter the word: ");
        String wordString = scanner.nextLine();
        char[] wordArray = wordString.toCharArray();
        for (int i = 0; i < wordArray.length; i++) {
            if (word.containsKey(wordArray[i])) {
                int currentValue = word.get(wordArray[i]);
                word.put(wordArray[i], currentValue + 1);
            } else {
                word.put(wordArray[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> i : word.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
            
        }




    }
}
