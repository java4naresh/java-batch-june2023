public class Conversion{
 public static void main (String[] args){
   
      String name = "syamala";
      char ch = name.charAt(0);
      System.out.println(ch);
      System.out.println(name.length());
   conversion("syamala","upper");
  }
 public static void conversion(String word , String action){
     if(action.equals("upper")){
     String convertedString = word.toUpperCase();
     System.out.println(convertedString);
     } else if(action.equals("lower")){
     String convertedString = word.toLowerCase();
     System.out.println(convertedString);
     } else {
     System.out.println(word);
}
}
}