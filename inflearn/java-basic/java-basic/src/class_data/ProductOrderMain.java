package class_data;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[2];

        productOrders[0] = new ProductOrder();
        productOrders[0].productName = "과자";
        productOrders[0].price = 50;
        productOrders[0].quantity=1;

        productOrders[1] = new ProductOrder();
        productOrders[1].productName="배";
        productOrders[1].price = 50;
        productOrders[1].quantity=1;

        int sum = 0;
        for (ProductOrder p : productOrders) {
            System.out.println(p.productName);
            System.out.println(p.price);
            System.out.println(p.quantity);
            sum += p.price * p.quantity;
        }

    }
}
