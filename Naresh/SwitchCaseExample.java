class SwitchCaseExample 
{
	public static void main(String[] args) 
	{
		/*int day = 3;

		switch(day) {
		case 1: System.out.println("Today is Sunday"); break;
		case 2: System.out.println("Today is Monday"); break;
		case 3: System.out.println("Today is Tuesday"); break;
		case 4: System.out.println("Today is Wednesday"); break;
		case 5: System.out.println("Today is Thursday"); break;
		case 6: System.out.println("Today is Friday"); break;
		case 7: System.out.println("Today is Saturday"); break;
		default : System.out.println("Invalid");
		
		}*/

		
        String day = "Wednesday";
		switch(day) {
		case "Sunday": System.out.println(1); break;
		case "Monday": System.out.println(2); break;
		case "Tuesday": System.out.println(3); break;
		case "Wednesday": System.out.println(4); break;
		case "Thursday": System.out.println(5); break;
		case "Friday": System.out.println(6); break;
		case "Saturday": System.out.println(7); break;
		default : System.out.println("Invalid");
		
		}
	}
}
