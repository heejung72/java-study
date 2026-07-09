package poly.basic2;

import poly.basic.Child;
import poly.basic.Parent;

public class CastingMain1 {
    // 부모 변수가 자식 인스턴스를 참조함 (다형적 참조)
    Parent poly = new Child();
    // 자식 기능 호출 불가능
    /* poly.childMethod(); */
    // 다운캐스팅해도 poly의 타입이 변하는건 아니고, 복사해서 타입 바꿈


    // 다운 캐스팅 (부모 타입 -> 자식 타입)
    Child child = (Child) poly; // (child에 parent를 담는다?)
    // child.childMethod();
    // 어차피 주소 위치만 들어감
}
