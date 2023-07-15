class ModelVillages{
String villageName;
String mandal;
int population;


public static void main(String args[])
{
	ModelVillages village = new ModelVillages();
	village.villageName="Amaravathi";
	village.mandal="Dharanikota";
	village.population=2500;
	System.out.println(village);
}
	public String toString(){
 	return "Modelvillage[villageName="+villageName+", mandal="+mandal+", population="+population+"]";
}
}