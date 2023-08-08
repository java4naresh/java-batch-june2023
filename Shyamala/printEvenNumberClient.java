public class printEvenNumberClient {
  
 public static void main(String[] args) {
   OldTypeLogic otl = new OldTypeLogic();
   otl.printEvenNumbers(1,20);
   NewAgeLogic nal = new NewAgeLogic();
   nal.printEvenNumbers(1,30);
}
}
