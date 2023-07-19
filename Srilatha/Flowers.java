class Flowers
{
	String flowerName;
	String flowerColor;
	
      public static void main(String args[])
	{
	Flowers flower=new Flowers();
	flower.flowerName="jasmine";
        flower.flowerColor="white";
	System.out.println(flower);


	Flowers flower2=new Flowers();
	flower2.flowerName="rose";
        flower2.flowerColor="red";
	System.out.println(flower2);

	Flowers flower3=new Flowers();
	flower3.flowerName="lilly";
        flower3.flowerColor="pink";
	System.out.println(flower3);

	Flowers flower4=new Flowers();
	flower4.flowerName="lotus";
        flower4.flowerColor="yellow";
	System.out.println(flower4);

	Flowers flower5=new Flowers();
	System.out.println(flower5);
     }

	public String toString(){
	return "Flowers[flowerName="+flowerName+",flowerColor="+flowerColor+"]";
     }
}