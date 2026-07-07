package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        // 이 electricCar가 가리키는 참조값(주소)는 하나지만 그 주소 내에는 Car, ElectricCar 둘 다 생긴다 !
        electricCar.move();
        // 호출 클래스 타입을 기준으로 메서드 확인 (car.charge()? electricCar.charge()?) 후자
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();
    }
}
