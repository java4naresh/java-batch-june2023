package abstraction_examples;

public class SonFatherClient {

	public static void main(String[] args) {
		Son naresh = new Son();
		naresh.doActivityOnLand();
		naresh.profession();
		Father f = new Father();
		f.doActivityOnLand();
		f.profession();
	}

}
