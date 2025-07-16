package trianglestar;

public class trianglestar {
    public static void main(String[] args) {
        String triangle = "*******************";  // 19 yıldız
        for (int i = 0; i <= triangle.length(); i += 2) {
            String sonuc = triangle.substring(0, triangle.length() - i);
            System.out.println(sonuc);
        }
    }
}
