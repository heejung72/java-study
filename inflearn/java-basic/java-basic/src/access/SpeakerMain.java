package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        System.out.println("volume 필드에 직접 접근하여 수정해봄");
        // speaker.volume = 200; -> 접근 불가 사유: private으로 접근제한걸어둠
        speaker.showVolume();
        // 200나옴 ㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷ

    }
}
