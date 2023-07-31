package inheritence;

public class InheritenceFlowB extends InheritenceFlowA {
	
	/*public InheritenceFlowB() {
		this("Naresh");
		System.out.println("Child/Sub class");
	}*/
	
	public InheritenceFlowB(String name) {
		this("N", "S");
		System.out.println("Child/Sub class");
	}
	
	public InheritenceFlowB(String name, String name2) {
		//super("");
	}
	
	public void prepareForInterview() {
		// logic
		super.read();
	}

}
