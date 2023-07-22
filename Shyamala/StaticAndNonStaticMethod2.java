class StaticAndNonStaticMethod2
{
public int division(int num1, int num2){
int div = num1 % num2;
return div;
}
public static int staticdivision(int num1,int num2){
int div = num1 % num2;
return div;
}
public static void main(String[] args)
{
int mul = StaticAndNonStaticMethod2.staticdivision(2,20);
System.out.println(div);
}
}
   