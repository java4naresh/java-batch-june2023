class Customer{
	String CustomerName;
	String Mobileno;
	FoodOrder Order;
	
	public Customer(String CustomerName,String Mobileno,FoodOrder Order){
	this.CustomerName =CustomerName;
	this.Mobileno =Mobileno;
	this.Order =Order;
	}

	public static void main(String args[]){
	FoodOrder ord=new FoodOrder("vegBiryani",2,new String[]{"spicy,Normal"},"Narasaraopet");
	FoodOrder ord2=new FoodOrder("PannerBiryani",2,new String[]{"spicy,Normal"},"Narasaraopet");
	FoodOrder ord3=new FoodOrder("kajuBiryani",2,new String[]{"spicy,Normal"},"Narasaraopet");

	Customer sai=new Customer("sai","45789",ord);
	Customer sri=new Customer("sri","457879",ord2);
	
	System.out.println(sai);
	System.out.println(sri);
	}
	
	public String toString(){
	return "Customer[name="+this.CustomerName+", mobileno="+this.Mobileno+", Order="+this.Order+"]";
	}
}
