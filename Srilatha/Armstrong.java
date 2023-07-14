class Armstrong{
	public static void main(String args[])
	{
	int n=153,sum=0,temp,r;
	temp=n;
	while(n>0)
	{
	r=n%10;
	sum=sum+r*r*r;
	n=n/10;
	}
	if(temp==sum)
	System.out.println("Armstrong");
	else
	System.out.println("Not Armstrong");
	}
}