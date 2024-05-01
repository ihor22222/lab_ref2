// Клас користувача, який використовує окремі класи для особистої та контактної інформації
public class Customer {
    private PersonalInformation personalInfo;
    private ContactInformation contactInfo;

    // Конструктор
    public Customer(String firstName, String lastName, String phoneNumber, String email) {
        this.personalInfo = new PersonalInformation(firstName, lastName);
        this.contactInfo = new ContactInformation(phoneNumber, email);
    }

    // Методи доступу до інформації
    public String getFullName() {
        return personalInfo.getFirstName() + " " + personalInfo.getLastName();
    }

    public String getContactInfo() {
        return contactInfo.getPhoneNumber() + ", " + contactInfo.getEmail();
    }

    // Методи зміни даних
    public void changePersonalInfo(String firstName, String lastName) {
        personalInfo.changeName(firstName, lastName);
    }

    public void changeContactInfo(String phoneNumber, String email) {
        contactInfo.changeContactInfo(phoneNumber, email);
    }
}
