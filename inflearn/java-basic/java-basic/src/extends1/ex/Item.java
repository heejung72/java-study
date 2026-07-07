package extends1.ex;

import lombok.Getter;

@Getter
public class Item {
    // Book Album Movie 세가지 클래스 존재
    // 공통 속성 name, price

    private String name;
    private Integer price;

    public Item(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void print(){
        System.out.println(name);
        System.out.println(price);
    }
}
