class Prime{
public static void main(String args[]){
int i=1,n=5,count=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
System.out.println("prime");
else
System.out.println("not prime");
}
}