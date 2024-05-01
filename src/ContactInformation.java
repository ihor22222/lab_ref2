public class ContactInformation {
    private String phoneNumber;
    private String email;

    // Конструктор
    public ContactInformation(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Методи доступу до полів
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Методи зміни даних
    public void changeContactInfo(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}