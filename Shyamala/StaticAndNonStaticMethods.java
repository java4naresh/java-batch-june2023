class StaticAndNonStaticMethods
{
public int multiply(int num1, int num2){
int mul = num1*num2;
return mul;
}
public static int staticmultiply(int num1,int num2){
int mul = num1*num2;
return mul;
}
public static void main(String[] args)
{
     StaticAndNonStaticMethods sansm = new StaticAndNonStaticMethods ();
int mul = sansm.multiply(20,40);
System.out.println(mul);
}
}
