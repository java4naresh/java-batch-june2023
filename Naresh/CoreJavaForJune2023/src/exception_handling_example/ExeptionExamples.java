package exception_handling_example;

public class ExeptionExamples {
	
	

	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5};
		//arrayIndexOutOfBounds(arr);
		//System.out.println(arr[5]);//array index out of bounds exception
		//String name = null;
		//name.charAt(0);// null pointer exception
		
		//String name2 = "";
		//name.charAt(0);//StringIndexOutOfBoundsException
		
		//Calculator cal = null;
		//cal.add(10, 20);//NullPointerException
		//Bank bank = null;
		//System.out.println(bank.name);
		//bank.add(10, 20);//NullPointerException
		//nullPointerException(bank);
		
		//Calculator c2 = new Calculator();
		//c2.div(10, 0);//10/0 java.lang.ArithmeticException: / by zero
		//numberFormatException("451S");
		
		//System.out.println("My Name is Naresh");
		
		//System.out.println("My student name's is Srilatha, Shyamala and Sathish");
		Bank b = new Bank();
		SBIBank sbi = (SBIBank)b;

	}
	
	public static void arrayIndexOutOfBounds(int[] numbers) {
		//if(numbers != null && numbers.length >= 5 ) {
			System.out.println(numbers[5]);
		//}
	}
	
	public static void nullPointerException(Bank bank) {
		bank.add(10, 20);
	}
	
	public static void numberFormatException(String strNumber) {
		int num = Integer.parseInt(strNumber);
		System.out.println(num);
	}

}
