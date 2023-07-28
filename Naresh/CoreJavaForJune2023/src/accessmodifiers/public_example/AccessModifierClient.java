package accessmodifiers.public_example;

public class AccessModifierClient {

	public static void main(String[] args) {


		LogicalPrograms lp = new LogicalPrograms();
		lp.num = 10;
		lp.printPrimeNumbers(1, 10);
		System.out.println(lp.num);

	}

}
