class MyStringExamples2{
public static void main(String[] args) {

String myName2 = new String("Srilatha");
String myName3 = new String("Srilatha");
String myName4=new String("Srilatha");
if(myName2.equals(myName3)){
System.out.println("same");
}
if(myName2.equals(myName4)){
System.out.println("same");
}

myName2.intern();
if(myName2.equals(myName4)){
System.out.println("Same");
}
}
}