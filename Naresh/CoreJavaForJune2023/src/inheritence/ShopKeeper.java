package inheritence;

public class ShopKeeper {

	public static void main(String[] args) {
		ExtraCalculator ec = new ExtraCalculator();
		System.out.println(ec.add(10, 20));
		System.out.println(ec.doSubOn3Numbers(30, 10, 5));
		LatestCalculator lc = new LatestCalculator();
		System.out.println(lc.doMulBasedOnUserChoice(5, 1));
	}

}
