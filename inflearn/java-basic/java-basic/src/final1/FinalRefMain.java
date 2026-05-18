package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data; // 참조형
        data = new Data(); // 한번만 가능

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        data.value = 20;
    }
}
