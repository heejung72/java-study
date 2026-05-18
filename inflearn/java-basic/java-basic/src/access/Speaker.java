package access;

public class Speaker {
    // private 을 작성해 접근못하게 막음
     private int volume;

    Speaker (int volume){
        this.volume = volume;
    }
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("Volume is higher than 100");
        }
        else {
            volume+=10;
            System.out.println("Volume + 10");
        }
    }

    void volumeDown() {
        volume-=10;
        System.out.println("Volume - 10");
    }

    void showVolume(){
        System.out.println(volume);
    }
}
