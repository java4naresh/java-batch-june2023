class Animals
{
String animalType;
String nickname;
String color;
double weight;
double height;
public static void main(String[] args)
{
Animals animal = new Animals();
animal.animalType ="Rabbit";
animal.nickname ="chinnu";
animal.color = "white";
animal.weight =4.0;
animal.height =3.0;
System.out.println(animal);
}
public String toString(){
return "Animals[animalType="+animalType+", nickname="+nickname+", color="+color+", weight="+weight+", height="+height+"]";
}
}
