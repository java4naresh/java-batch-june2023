class ModelVillages{
String villagename;
String mondalname;
int villagepopulation;
int noofmale;
int nooffemale;
double pincode;
 
public static void main(String[] args)
{
ModelVillages village = new ModelVillages();
village.villagename="Nagireddypalem";
village.mondalname="Bellamkonda";
village.villagepopulation=3000;
village.noofmale=1400;
village.nooffemale=1600;
village.pincode=522411;
System.out.println(village);}
public String toString(){
return " ModelVillages[villagename="+villagename+",mondalname="+mondalname+",villagepopulation="+villagepopulation+",noof male="+noofmale+",nooffemale="+nooffemale+",pincode="+pincode+"]";
}
}
  










   