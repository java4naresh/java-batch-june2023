class Disciple
	{ 
	public static void main(String args[])
	{
	School Krishnaveni=new School("krishnaveni", 20, "23456789", "Narasaraopet", new String[]{"general","olympiad"});
	ClassRoom Second=new ClassRoom(200, 2, "General",400,Krishnaveni);
	System.out.println(Second);
	}
}