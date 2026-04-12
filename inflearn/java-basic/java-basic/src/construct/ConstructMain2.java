package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("user1", 10, 90);
        MemberConstruct m2 = new MemberConstruct("user2", 15);

        MemberConstruct[] ms = {m1, m2};

        for (MemberConstruct m : ms){
            System.out.println(m.age + m.name + m.grade);
        }
    }
}
