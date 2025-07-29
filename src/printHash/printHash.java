package printHash;
import java.util.HashMap;
import java.util.Map;

public class printHash {
    public static void main(String[] args) {
        // String anahtar, Integer değer içeren HashMap oluşturuluyor
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // HashMap içeriğini yazdırmak için
        for (Map.Entry<String, Integer> i : scores.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}
