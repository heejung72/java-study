package static1;

// 클래스변수 = 정적변수 = static 변수
// static 붕어빵 틀에서 관리함 -> 인스턴스 영역 (힙)에서 관리안하고 메서드 영역에서 관리함
public class Data3 {
    public String name;
    public static int count;

    public Data3(String name){
        this.name = name;
        count++; // (Data3.count++;)
    }

    // 인스턴스를 통해 접근할 수도 있고 -> 인스턴스 변수처럼 보이기때문에 비추비추비추비추
    // 클래스를 통해 접근할 수도 있는데 -> 가능 추천
}
