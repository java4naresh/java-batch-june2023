package upcasting_downcasting_examples;

public class CastingClient {

	public static void main(String[] args) {
		Daughter d = new Daughter();// object creation
		Father f = new Father();// object creation
		Father f2 = new Daughter();// up casting
        //Daughter d2 = new Father(); //this is not possible
		Daughter d3 = (Daughter)f2; // down casting
		f2.m1();// method calling
		d.m1();// method calling
		f.m1();// method calling
		d3.m1();// method calling
		
		Daughter d4 = new Daughter("Younger");
		d4.childActivity();//method calling
	}

}
