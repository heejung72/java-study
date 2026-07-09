package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        call(p1);
        Parent p2 = new Child();
        call(p2);
    }

        private static void call (Parent parent){
        parent.parentMethod();
            // 어떤 Parent가 올지 모름
            if (parent instanceof Child) {
                System.out.println("Child 인스턴스 맞음");
                Child child = (Child) parent;
                child.childMethod();
            }
    }
}

/*
new Parent() instanceof Parent // true
new Child() instanceof Parent // true
new Child() instanceof Child // true
new Parent() instanceof Child // false

 */
