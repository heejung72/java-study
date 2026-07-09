package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모는 자식을 담을 수 있음
        poly.parentMethod();
        // 자식이 부모를 담는 것은 불가능
        // Child child2 = new Parent();
        // Parent 타입이다 (자식 기능 호출 불가능)
        // poly.childMethod();

    }
}
