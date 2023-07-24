class ClassRoom
	{
	int classRoomCount;
	int Class;
	String campus;
	int studentCount;
	School school;

	public ClassRoom(int classRoomCount, int Class, String campus, int studentCount, School school){
	this.classRoomCount=classRoomCount;
	this.Class=Class;
	this.campus=campus;
	this.studentCount=studentCount;
	this.school=school;
	}

	public String toString(){
	return "ClassRoomInfo[classRoomCount="+this.classRoomCount+", Class="+this.Class+", campus="+this.campus+", studentCount="+this.studentCount+", school="+this.school+"]";
	}
}

	
	
	
