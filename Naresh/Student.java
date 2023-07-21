class Student 
{
    
	String studentName;

	int id;

	static int totalCount=50;

	static String schoolName="Krishnaveni";

    /*public Student(String studentName, int id) {
	
	
	}*/

	public Student() {

	}

	public static void main(String[] args) 
	{
		Student st1 = new Student();
		System.out.println(st1);
        /*st1.studentName = "Srilatha";
		st1.id = 1;
        System.out.println(st1.studentName);
		System.out.println(st1.id);
		System.out.println(st1.totalCount);
		System.out.println(st1.schoolName);
		Student st2 = new Student();
		System.out.println(st2.studentName);
		System.out.println(st2.id);
		System.out.println(st2.totalCount);
		System.out.println(st2.schoolName);
		Student st3 = new Student();
		System.out.println(st3.studentName);
		System.out.println(st3.id);
		System.out.println(st3.totalCount);
		System.out.println(st3.schoolName);
		st1.schoolName = "Vasavi";
		System.out.println(st1.totalCount);
		System.out.println(st1.schoolName);
		System.out.println(st2.totalCount);
		System.out.println(st2.schoolName);
		System.out.println(st3.totalCount);
		System.out.println(st3.schoolName);*/
	}

	public String toString() {
	return "Student[studentName="+studentName+", id ="+id+"]";
	}
}
