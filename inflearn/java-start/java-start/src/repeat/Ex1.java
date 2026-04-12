package repeat;

public class Ex1 {
    public static void main(String[] args) {
        int count = 0;
        while (count<10){
            System.out.println(++count);
        }

        for (count = 1 ;count <10; ++count){
            System.out.println(count);
        }
    }
}
