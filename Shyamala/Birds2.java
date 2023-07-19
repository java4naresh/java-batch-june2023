class Birds2
{
String birdtype;
String nickName;
String color;
double weight;
double height;

public static void main(String[] args)
{
Birds2 bird = new Birds2();
bird.birdtype = "parrot";
bird.nickName = "koo-koo";
bird.color = "green";
bird.weight = 2.0;
bird.height = 1.0;
System.out.println(bird);

Birds2 bird2 = new Birds2();
bird2.birdtype = "peacock";
bird2.nickName = "kollu";
bird2.color = "blue";
bird2.weight = 2.0;
bird2.height = 1.0;
System.out.println(bird2);

Birds2 bird3 = new Birds2();
bird3.birdtype = "pigeon";
bird3.nickName = "choopu";
bird3.color = "grey";
bird3.weight = 3.0;
bird3.height = 6.0;
System.out.println(bird3);

}
public String toString(){
return "Birds2[birdtype="+birdtype+",nickName="+nickName+",color="+color+",weight="+weight+",height="+height+"]";
}
}
