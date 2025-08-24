package Lambada;

import java.util.*;

public class Lambada {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        numbers.replaceAll(n -> n * 2);

        numbers.forEach(System.out::println);
    }
}
