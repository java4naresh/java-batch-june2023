class Animals 
{
    String animalType;

	String nickname;

	double height;

	double weight;

	String color;

	//static String name = "Naresh";

	public Animals(String animalType, String nickname, double height, double weight, String color) {
	System.out.println("constructor");
	this.animalType = animalType;
	this.nickname = nickname;
	}

	public Animals(String animalType, String nickname) {
	this.animalType = animalType;
	this.nickname = nickname;
	
	
	}

	public Animals() {
	
	}



	public static void main(String[] args) 
	{
		//String name = "Naresh Kambala";
		//System.out.println(name);
		//Animals animal = new Animals();
		//Animals animal = new Animals("Dog", "Pandu", 3.0, 20.0, "Brown");
		Animals animal = new Animals("Dog", "Pandu");
        //animal.animalType = "Dog";
		//animal.nickname = "Pandu";
		//animal.height = 3.0;
		//animal.weight = 20.0;
		//animal.color = "Brown";
        System.out.println(animal);

		Animals animal2 = new Animals();
        animal2.animalType = "Cat";
		animal2.nickname = "Bujji";
		animal2.height = 2.0;
		animal2.weight = 5.0;
		animal2.color = "White";
		System.out.println(animal2);

		Animals animal3 = new Animals();
        System.out.println(animal3);
	}

	public String toString() {
	return "Animal[animalType="+animalType+", nick name ="+nickname+"]";
	}


}
