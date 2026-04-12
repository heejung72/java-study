package ref;

public class Method1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        initStudent(s1, "학생1", 20, 20);
        // 생략가능
//        s1.name = "학생1";
//        s1.age = 20;
//        s1.grade = 20;

        Student s2 = new Student();
        s2.name = "학생2";
        s2.age = 24;
        s2.grade = 90;

        printStudent(s1);
        printStudent(s2);
    }

    static void initStudent(Student s, String name, int age, int grade){
        s.name = name;
        s.age = age;
        s.grade = grade;
    }

    static void printStudent(Student s) {
        System.out.println(s.name + s.age + s.grade);
    }
}
