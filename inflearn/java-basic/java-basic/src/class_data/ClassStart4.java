package class_data;

public class ClassStart4 {
    public static void main(String[] args) {
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

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        // Student[] students = new Student[] {"학생 ..."}; -> 직접적으로 값 넣어줄때는 배열의 크기 쓰지마

        System.out.println(students[0].name + " " + students[1].name + " " + students[0].age + " " + students[1].age + " " + students[0].grade + " " + students[1].grade);

        // students 가 길면?
        for (int i =0; i< students.length; i++) {
            Student s = students[i]; // 선언
            System.out.println(s.name + " " + s.age + " " + s.grade + " " + s.grade);
        }

        // for each 쓰자
        for (Student s : students){
                System.out.println(s.name + " " + s.age + " " + s.grade + " " + s.grade);
        }
        
    }
}
