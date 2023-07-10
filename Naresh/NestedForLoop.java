class NestedForLoop
{
	public static void main(String[] args) 
	{    // 1 1 <=5
		int num = 1;
		// 1 <= 5
		/*for(int i=1; i<=5; i++) {//5 * 5 = 25
		
		for(int j=1; j<=5; j++) {
		System.out.print(i);
		}
		System.out.println();
		}*/
		/*for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
		System.out.print(j);
		}
		System.out.println();
		}*/

		/*for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
		System.out.print("*");
		}
		System.out.println();
		}*/
        // i = 3
		for(int i=1; i<=5; i++) {
			// j = 2
		for(int j=1; j<=5; j++) {
			// 2 <= 3
            if(j <= i)
		    System.out.print("*");
		}
		System.out.println();
		}
	}
}
