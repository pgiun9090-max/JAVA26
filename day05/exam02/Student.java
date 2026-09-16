package exam02;

public class Student extends Person {
	int hakbun;
	
	public Student(String name, int age, int hakbun) {
		super(name, age);
		this.hakbun = hakbun;
	}
	
	@Override
	void show() {
		System.out.printf("학생[이름 : %s, 나이: %d, 학번 : %d]\n",name,age,hakbun);
	}

}
