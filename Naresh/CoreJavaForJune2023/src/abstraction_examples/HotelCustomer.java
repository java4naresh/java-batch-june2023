package abstraction_examples;

public class HotelCustomer {

	public static void main(String[] args) {
		HotelInterface raghavendra = new RaghavendraHotel();
		System.out.println(raghavendra.idlyPrice());
		HotelInterface udupi = new UdupiHotel();
		System.out.println(udupi.idlyPrice());
		
		AnnapurnaHotel ri = new AnnapurnaHotel();
		System.out.println(ri.chickenBiryaniPrice());
	}

}
