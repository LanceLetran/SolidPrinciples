# SolidPrinciples

Improve the following codes to implement SOLID principles in OOP.

public interface Order {

void calculateTotal(double price, int quantity);

void placeOrder(String customerName, String address);

void generateInvoice(String fileName);

void sendEmailNotification(String email); }

public class OrderAction implements Order {

@Override public void calculateTotal(double price, int quantity) { double total = price * quantity; System.out.println("Order total: $" + total); }

@Override public void placeOrder(String customerName, String address) { // Simulate placing order in a system System.out.println("Order placed for " + customerName + " at " + address); }

@Override public void generateInvoice(String fileName) { // Simulate generating invoice file System.out.println("Invoice generated: " + fileName); }

@Override public void sendEmailNotification(String email) { // Simulate sending email notification System.out.println("Email notification sent to: " + email); } }

public class OrderTest {

public static void main(String[] args) { Order order = new OrderAction(); order.calculateTotal(10.0, 2); order.placeOrder("John Doe", "123 Main St");

} }

# UML Diagram
<img width="651" alt="Screenshot 2024-05-05 at 8 28 23 PM" src="https://github.com/LanceLetran/SolidPrinciples/assets/142746735/de7d22dd-a106-4792-8fff-c651097f4f3f">
