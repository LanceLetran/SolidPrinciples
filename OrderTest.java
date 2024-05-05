public class OrderTest {

    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoice = new InvoiceAction();
        invoice.generateInvoice("order_123.pdf");

        NotificationService notificationService = new EmailNotificationService();
        notificationService.sendEmailNotification("johndoe@example.com");
    }
}
