package extends1.overriding;

public class ElectricCar extends Car {

    // 상속받은 내용 자식이 조금 바꾸고 싶으면 overriding
    // 메서드 이름은 같지만 기능은 새롭게 사용할 것
    // annotation 필수는 아님 But, 권장
    // final, private method는 상속 오버라이딩 불가
    @Override
    public void move() {
        System.out.println("ElectricCar move");
    }
    public void charge() {
        System.out.println("Car charge");
    }
}
