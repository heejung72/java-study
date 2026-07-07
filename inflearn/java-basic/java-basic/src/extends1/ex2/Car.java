package extends1.ex2;

public class Car {
    // 부모는 자식을 모른다.
    // 부모는 자식에 접근할 수 없다.

    // 자바는 다중 상속을 금지한다.
    // 인터페이스는 다중 구현을 허용한다.
    public void move(){
        System.out.println("Car move");
    }
}
