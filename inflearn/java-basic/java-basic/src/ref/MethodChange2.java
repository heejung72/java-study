package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data a = new Data();
        a.value =10;
        System.out.println(a.value); // 10
        changeRef(a);
        System.out.println(a.value); // 20
    }
    public static void changeRef(Data d2) {
        d2.value = 20;
    }
}
