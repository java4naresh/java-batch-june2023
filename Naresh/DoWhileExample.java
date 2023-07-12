class DoWhileExample 
{
	public static void main(String[] args) 
	{
		int watchingTime = 1;
		do
		{
			if(watchingTime == 1) {
			System.out.println("1st time movie watching is free");
			} else {
			System.out.println("to watch the movie again you have to buy ticket");
			}
         watchingTime++;
		}
		while (watchingTime <= 10);
	}
}
