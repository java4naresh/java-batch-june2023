package inheritence;

public class HirarchialClient {

	public static void main(String[] args) {
		Parent p = new Parent();
        p.doFarming();
        Child1 ch1 = new Child1();
        ch1.doFarming();
        Child2 ch2 = new Child2();
        ch2.doFarming();
        Child3 ch3 = new Child3();
        ch3.doFarming();
	}

}
