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
}
	public String toString(){
	return "Bird[birdType="+birdType+", nickname="+nickname+", color="+color+", weight="+weight+", height="+height+"]";
}
}


class ModelVillages{
String villageName;
String mandal;
int population;
}

public static void main(String args[])
{
	ModelVillages village = new ModelVillages();
	village.villageName="Amaravathi";
	village.mandal="Dharanikota";
	village.population=2,500;
	System.out.println(village);
}
	public String toString(){
 	return"Modelvillage[villageName="+villageName+", mandal="+mandal+", population="+population+"]";
}
}
	