package encapsulation_examples;

public class Customer {
	
	private String name;
	
	private char gender;
	
	private int age;
	
	private String email;
	
	private String phoneNumber;
	
	public Customer() {
		super();
	}

	public Customer(String name, char gender, int age, String email, String phoneNumber) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
	

}
