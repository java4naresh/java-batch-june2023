class StaticAndNonStaticMethod3
{
public int module(int num1, int num2){
int mol = num1 % num2;
return mol;
}
public static int staticmodule(int num1,int num2){
int mol = num1 % num2;
return mol;
}
public static void main(String[] args)
{
int mol = StaticAndNonStaticMethod3.staticmodule(20,5);
System.out.println(mol);
}
}
   