public class OldTypeLogic {
 public void printEvenNumbers(int start,int end) {
  for (int i=start; i<=end; i++) {
    boolean flag = true;
    for(int j=2; j<i;j++) {
    if(i%j == 0) {
     flag = false;
     break;
    }
 }
  if (flag) System.out.println(i);
}
}
}
