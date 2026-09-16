package exam02;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d]\n",name, age);
	}
}
