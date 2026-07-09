package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {


        // 부모 변수가 자식 인스턴스를 참조함 (다형적 참조)
        Parent poly = new Child();
        // 자식 기능 호출 불가능
        /* poly.childMethod(); */
        // 다운캐스팅해도 poly의 타입이 변하는건 아니고, 복사해서 타입 바꿈


        // 다운 캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly; // (child에 parent를 담는다?)
        child.childMethod();
        // 어차피 주소 위치만 들어감

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        ((Child)poly) .childMethod();

        // 다운 캐스팅 부모를 자식으로 만듦
        // 업 캐스팅 자식을 부모로 만듦
    }
}
