public class StudentData{



	private String name;

	private char gender;

	private int age;

	private String mothersName;

	private String fathersName;

	private String phoneNumber;

	public StudentData() {
		super();
	}

	public StudentData(String name, char gender, int age, String mothersName, String fathersName, String phoneNumber) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mothersName = mothersName;
		this.fathersName = fathersName;
		this.phoneNumber= phoneNumber;
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

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	
	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String toString() {
	return "StudentData [name=" + name + ", gender=" + gender + ", age=" + age + ", mothersName=" + mothersName + ", fathersName=" + fathersName + ", phoneNumber="
				+ phoneNumber + "]";
	}

	}



