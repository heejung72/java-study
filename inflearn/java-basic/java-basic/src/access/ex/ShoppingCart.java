package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount == items.length) {
            System.out.println("장바구니 꽉 참");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("print");
        for (int i = 0; i< itemCount; i++) {
            System.out.println( items[i].getName() + items[i].getTotalPrice());
        }
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
