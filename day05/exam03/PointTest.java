package exam03;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p.toString());

        MovablePoint mp = new MovablePoint(5, 5, 100, 200);
        System.out.println(mp.toString());
    }
}