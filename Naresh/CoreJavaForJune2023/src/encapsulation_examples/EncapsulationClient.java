package encapsulation_examples;

public class EncapsulationClient {

	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println(customer);
		customer.setName("Naresh");
		customer.setAge(30);
		customer.setGender('M');
		customer.setEmail("java4naresh@gmail.com");
		customer.setPhoneNumber("91-9951288766");
		System.out.println(customer.getName());
		Customer customer2 = new Customer("Srilatha", 'F', 22,  "srilatha@gmail.com", "91-9936455654");
		System.out.println(customer2);
		customer2.setEmail("srilatha123@gmail.com");
		System.out.println(customer2);
	}

}
