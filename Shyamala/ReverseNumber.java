class ReverseNumber
{
public static void main(String[] args)
{
int num = 0;
int rev = 0;
for(num = 4564; num != 0; num =num/10){
int rem =num % 10;
rev = rev * 10 + rem;
System.out.println(rem);
}
System.out.println("reverse number is "+rev);
}
}