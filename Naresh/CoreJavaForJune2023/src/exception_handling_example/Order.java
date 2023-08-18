package exception_handling_example;

public class Order {
	
	String orderName;
	
	int orderQty;
	
	String address;

	public Order(String orderName, int orderQty, String address) {
		super();
		this.orderName = orderName;
		this.orderQty = orderQty;
		this.address = address;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderQty=" + orderQty + ", address=" + address + "]";
	}
	
	

}
