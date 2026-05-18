package static2;

public class MathArrayUtils {
    // 생성 못하게 하려면?
    // private
    private MathArrayUtils() {
    }

    public static int sum(int[] vs) {
        int sum = 0;
        for (int v : vs) {
            sum += v;
        }
        return sum;
    }

    public static int average(int[] vs) {
        // 이미 static에서 sum 구함
//        int sum = 0;
//        int count = 0;
//        for (int v : vs) {
//            sum += v;
//            count++;
//        }
//        return sum / count;

        return sum(vs) / vs.length;
    }

    public static int min(int[] vs) {
        int minValue = vs[0];
        for (int v : vs) {
            if (v < minValue) {
                minValue = v;
            }
        }
        return minValue;
    }

    public static int max(int[] vs) {
        int maxValue = vs[0];
        for (int v : vs) {
            if (v > maxValue) {
                maxValue = v;
            }
        }
        return 0;
    }
}
