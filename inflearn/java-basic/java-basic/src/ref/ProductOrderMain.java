package ref;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] p = new ProductOrder[3];
        p[0] = createOrder("사과", 1000, 1);
        p[1] = createOrder("배", 5000, 3);
        p[2] = createOrder("트윅스", 1000, 5);

        printOrders(p);
        System.out.println(getTotal(p));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder p = new ProductOrder();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;
        return p;
    }

    static void printOrders(ProductOrder[] os) {
        for(ProductOrder o : os) {
            System.out.println(o.productName + o.price + o.quantity);
        }
    }

    static int getTotal(ProductOrder[] os) {
        int total = 0;
        for (ProductOrder o : os) {
            total += o.price * o.quantity;
        }
        return total;
    }
}
