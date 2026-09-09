package Exem;

public class exem07 {
    private int number;
    private String name;

    public exem07() {
        this.number = 7;
        this.name = "아이언";
    }

    public exem07(int number) {
        this.number = number;
        this.name = "아이언";
    }

    public exem07(String name) {
        this.number = 0;
        this.name = name;
    }

    public void print() {
        if (number > 0) {
            System.out.println(number + "번 " + name + "입니다.");
        } else {
            System.out.println(name + "입니다.");
        }
    }
}
