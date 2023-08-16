public class ContainsCheck3{
 public static void main (String[] args){
    String name = "Srinu";
      char ch = name.charAt(0);
      System.out.println(ch);
      System.out.println(name.length());
   containsCheck("My name is Srinu" , "Srinu");
  }

public static void containsCheck(String paragraph , String search) {
    if(paragraph.contains(search)) {
        System.out.println("available");
    }else System.out.println("not available");
    }
}