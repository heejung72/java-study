package static1;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello";
        DetoUtil util = new DetoUtil();

        util.deco(s);

        String s2 = DetoUtil2.deco(s);
        // 정적 메서드면 이렇게 바로 부르면 됨
    }
}
