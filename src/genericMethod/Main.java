package genericMethod;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Integer[] integerArray = new Integer[]{1, 2, 3, 4, 5};
        Box.printArray(integerArray);
        String[] stringArray = new String[]{"Java ", "Generics ", "Ödev"};
        Box.printArray(stringArray);



    }
}
