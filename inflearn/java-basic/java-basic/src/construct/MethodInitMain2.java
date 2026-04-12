package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("user1", 2, 10);
        MemberInit m2 = new MemberInit();
        m2.initMember("user2", 2, 20);
        MemberInit[] members ={m1,m2};

        for (MemberInit m : members) {
            System.out.println(m.name + m.age + m.grade);
        }
    }
}
