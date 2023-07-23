import java.util.Arrays;

class Author 
{
	String name;
	int age;
	char gender;
	String[] otherPopularBooks;

	public Author(String name, int age, char gender, String[] otherPopularBooks) {
	  this.name = name;
	  this.age = age;
	  this.gender = gender;
	  this.otherPopularBooks = otherPopularBooks;
	}

	public String toString() {
	  return "Author Information[authorName="+this.name+", authorAge="+this.age+", authorgender="+gender+", authorBooks="+Arrays.toString(this.otherPopularBooks)+"]";
	}
}
