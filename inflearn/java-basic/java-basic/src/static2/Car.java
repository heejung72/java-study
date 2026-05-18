package static2;

public class Car {
    private static int count;
    private String name;

    public Car(String name) {
        System.out.println(name);
        this.name = name;
        count++;
    }

    public static void showTotalCars() {
        System.out.println(count);
    }
}
