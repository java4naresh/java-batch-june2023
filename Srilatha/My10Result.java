class My10Result{
public static void main(String args[])
{
System.out.println("enter marks");
int marks=600;
if (marks>=250&&marks<300){
System.out.println("student is passed with 3rd class");
}
if(marks>=300&&marks<350){
System.out.println("student is passed with 2nd class");
}
if(marks>=350&&marks<=450){
System.out.println("student is passed with 1st class");
}
if(marks>450&&marks<=550){
System.out.println("student is passed with distinction");
}
else
{
System.out.println("the student is failed");
}
}
}