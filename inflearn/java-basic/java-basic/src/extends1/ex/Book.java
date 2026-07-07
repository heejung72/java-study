package extends1.ex;

import lombok.Getter;

@Getter
public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, Integer price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public void print(){
        System.out.println("Book");
    }
}
