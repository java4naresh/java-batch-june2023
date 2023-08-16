class MyString{
public static void main(String args[]){
String name="Srilatha";
char ch=name.charAt(0);
compareStrings("Srilatha","srilatha");
}


public static void compareStrings(String name1,String name2){
if(name1.equals(name2)){
System.out.println("Same");
}else 
System.out.println("not Same");

if(name1.equalsIgnoreCase(name2)){
System.out.println("Same");
}else 
System.out.println("not Same");
}

}
