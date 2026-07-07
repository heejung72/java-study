package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 2; // 상속 관계 or 같은 패키지
        // defaultValue = 3; 다른 패키지 접근 불가, 컴파일 오류
        // privateValue = 0;

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        printParent(); // public -> printParent안에서는 본인 호출이니 내부 메서드 실행 된다.
    }
}
