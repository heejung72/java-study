package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        System.out.println("JavaMemoryMain2");
        Data data1 = new Data(10);
        method2(data1);
    }

    public static void method2(Data data1){
        System.out.println("JavaMemoryMain2");
        
    }
}
