package extends1.ex;

import lombok.Getter;

@Getter
public class Album extends Item{
    private String artist;

    public Album(String name, Integer price, String artist){
        super(name, price);
        this.artist = artist;
    }

    public void print(){
        System.out.println("Album");
    }
}
