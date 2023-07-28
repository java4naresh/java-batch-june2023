package accessmodifiers.protected_example;

public class LogicalPrograms {
	
	protected int num;
	
	protected LogicalPrograms() {
		
	}
	
	protected void printPrimeNumbers(int startingNumber, int endingNumber) {
		
		for(int i = startingNumber; i<=endingNumber;i++) {
			boolean flag = true;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
				
			}
			if(flag) System.out.println(i);
		}
	}

}
