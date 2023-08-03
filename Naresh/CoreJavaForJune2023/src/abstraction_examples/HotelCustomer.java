package abstraction_examples;

public class HotelCustomer {

	public static void main(String[] args) {
		//HotelInterface raghavendra = new RaghavendraHotel();
		//System.out.println(raghavendra.idlyPrice());\
		int idlyPiceForDelhiUdupi = UdupiHotelManagement.getUdupiHotelItemPricesBasedOnLocation("Delhi").idlyPrice();
		int idlyPiceForKukatpallyUdupi = UdupiHotelManagement.getUdupiHotelItemPricesBasedOnLocation("Kukatpally").idlyPrice();
		System.out.println(idlyPiceForDelhiUdupi);
		System.out.println(idlyPiceForKukatpallyUdupi);
		
		AnnapurnaHotel ri = new AnnapurnaHotel();
		System.out.println(ri.chickenBiryaniPrice());
	}

}
