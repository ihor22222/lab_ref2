public class Bird {
    private Animal animal;

    public Bird() {
        this.animal = new Animal();
    }

    public void move() {
        this.animal.move(); // Викликаємо метод руху з класу Animal
    }
}  /*Потрібно було для другого завдання*/
