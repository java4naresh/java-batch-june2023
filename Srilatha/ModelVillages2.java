class ModelVillages2
{
	String villageName;
	String mandalName;
	int villagePopulation;
	int maleno;
	int femaleno;
	double pincode;

	public static void main(String[] args)
	{
	ModelVillages2 village = new ModelVillages2();
	village.villageName="Nagireddypalem";
	village.mandalName="Bellamkonda";
	village.villagePopulation=3000;
	village.maleno=1400;
	village.femaleno=1600;
	village.pincode=522411;
	System.out.println(village);

	ModelVillages2 village2 = new ModelVillages2();
	village2.villageName="Reddypalem";
	village2.mandalName="Nakarikallu";
	village2.villagePopulation=6000;
	village2.maleno=3000;
	village2.femaleno=2400;
	village2.pincode=522416;
	System.out.println(village2);

	ModelVillages2 village3 = new ModelVillages2();
	village3.villageName="Nrt";
	village3.mandalName="Nrt";
	village3.villagePopulation=3000;
	village3.maleno=1400;
	village3.femaleno=1800;
	village3.pincode=522601;
	System.out.println(village3);
	}

	public String toString(){
	return "ModelVillages2[villageName="+villageName+",mandalName="+mandalName+",villagePopulation="+villagePopulation+",maleno="+maleno+",femaleno="+femaleno+"pincode="+pincode+"]";
}
}