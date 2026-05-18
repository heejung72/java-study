package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("program max 참여자 수 " +1000);
        int currentUserCount = 999;
    }

    private static void process(int currentUserCount) {
        if (currentUserCount > 1000) {
            System.out.println("대기자");
        } else {
            System.out.println("바로 참여");
        }
    }
}
