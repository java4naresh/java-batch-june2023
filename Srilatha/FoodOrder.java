
import java.util.Arrays;
class FoodOrder
{
	static String RestaurantName;
	static{
	RestaurantName="SarwanaBhavan";
	}
 
	String itemName;
	int Quantity;
	String[]Flavour;
	String Address;
	
	public FoodOrder(String itemName,int Quantity,String[]Flavour,String Address){
	this.itemName =itemName;
	this.Quantity =Quantity;
	this.Flavour =Flavour;
	this.Address =Address;
	}

	public String toString(){
	return "FoodOrder[RestaurantName="+this.RestaurantName+",itemName="+this.itemName+",Quantity="+this.Quantity+",String[]Flavour="+Arrays.toString(this.Flavour)+",Address="+this.Address+"]";
	}
}