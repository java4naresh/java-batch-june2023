package abstraction_examples;

public class Son extends Father {
	
	public void doActivityOnLand() {
		System.out.println("I will do Business");
	}
	
	public void profession() {
		System.out.println("I am a software engineer");
	}
	
	protected Father getName() {
		return new Father();
	}

}
