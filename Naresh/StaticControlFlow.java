class StaticControlFlow 
{
	static int legs = 4;

	static {
	System.out.println("static block");
	}

	public static void main(String[] args) 
	{
		StaticControlFlow scf = new StaticControlFlow();
        StaticControlFlow scf2 = new StaticControlFlow();
	}
}
