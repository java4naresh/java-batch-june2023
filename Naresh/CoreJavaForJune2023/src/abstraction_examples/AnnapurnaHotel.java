package abstraction_examples;

public class AnnapurnaHotel implements HotelInterface, RestaurentInterface {
	
	public int idlyPrice() {
		return 40;
	}
	
	public int puriPrice() {
		return 45;
	}
	
	public int dosaPrice() {
		return 50;
	}
	
	public int chapathiPrice() {
		return 40;
	}
	
    public int chickenBiryaniPrice() {
    	return 150;
    }
	
	public int vegBiryaniPrice() {
		return 120;
	}
	
	public int frideRicePrice() {
		return 80;
	}
	
	public int noodlesPrice() {
		return 80;
	}


}
