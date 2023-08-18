package ExceptionHandling;

public class ThrowExample {

	
	public static void main(String[] args) {
	Order order = new Order("Moblile", 2, null);
	placeOrder(order);
	}
	
	public static void placeOrder(Order order) {
		if(order !=null && order.getAddress()!=null){
			System.out.println("order placed Succesfully");
		}else {
			throw new InvalidOrderException("address is mandatory");
		}
	}
	
}


