package genericMethod;
// Generic method (primitive değer atayamazsın)
public class Box {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
