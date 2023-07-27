public class Calculator2 {

	    public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
		}

		public void addAndPrint(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		}

		public int sub(int num1,int num2){
		return num1-num2;
		}

		public int mul(int num1,int num2){
		return num1*num2;
		}

		public int div(int num1,int num2){
		return num1/num2;
		}

		public static int addThreeNumbers(int num1, int num2, int num3) {
		return num1+num2+num3;
		}
}