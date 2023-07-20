class Flowers3{
String flowername;
String flowercolor;

public Flowers3(){
System.out.println("Constructor");
}


public Flowers3(String flowername,String flowercolor){
this.flowername="lilly";
this.flowercolor="white";
}

public Flowers3(String flowername){
this.flowername="rose";
}


public static void main(String args[])
{
Flowers3 flower=new Flowers3("lilly","white");
System.out.println(flower);
}

public String toString(){
return "Flowers3[flowername="+flowername+", flowercolor="+flowercolor+"]";
}
}