class Armstrong
{
public static void main(String[] args)
{
int n=153,sum=0,temp,rem;
temp=n;
while(n>0)
{
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(temp==sum)
System.out.println("given no is Armstrong");
else
System.out.println("given no is not a Armstrong");
}
}
          


