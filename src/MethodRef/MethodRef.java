package MethodRef;

import java.util.*;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep"));

        // Method reference ile liste elemanlarını yazdırma
        names.forEach(System.out::println);
    }
}
