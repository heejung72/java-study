package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data d = new Data();
        d.value = 10;
        Data d2 = d; // d2는 d의 주솟값을 복사해서 가져옴

        System.out.println(d); // d의 주소 x1
        System.out.println(d2); // d2의 주소 x2
        System.out.println(d.value); // 10
        System.out.println(d2.value); // 10 -> d.value의 주솟값을 복사해서 가져옴

        d.value = 20;
        System.out.println(d.value); // 20
        System.out.println(d2.value); // 20

        d2.value = 30;
        System.out.println(d.value); // 30 -> 왜냐면 d2의 value는 d.value의 주소를 가리킴 그 주소값의 값을 30으로 바꿈
        System.out.println(d2.value); // 30
    }
}
