package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data d = null;
        System.out.println(d);
        d = new Data();
        System.out.println(d);
        d = null;
        System.out.println(d);
    }
}
