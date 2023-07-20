class Animals{
	String animalType;
	String nickName;

	public Animals(){
	System.out.println("Constructor");
	
	}

	public static void main(String args[])
	{
	Animals animal=new Animals();
	System.out.println(animal);
	}

	public String toString(){
	return "Animal[animalType="+animalType+",nickName="+nickName+"]";
}
}