package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("JavaMemoryMain1");
        method1(10);
        System.out.println("JavaMemoryMain1");
    }

    static void method1(int m1){
        int cal = m1*2;
        method2(cal);
    }

    static void method2(int m2){
        System.out.println("JavaMemoryMain1");
    }
}
