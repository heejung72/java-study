package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon = 0;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break; // break 문 없으면 case 3 으로 돌진함
            case 3:
                coupon = 3000;
                break;
        }
        System.out.println(coupon);
    }
}
