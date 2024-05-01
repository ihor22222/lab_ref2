public class Order {
    private int orderId;
    private String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public void processOrder() {
        double temporaryField = 0; // Тимчасове поле перенесено до методу
        // Використання temporaryField
        System.out.println("Виконую обробку замовлення для клієнта: " + customerName);
    }

    public static void main(String[] args) {
        Order order = new Order(123, "Ігор");
        order.processOrder();
    }
}

/* був потрібний для першого завдання "Тимчасове поле" */
