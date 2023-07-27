public class LatestCalculator extends Calculator {

	public int doSquareForTheGivenNumber(int num) {
		return num * num;
	}

	public int doCubeForTheGivenNumber(int num) {
		return num * num * num;
	}

	public int doMulBasedOnUserChoice(int number, int times) {
		int mul = number;
		for(int i=2; i<=times; i++) {
			mul = mul * mul;
		}
		return mul;
	}

}