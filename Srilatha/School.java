import java.util.Arrays;
	
	class School
	{ 
	String schoolName;
	int teachers;
	String contactno;
	String address;
	String[]standards;

	
	public School(String schoolName,int teachers,String contactno,String address,String[]standards){
	this.schoolName=schoolName;
	this.teachers=teachers;
	this.contactno=contactno;
	this.address=address;
	this.standards=standards;
	}
	
	public String toString(){
	return "SchoolInformation[schoolName="+this.schoolName+", teachers="+this.teachers+", contactno="+this.contactno+", address="+this.address+", 	standards="+Arrays.toString(this.standards)+"]";
	}
}


