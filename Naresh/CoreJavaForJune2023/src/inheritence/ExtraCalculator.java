package inheritence;

public class ExtraCalculator extends Calculator {

	public int multiply3Numbers(int num1, int num2, int num3) {
		
		return num1*num2*num3;
	}
	
	public int doSubOn3Numbers(int num1, int num2, int num3) {
		
		int sub1 = num1 - num2;
		int sub2 = num1 - num3;
		
		return sub1 - sub2;
	}
}
