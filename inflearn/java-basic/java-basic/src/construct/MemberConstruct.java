package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가
    MemberConstruct(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 50;

        // 동일코드
        // this(name,age,50);
        // 이거는 생성자의 첫번째 줄에만 작성 가능함
    }

    // 생성자는 클래스 이름과 동일
    // 반환메서드 없음
    MemberConstruct(String name, int age, int grade) {
        System.out.println(name + age + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
