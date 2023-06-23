class ShortExample
{
	public static void main(String[] args) {
	
	short seatNo1 = 978;
	short seatNo2 = 979;
	short eachTicketPrice = 150;
	byte quantity = 2;
	short totalPrice = (short)(eachTicketPrice*quantity);


	System.out.println("Welcome to Bookmyshow");
    System.out.println("Your total booked tickets is "+ quantity);
    System.out.println("Each ticket price is "+eachTicketPrice);
    System.out.println("Total booking cost is "+totalPrice);
	System.out.println("Your seat numbers are "+seatNo1+","+seatNo2);
	}
}