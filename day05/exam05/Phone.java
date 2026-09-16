package exam05;

public class Phone {
	protected String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    void talk() {
        System.out.println(owner + "이 통화 중이다.");
    }


}
