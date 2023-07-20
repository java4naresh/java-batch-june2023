class Animals2{
	String animalType;
	String nickName;

	public Animals2(String animalType,String nickName){
	System.out.println("Constructor");
	this.animalType=animalType;
	this.nickName=nickName;
	}

	public static void main(String args[])
	{
	Animals2 animal2=new Animals2("cat","choco");
	System.out.println(animal2);
	}

	public String toString(){
	return "Animals2[animalType="+animalType+",nickName="+nickName+"]";
}
}