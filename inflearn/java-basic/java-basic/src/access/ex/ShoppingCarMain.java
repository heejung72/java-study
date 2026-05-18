package access.ex;

public class ShoppingCarMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item i1 = new Item("마늘", 2000, 2);
        Item i2 = new Item("상추", 1000, 3);

        cart.addItem(i1);
        cart.addItem(i2);

        cart.displayItems();
    }
}
