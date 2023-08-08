public class Student5 {

 private String name;
 private char gender;
 private int age;
 private int rollNo;
 private String phoneNumber;
 
 public Student5() {
        super();
 }

 public Student5(String name, char gender, int age, int rollno, String phoneNumber) {
        super();
    this.name = name;   
    this.gender = gender; 
    this.age = age;
    this.rollNo = rollNo;
    this.phoneNumber = phoneNumber;
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

 public int getrollNo() {
    return this.rollNo;
 }
 public void setrollNo(int rollNo) {
    this.rollNo = rollNo;
 }

 public String getphoneNumber() {
    return this.phoneNumber;
 }
 public void setphoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
 }
public String toString() {
   return "Student5 [name=" + name + ", gender=" + gender + ", age=" + age + ", rollNo=" + rollNo + ", phoneNumber=" + phoneNumber + "]";
}
}