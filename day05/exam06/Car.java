package exam06;

public class Car extends Vehicle {
	int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    @Override
    void show() {
        System.out.println("색상: " + color + ", 속도: " + speed + ", 배기량: " + displacement + ", 기어 단수: " + gears);
    }
}
