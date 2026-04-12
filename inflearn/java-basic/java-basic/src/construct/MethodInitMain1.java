package construct;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.name = "user1";
        m1.age = 100;
        m1.grade = 100;

        MemberInit m2 = new MemberInit();
        m2.name = "user2";
        m2.age = 200;
        m2.grade = 200;

        MemberInit[] members ={m1,m2};

        for (MemberInit m : members) {
            System.out.println(m.name + m.age + m.grade);
        }
    }
    static void initMember(MemberInit m, String name, int age, int grade) {
        m.name = name;
        m.age = age;
        m.grade = grade;
    }
}
