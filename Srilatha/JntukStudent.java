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
		JNTUKCollege tec = new JNTUKCollege("TEC", 100, 20, new String[]{"ECE,CSE,MECH"}, "Narasaraopet");
        JntukStudent mani = new JntukStudent("MANI", 451, "CEC", 23, tec);
        JntukStudent harish = new JntukStudent("HARISH", 52 ,"CSE", 23, tec);
		JntukStudent sri = new JntukStudent("SrI", 10, "MECH", 25, tec);
		JntukStudent sai = new JntukStudent("SAI", 45, "ECE", 24, tec);
		System.out.println(mani);
		System.out.println(harish);
		System.out.println(sri);
		System.out.println(sai);
	}

	public String toString(){
	return "Student Information[studentName="+this.name+", studentId="+this.id+", studentBranch="+this.branch+",studentAge="+this.age+", studentCollege="+this.college+"]";
	}
}


