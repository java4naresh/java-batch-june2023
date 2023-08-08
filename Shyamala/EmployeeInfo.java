public class EmployeeInfo {
   
 private String name;
 private char gender ;
 private int age;
 private int Idno; 
 private float salary;
 private char experience;
 private String email ;
 
 public EmployeeInfo() {
        super();
 }

 public EmployeeInfo(String name, char gender, int age, int Idno, float salary, char experience, String phoneNumber) {
        super();
    this.name = name;   
    this.gender = gender; 
    this.age = age;
    this.Idno = Idno; 
    this.salary = salary;
    this.experience = experience;
    this.email = email;
}

 public String getname() {
    return this.name;
 }
 public void setname(String name) {
    this.name = name;
 }

 public char getgender() {
    return this.gender;
 }
 public void setgender(char gender) {
    this.gender = gender;
 }

 public int getage() {
    return this.age;
 }
 public void setage(int age) {
    this.age = age;
 }
 public int getIdno() {
    return this.Idno;
 }
 public void setIdno(int Idno) {
    this.Idno = Idno;
 }

 public float getsalary() {
    return this.salary;
 }
 public void setsalary(float salary) {
    this.salary = salary;
 }
 public char getexperience() {
    return this.experience;
 }
 public void setexperience(char experience) {
    this.experience = experience;
 }

 public String getemail() {
    return this.email;
 }
 public void setemail(String email) {
    this.email = email;
 }
public String toString() {
   return "CollegeInfo [name=" + name + ", gender=" + gender + ", age=" + age + ", Idno=" + Idno + ", salary= " + salary +", experience= " + experience+", email=" + email + "]";
}
}
}