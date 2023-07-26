
public class MultiLevelInheritenceClient {

	public static void main(String[] args) {
		// class members -> variables and methods
		/*A a = new A();
		a.printClassAName();*/
		//System.out.println(a.num);
		
		/*B b = new B();
		b.printClassAName();
		b.printClassBName();*/
		//System.out.println(b.num);
		
		C c = new C();
		System.out.println(c.num);
		c.printClassAName();
		c.printClassBName();
		c.printClassCName();
	}

}
