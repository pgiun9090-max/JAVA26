package exam03;

public class MovablePoint extends Point {
	private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // 접근자 (Getter)
    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", 이동 속도: (" + xSpeed + ", " + ySpeed + ")";
    }
}
