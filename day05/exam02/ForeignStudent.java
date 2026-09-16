package exam02;

public class ForeignStudent extends Student {
	String nationality;
	
	public ForeignStudent(String name, int age, int hakbun, String nationality) {
		super(name, age, hakbun);
		this.nationality = nationality;
	}
	
	@Override
	void show() {
		System.out.printf("외국학생[이름: %s, 나이: %d, 학번: %d, 국적: %s]", name, age, hakbun, nationality);
	}

}
