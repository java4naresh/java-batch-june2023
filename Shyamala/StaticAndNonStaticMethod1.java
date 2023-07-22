class StaticAndNonStaticMethod1
{
public int Division(int num1, int num2){
int Div = num1 % num2;
return Div;
}
public static int staticDivision(int num1,int num2){
int Div = num1 % num2;
return Div;
}
public static void main(String[] args)
{
     StaticAndNonStaticMethod1 sansm1 = new StaticAndNonStaticMethod1 ();
int Div = sansm1.Division(50,5);
System.out.println(Div);
}
}