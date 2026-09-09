package Exem;

public class exem05 {
    private int length;

    public exem05(int length) {
        this.length = length;
    }

    public boolean isSameLine(exem05 target) {
        return this.length == target.length;
    }
}
