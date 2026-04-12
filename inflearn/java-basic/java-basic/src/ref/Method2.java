package ref;

public class Method2 {
    public static void main(String[] args) {

        //클래스 안에서 생성  -> 멤버 변수
        Student s1 = createStudent("학생1", 15, 90);
        Student s2 = createStudent("학생2", 16, 80);
        printStudent(s1);
        printStudent(s2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student s = new Student();
        s.name = name;
        s.age = age;
        s.grade = grade;
        return s; // main에서도 쓸 수 있음 !
    }

    static void printStudent(Student s) {
        // 지역 변수
        System.out.println(s.name + s.age + s.grade);
    }
}

