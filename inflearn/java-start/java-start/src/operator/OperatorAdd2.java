package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b  = 0;
        b = ++a; // 전위
        System.out.println(a + "and" + b);

        a = 1; b =0;
        b = a++; // a를 b에 대입하고 증가시킴
        System.out.println(a + "and" + b);
    }
}
