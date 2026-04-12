package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
//        int volume = 0;
//        boolean isOn = false;

        MusicPlayerData d = new MusicPlayerData();

        d.isOn=true;
        System.out.println("음악 플레이어 시작");

        d.volume++;
        System.out.println(d.volume);

        d.volume++;
        System.out.println(d.volume);

        d.volume--;
        System.out.println(d.volume);

        if (d.isOn == true) {
            System.out.println("전원 켜져있음");
        }
        else {
            System.out.println("전원 꺼져있음");
        }

        d.isOn = false;
        System.out.println("전원 꺼져있음");
    }
}
