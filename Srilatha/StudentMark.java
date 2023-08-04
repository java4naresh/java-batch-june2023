public class StudentMark{

	public static void main(String args[]){

	MarksSheet ms=new MarksSheet();
	System.out.println(ms.add(20,30));
	System.out.println(ms.add(25,89,68));
	System.out.println(ms.add());
	System.out.println(ms.add(10,6,98,67));
	System.out.println(ms.add("Marks of the list"));
	}
}