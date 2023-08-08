public class NewAgeLogic extends OldTypeLogic {  
 public void printEvenNumbers(int start,int end) {

 while(start <= end) {
   int startIndex = 2;
   boolean flag = true;
   while(startIndex < start) {
     if(start % startIndex == 0) {
      flag = false;
       break;
   }
    startIndex++;
}
    if(flag) System.out.println(start);
    start++;
}
}
}
