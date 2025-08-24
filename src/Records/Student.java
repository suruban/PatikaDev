package Records;

public record Student(String firstName, String lastName, String studentId) {


    public static void main(String[] args) {
        // Öğrenci nesnelerini oluşturuyoruz.
        Student student1 = new Student("Taha", "Ceyhan", "S12345");
        Student student2 = new Student("Murat", "Demir", "S67890");
        Student student3 = new Student("Taha", "Ceyhan", "S12345");

        // Öğrencilerin bilgilerini ekrana yazdırıyoruz.
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // equals metodu ile karşılaştırma yapıyoruz.
        System.out.println("student1 ve student2 eşit mi? " + student1.equals(student2));
        System.out.println("student1 ve student3 eşit mi? " + student1.equals(student3));

        // hashCode metodu ile karşılaştırma yapıyoruz.
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
    }
}
