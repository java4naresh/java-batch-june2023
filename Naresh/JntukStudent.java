class JntukStudent 
{
	String name;
	int id;
	String branch;
	int age;
    JNTUKCollege college;


	public JntukStudent(String name, int id, String branch, int age, JNTUKCollege college) {
	this.name = name;
	this.id = id;
	this.age = age;
	this.branch = branch;
	this.college = college;	
	}

	public static void main(String[] args) 
	{
		JNTUKCollege nec = new JNTUKCollege("NEC", 100, 20, new String[]{"ECE,CSE,MECH"}, "Narasaraopet");
        JntukStudent naresh = new JntukStudent("Naresh", 451, "ECE", 30, nec);
        JntukStudent sathish = new JntukStudent("Sathish", 52, "CSE", 29, nec);
		JntukStudent srilatha = new JntukStudent("Srilatha", 10, "MECH", 25, nec);
		JntukStudent shyamala = new JntukStudent("Shyamala", 456, "ECE", 24, nec);
		System.out.println(naresh);
		System.out.println(sathish);
		System.out.println(srilatha);
		System.out.println(shyamala);
	}

	public String toString(){
	return "Student Information[studentName="+this.name+", studentId="+this.id+", studentBranch="+this.branch+"studentAge="+this.age+"studentCollege="+this.college+"]";
	}
}
