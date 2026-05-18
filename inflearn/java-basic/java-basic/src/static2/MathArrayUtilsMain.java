package static2;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        // 생성자 만들면 안됨.
        // MathArrayUtils mathArrayUtils = new MathArrayUtils();

        int[] values = {1, 2, 3, 4, 5};
        System.out.println(MathArrayUtils.sum(values));
        System.out.println(MathArrayUtils.average(values));
        System.out.println(MathArrayUtils.min(values));
        System.out.println(MathArrayUtils.max(values));
    }
}
