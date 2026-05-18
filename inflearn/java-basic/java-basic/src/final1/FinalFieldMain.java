package final1;

public class FinalFieldMain {
    public static void main(String[] args){
        System.out.println("Hello World");

        // final 필드 생성자 초기화
        ConstructInit c = new ConstructInit(10);
        ConstructInit c2 = new ConstructInit(20);

        // final 필드 필드 초기화
        FieldInit f = new FieldInit();

        // 상수
        System.out.println(FieldInit.CONST) ;
    }
}
