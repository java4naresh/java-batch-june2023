package exception_handling_example;

public class ThrowExample {

	public static void main(String[] args) {
		Order order = new Order("Mobile", 2, null);
		try {
			placeOrder(order);
		} catch(InvalidOrderException ioe) {
			
		}
		
	}
	
	public static void placeOrder(Order order) {
		if(order != null && order.getAddress() != null) {
			System.out.println("order placed Successfully");
		} else {
			throw new InvalidOrderException("address is mandatory");
		}
	}
}