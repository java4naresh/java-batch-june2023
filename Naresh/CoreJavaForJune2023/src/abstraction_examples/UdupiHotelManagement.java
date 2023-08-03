package abstraction_examples;

public class UdupiHotelManagement {
	
	public static UdupiHotel getUdupiHotelItemPricesBasedOnLocation(String location) {
		if(location.equals("Kukatpally")) {
			UdupiHotel kukatpally = new UdupiHotel(40, 50, 60, 80, "Kukatpally");
			return kukatpally;
		} else if(location.equals("Ameerpet")) {
			UdupiHotel ameerpet = new UdupiHotel(40, 50, 60, 80, "Ameerpet");
			return ameerpet;
		} else if(location.equals("Delhi")) {
			UdupiHotel delhi = new UdupiHotel(60, 80, 90, 100, "Delhi");
			return delhi;
		}
		return null;
	}

}
