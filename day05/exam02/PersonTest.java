package exam02;

public class PersonTest {
	public static void main(String[] args) {
		Person[] psn = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("amy", 30, 200, "U.S.A")};
		
		for(Person p : psn){
			p.show();
		}
	}
}

