class Animals 
{
    String animalType;

	String nickname;

	double height;

	double weight;

	String color;

	public static void main(String[] args) 
	{
		Animals animal = new Animals();
        animal.animalType = "Dog";
		animal.nickname = "Pandu";
		animal.height = 3.0;
		animal.weight = 20.0;
		animal.color = "Brown";
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
