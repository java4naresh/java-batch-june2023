class AutoIncrement 
{
	public static void main(String[] args) 
	{
		/*int num = 10;
		System.out.println(num);//10
		++num;// pre increment
		//num++;//post increment
		System.out.println(num);//11
		++num;
		System.out.println(num);//12*/
		int num = 10;
        //System.out.println(++num);//11
		//System.out.println(num);//11
		//System.out.println(num++);//10
       // System.out.println(num);//11
		// 10 + 12 + 12
		System.out.println(num++ + ++num + num++);//34
		System.out.println(num);//13


	}
}
