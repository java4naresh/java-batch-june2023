package polymorphism_examples;

public class PrimeNumberClient {

	public static void main(String[] args) {
		OldTypeLogic otl = new OldTypeLogic();
		otl.printPrimeNumbers(1, 10);
        NewAgeLogic nal = new NewAgeLogic();
        nal.printPrimeNumbers(1, 10);
	}

}
