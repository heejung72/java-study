package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    // 자기 자신의 데이터를 사용하기때문에
    // 매개변수를 받을 필요가 없다.
    void on() {
        isOn = true;
    }
    void off() {
        isOn = false;
    }
    void volumeUp() {
        volume++;
    }
    void volumeDown() {
        volume--;
    }
    void showStatus(){
        System.out.println(isOn);
    }
}
