/*public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        vehicle.move(car); // Викликаємо метод move() для автомобіля
        vehicle.move(bicycle); // Викликаємо метод move() для велосипеда
    }
}
БУв потрібен для 3го завдання*/

/*public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Customer з вказаною особистою та контактною інформацією
        Customer customer = new Customer("Дудник", "Ігор", "123456789", "ihor.dudnyk22@gmail.com");

        // Виводимо інформацію про користувача
        System.out.println("Повне імя: " + customer.getFullName());
        System.out.println("Контакти: " + customer.getContactInfo());

        // Змінюємо контактну інформацію
        customer.changeContactInfo("987654321", "ihor.dudnyk22@gmail.com");

        // Виводимо оновлену контактну інформацію
        System.out.println("Загруженні контакти: " + customer.getContactInfo());
    }
} був потрібен для 4 завдання*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // Припустимо, що ми маємо об'єкт Product, який ми хочемо додати
        Product newProduct = new Product("Назва продукту", 10.99, 100);

        // Додаємо новий продукт
        productManager.addProduct(newProduct);

        // Додавання нового продукту з введенням від користувача
        addProductManually(productManager);

        // Припустимо, що ми хочемо видалити певний продукт
        Product productToRemove = getProductToRemove(productManager);

        // Видаляємо продукт, якщо він не є null
        if (productToRemove != null) {
            productManager.removeProduct(productToRemove);
        } else {
            System.out.println("Вказаний продукт не існує.");
        }

        // Припустимо, що ми хочемо отримати інформацію про певний продукт
        String productName = "Назва продукту";

        // Отримуємо інформацію про продукт
        Product productInfo = productManager.getProductInfo(productName);
        if (productInfo != null) {
            System.out.println("Інформація про продукт: " + productInfo.getName() +
                    ", Ціна: " + productInfo.getPrice() +
                    ", Кількість на складі: " + productInfo.getStockQuantity());
        } else {
            System.out.println("Вказаний продукт не знайдено.");
        }
    }

    // Метод для додавання продукту вручну з введенням від користувача
    private static void addProductManually(ProductManager productManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Додавання нового продукту. Введіть ім'я продукту:");
        String productName = scanner.nextLine();
        System.out.println("Введіть ціну продукту:");
        double price = scanner.nextDouble();
        System.out.println("Введіть кількість на складі:");
        int stockQuantity = scanner.nextInt();
        Product newProduct = new Product(productName, price, stockQuantity);
        productManager.addProduct(newProduct);
    }

    // Метод для отримання продукта для видалення
    private static Product getProductToRemove(ProductManager productManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву продукту для видалення:");
        String productName = scanner.nextLine();
        // Отримуємо продукт за назвою з ProductManager
        Product productToRemove = productManager.getProductInfo(productName);
        // Повертаємо продукт для видалення
        return productToRemove;
    }
}
 Був потрібен для 5го завдання */

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти Color
        Color redColor = new Color("Red");
        Color blueColor = new Color("Blue");

        // Створюємо об'єкти Shape з вказанням кольору
        Shape redCircle = new Shape("Circle", redColor);
        Shape blueCircle = new Shape("Circle", blueColor);

        // Друкуємо інформацію про фігури
        System.out.println("Red Circle: " + redCircle);
        System.out.println("Blue Circle: " + blueCircle);
    }
}


