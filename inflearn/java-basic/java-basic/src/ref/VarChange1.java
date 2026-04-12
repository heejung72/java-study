package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println(a); // 10
        System.out.println(b); // 10 -> 주소에있는 값을 복사해서 저장, 주소값저장아님

        a = 20;
        System.out.println(a); // 20
        System.out.println(b); // 10

        b = 30;
        System.out.println(a); // 20
        System.out.println(b); // 30
    }
}
