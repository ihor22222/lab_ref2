public class PersonalInformation {
    private String firstName;
    private String lastName;

    // Конструктор
    public PersonalInformation(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Методи доступу до полів
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Методи зміни даних
    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

