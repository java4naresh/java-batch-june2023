package polymorphism_examples;

public class Calculator {
	
	public int add(int num1, int num2) {
		System.out.println("add with 2");
		return num1+num2;
	}
	
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	public int add(int num1, int num2, int num3, int num4) {
		return num1+num2+num3+num4;
	}
	
	public String add() {
		return "Without Number  cannot add anything";
	}
	
	public String add(int num, String name) {
		return name+num;
	}

}
