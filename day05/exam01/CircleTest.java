package exam01;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10, "빨간색");
		
		c1.show();
		c2.show();
	}
}
