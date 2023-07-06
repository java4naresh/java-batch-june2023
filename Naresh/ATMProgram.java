class ATMProgram 
{
	public static void main(String[] args) 
	{
		int actualPinNo = 1234;
		int enteredPinNo = 1235;
		double enteredWithdrawAmount = 5050;
		double availableBalance = 5000;

		if(actualPinNo == enteredPinNo) {
		  System.out.println("Welcome to HDFC ATM!");
		  if(enteredWithdrawAmount <= availableBalance) {
			  if(enteredWithdrawAmount % 100 == 0) {
			   System.out.println("Take your amount");
			  } else {
			   System.out.println("Enter 100's only");
			  }
		  
		  } else {
		   System.out.println("Insuficient Funds");
		  }
		} else {
		  System.out.println("Entered Pin number is wrong!");
		}
	}
}
