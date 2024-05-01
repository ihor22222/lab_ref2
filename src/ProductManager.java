import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    // Оголошення та ініціалізація списку продуктів
    private List<Product> products = new ArrayList<>();

    // Метод для додавання продукту
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Додано продукт: " + product.getName());
    }

    // Метод для видалення продукту
    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Видалено продукт: " + product.getName());
    }

    // Метод для оновлення продукту
    public void updateProduct(Product product) {
        System.out.println("Оновлено інформацію про продукт: " + product.getName());
    }

    // Метод для отримання інформації про продукт за назвою
    public Product getProductInfo(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null; // Повертаємо null, якщо продукт не знайдено
    }
}
