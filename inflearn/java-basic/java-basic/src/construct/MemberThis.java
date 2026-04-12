package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; // (this.nameField여도 괜찮고 아니여도 괜찮공)
        // 예전에는 this 필수로 작성하며 명확하게 보여줬음
        // 최근에는 this를 작성하는 것을 지향하지 않음 -> 어차피 IntelliJ가 잘 해줌

    }
}
