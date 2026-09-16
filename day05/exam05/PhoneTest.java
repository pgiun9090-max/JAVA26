package exam05;

public class PhoneTest {
	public static void main(String[] args) {
        Phone[] phones = {
            new Phone("황진이"),
            new Telephone("길동", "내일"),
            new Smartphone("민국", "갤러그")
        };

        for (Phone p : phones) {
            if (p instanceof Smartphone) {
                ((Smartphone) p).playGame();
            } else if (p instanceof Telephone) {
                ((Telephone) p).autoAnswering();
            } else if (p instanceof Phone) {
                p.talk();
            }
        }
    }
}
