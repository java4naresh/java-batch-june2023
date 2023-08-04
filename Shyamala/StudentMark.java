public class StudentMark{

	public static void main(String args[]){

	MarksSheet ms=new MarksSheet();
	System.out.println(ms.add(35,40));
	System.out.println(ms.add(20,78,90));
	System.out.println(ms.add());
	System.out.println(ms.add(15,11,98,56));
	System.out.println(ms.add("Marks of the list"));
	}
}