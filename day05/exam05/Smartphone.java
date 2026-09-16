package exam05;

public class Smartphone extends Telephone {
	private String game;

    public Smartphone(String owner, String game) {
        super(owner, "내일"); 
        this.game = game;
    }

    public Smartphone(String owner, String when, String game) {
        super(owner, when);
        this.game = game;
    }

    void playGame() {
        System.out.println(owner + "이가 " + game + " 게임을 하는 중이다.");
    }

}
