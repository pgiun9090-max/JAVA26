package bank.member;

public class Member {
	
	public static final char ADMIN = 'A';
	public static final char USER = 'U';
	
	private String id;
	private String password;
	private String name;
	private String email;
	private String mobile;
	
	private char type;
	
	
	public Member(String id, String password, String name, String email, String mobile, char type) {
		this.id = id;
		this.password = password;
		this.name= name;
		this.email = email;
		this.mobile = mobile;
		this.type = type;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public char getType() {
		return type;
	}



	public void setType(char type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "[" + id + ", " + password + ", " + name + ", " + email + ", " + mobile + ", "+ type + "]";
	}
	
	
	
}
