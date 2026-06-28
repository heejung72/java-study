package final1;

public class Member {
    // final 키워드 사용
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name){
        // this.id = id; // 컴파일 오류 발생 (못 바꿔)
    }
}
