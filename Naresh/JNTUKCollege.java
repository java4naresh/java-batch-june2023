import java.util.Arrays;

class JNTUKCollege 
{
	static String universityName;

	static {
	universityName = "JNTUK";
	}

    String collegeName;

	int facultyCount;

	int libraryCount;

	String[] branches;

	String address;

	public JNTUKCollege(String collegeName, int facultyCount, int libraryCount, String[] branches, String address) {
	this.collegeName = collegeName;
	this.facultyCount = facultyCount;
	this.libraryCount = libraryCount;
	this.branches = branches;
	this.address = address;
	}

	public String toString() {
	return "College[universityName="+this.universityName+", collegeName="+this.collegeName+", facultyCount="+this.facultyCount+", libraryCount="+this.libraryCount+", branches="+Arrays.toString(this.branches)+", address="+this.address+"]";
	}
}
