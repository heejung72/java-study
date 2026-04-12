package class_data;

public class ClassStart3 {
    public static void main(String[] args) {
        // 객체 또는 인스턴스
        Student student1;
        student1 = new Student();
        student1.name="학생";
        student1.age=18;
        student1.grade=10;

        Student student2;
        student2 = new Student();
        student2.name="학생2";
        student2.age=19;
        student2.grade=20;

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student1.age);
        System.out.println(student2.age);
        System.out.println(student1.grade);
        System.out.println(student2.grade);

    }
}
