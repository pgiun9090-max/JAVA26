package Exem;
public class exem08 {
    private int face;

    public int roll() {
        this.face = (int) (Math.random() * 6) + 1;
        return face;
    }
}
