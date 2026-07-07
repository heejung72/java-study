package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        // B에서 이미 생성자가 생성되어있음. 따라서, 기본 생성자 호출 불가하고,
        // 매개변수 넣어서 생성해줘야함.
        super(10, 20);
        System.out.println("ClassC");
    }
}
