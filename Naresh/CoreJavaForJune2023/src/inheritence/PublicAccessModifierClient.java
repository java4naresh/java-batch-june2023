package inheritence;

import accessmodifiers.public_example.LogicalPrograms;

public class PublicAccessModifierClient {

	public static void main(String[] args) {


		LogicalPrograms lp = new LogicalPrograms();
		lp.printPrimeNumbers(1, 10);
		System.out.println(lp.num);

	}


}
