package upcasting_downcasting_examples;

public class Daughter extends Father {
	
	String childType;
	
	public Daughter() {
		
	}
	
	public Daughter(String childType) {
		this.childType = childType;
	}
	
	public void m1() {
		System.out.println("Child Class m1()");
	}
	
	public void m3() {
		System.out.println("m3()");
	}
	
	public void m4() {
		System.out.println("m4()");
	}
	
	public void activityLand() {
		System.out.println("Business");
	}
	
	public void childActivity() {
		if(childType.equals("Elder")) super.activityLand();
		else this.activityLand();
	}

}
