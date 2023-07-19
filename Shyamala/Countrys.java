class Countrys
	{
	String countryName;
	int states;
	int countrycode;
	int countryplace;
	double countrypopulation;
	String presidentname;


	public static void main(String[] args)
	{
	Countrys country = new Countrys();
	country.countryName = "India";
	country.states = 28;
	country.countrycode=32;
	country.countryplace = 7;
	country.countrypopulation = 140.76;
	country.presidentname =  "DroupadiMurmu";
	System.out.println(country);


	Countrys country2 = new Countrys();
	country2.countryName = "japan";
	country2.states = 45;
	country2.countrycode=4;
	country2.countryplace = 1;
	country2.countrypopulation = 14.76;
	country2.presidentname =  "Sampadh";
	System.out.println(country2);

	Countrys country3 = new Countrys();
	country3.countryName = "USA";
	country3.states = 67;
	country3.countryplace = 4;
	country3.countrypopulation = 1.76;
	country3.presidentname =  "kingjang";
	System.out.println(country3);
	}


	public String toString(){
	return "Countrys[countryName="+countryName+",states="+states+",countrycode="+countrycode+",countryplace="+countryplace+",countrypopulation="+countrypopulation+"]";
	}
}
