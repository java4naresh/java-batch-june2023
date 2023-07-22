class Calculator
{
public int add (int num1,int num2){
int sum = num1 + num2;
return sum;
}
public void addAndprint(int num1,int num2){
int sum = num1 + num2;
System.out.println(sum);
}
public static void main(String[] args)
{
Calculator calculator = new Calculator();
int sum = calculator.add(5,4);
System.out.println(sum);
sum = calculator.add(2,4);
System.out.println(sum);
}
}
