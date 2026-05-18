package static1;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 접근 불가 instanceValue++;
        // 어떤 InstanceValue인지 알 수 없어서 -> 만약 생성자 넘겨주면 당연히 불러올 수 있음

         staticValue++;
         staticMethod();
    }

    public static void staticMethod(DecoData d1) {
        // 만약 생성자 넘겨주면 당연히 instance 불러올 수 있음

        d1.instanceValue++;
    }

    public void instanceMethod() {
        // 인스턴스 변수 접근 가능
        instanceValue++;
        //instanceMethod();

        // static 변수도 접근 가능 전자는 클래스명 생략
        staticValue++;
        DecoData.staticValue++;

        System.out.println("instanceMethod"+ instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticMethod" + staticValue);
    }
}
