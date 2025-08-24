package InnerClass;

public class Employee {
    private String firstName;
    private String lastName;

    private ContactInfo contactInfo;

    public Employee(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phoneNumber, email);
    }

    // Çalışanın iletişim bilgilerini döndüren metot
    public void showContactInfo() {
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Phone: " + contactInfo.phoneNumber);
        System.out.println("Email: " + contactInfo.email);
    }

    // İç sınıf (Inner Class) - ContactInfo
    private class ContactInfo {
        private String phoneNumber;
        private String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Taha", "Ceyhan", "123-456-7890", "taha.ceyhan@example.com");
        emp.showContactInfo();
    }
}
