package abstraction_examples;

public class UdupiHotel implements HotelInterface {
	
	int idlyPrice;
	
	int puriPrice;
	
	int dosaPrice;
	
	int chapathiPrice;
	
	String location;
	
	public UdupiHotel(int idlyPrice, int puriPrice, int dosaPrice, int chapathiPrice, String location) {
		this.idlyPrice = idlyPrice;
		this.puriPrice = puriPrice;
		this.dosaPrice = dosaPrice;
		this.chapathiPrice = chapathiPrice;
		this.location = location;
	}
	
	public int idlyPrice() {
		return this.idlyPrice;
	}
	
	public int puriPrice() {
		return this.puriPrice;
	}
	
	public int dosaPrice() {
		return this.dosaPrice;
	}
	
	public int chapathiPrice() {
		return this.chapathiPrice;
	}
	
	public int udupiSplItemPrice() {
		return 100;
	}

}
