package accessmodifiers.private_example;

 public class LogicalPrograms {
	
	private int num;
	
	private LogicalPrograms() {
		
	}
	
	public LogicalPrograms(String name) {
		
	}
	
	private void printPrimeNumbers(int startingNumber, int endingNumber) {
		
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
	
	public void print() {
		printPrimeNumbers(10, 20);
	}

}
