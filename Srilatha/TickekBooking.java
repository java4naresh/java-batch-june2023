class TickekBooking{
public static void main(String args[])
{
 byte seatno1 =129;
 short seatno2 =234;
 byte eachTicketPrice =150;
 byte quantity =2;
 short TotalPrice=eachTicketPrice*quantity;

System.out.println("Welcome to TicketBooking");
System.out.println("your TotalBooked tickets is "+quantity);
System.out.println("Each ticket price is "+eachTicketPrice);
System.out.println("Total booking cost is "+TotalPrice);
System.out.println("Your Seat numbers are "+seatno1+","+seatno2);
}



}