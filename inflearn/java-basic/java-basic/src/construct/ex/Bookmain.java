package construct.ex;

public class Bookmain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayInfo();

        Book b2 = new Book("Hello Java", "Seo");
        b2.displayInfo();

        Book b3 = new Book("JPA Programming", "KIM", 800);
        b3.displayInfo();
    }
}
