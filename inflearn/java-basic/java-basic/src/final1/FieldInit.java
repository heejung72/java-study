package final1;

public class FieldInit {
    static final int CONST = 10;
    // 얘는 항상 생성자가 어떻든 간에 이 값 고정
    final int value = 10;

    public FieldInit() {
        // this.value = value;
        // final 이기 때문에 생성자에서 값 바꾸기 안됨
    }
}
