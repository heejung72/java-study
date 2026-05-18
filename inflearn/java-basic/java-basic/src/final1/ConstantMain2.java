package final1;

public class ConstantMain2 {
    public static final int MAX_USER = 1000;

    public static void main(String[] args) {
        System.out.println("program max 참여자 수 " + MAX_USER);
        int currentUserCount = 999;
    }

    private static void process(int currentUserCount) {
        if (currentUserCount > MAX_USER) {
            System.out.println("대기자");
        } else {
            System.out.println("바로 참여");
        }
    }
}
