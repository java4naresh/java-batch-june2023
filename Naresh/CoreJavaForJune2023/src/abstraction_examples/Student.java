package abstraction_examples;

public class Student {
	
	String name;
	
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String toString() {
		return "Student[name="+this.name+", age="+this.age+"]";
	}

}
