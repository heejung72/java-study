package oop1.ex1;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;

    void printarea(){
        area = width * height;
        System.out.println("Area of rectangle is: " + area);
    }

    void printperimeter(){
        perimeter = (width + height) * 2;
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    void printsquare(){
        if(width == height){
            square = true;
            System.out.println(square);
        } else {
            square = false;
            System.out.println(square);
        }
    }

}
