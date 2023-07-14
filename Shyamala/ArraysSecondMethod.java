import java.util.Arrays;
class ArraysSecondMethod
{
public static void main(String[] args)
{
int i=0;
int[] numbers2 =new int[5];
System.out.println(Arrays.toString(numbers2));
numbers2[0] = 10;
numbers2[1] = 20;
numbers2[2] = 30;
numbers2[3] = 40;
numbers2[4] = 50;
System.out.println(Arrays.toString(numbers2));
for(i=0;i<=5;i++){
System.out.println(numbers2[i]);
}
}
}