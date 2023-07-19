class Birds
{
	String birdType;
	String nickname;
        String color;
	double weight;
	double height;

	
public static void main(String args[])
{
	Birds bird = new Birds();
	bird.birdType = "parrot";
	bird.nickname = "koo-koo";
	bird.color = "green";
	bird.weight = 2.0;
	bird.height = 1.0;
	System.out.println(bird);

	Birds bird2 = new Birds();
	bird2.birdType = "peacock";
	bird2.nickname = "kollu";
	bird2.color = "blue";
	bird2.weight = 2.0;
	bird2.height = 1.0;
	System.out.println(bird2);


	Birds bird3 = new Birds();
	bird3.birdType = "pigeon";
	bird3.nickname = "choopu";
	bird3.color = "grey";
	bird3.weight = 3.0;
	bird3.height = 6.0;
	System.out.println(bird3);

}
	public String toString(){
	return "Bird[birdType="+birdType+", nickname="+nickname+", color="+color+", weight="+weight+", height="+height+"]";
}
}



	