package poly.basic;

public class CastingMain6 {
    // java 16부터 instanceof를 사용하며 동시에 변수 선언 가능
    public static void main(String[] args) {
        Parent p1 = new Parent();
        call(p1);
        Parent p2 = new Child();
        call(p2);
    }

    private static void call (Parent parent){
        parent.parentMethod();
        // 어떤 Parent가 올지 모름
        // 다운캐스팅 child 생성
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
