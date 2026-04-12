package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data d = null;
        d.value =10;
        System.out.println(d.value); // d가 null 따라서 null.value를 가져오는것
        // NPE
    }
}
