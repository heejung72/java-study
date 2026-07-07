package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        this(a, 20); // 생성자 내꺼말고 다른 생성자 호출해줘
        // super(); // 기본 생성자 생성 생략 가능 -> 부모 호출 필요하긴 함
        System.out.println("ClassB "+ a);
    }

    public ClassB(int a, int b){
        super(); // 기본 생성자 생성 생략 가능 -> 부모 호출 필요하긴 함 (자바가 자동으로 해줌)
        System.out.println("ClassB a="+ a + "b ="+  b);
    }
}
