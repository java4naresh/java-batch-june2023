package inheritence;

import accessmodifiers.protected_example.LogicalPrograms;

public class DefaultAccessModifierCleint {

	public static void main(String[] args) {


		LogicalPrograms lp = new LogicalPrograms();
		lp.printPrimeNumbers(1, 10);
		System.out.println(lp.num);

	}

}
